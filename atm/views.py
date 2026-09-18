from decimal import Decimal
from django.contrib import messages
from django.contrib.auth import authenticate, login, logout
from django.contrib.auth.decorators import login_required
from django.contrib.auth.hashers import check_password, make_password
from django.contrib.auth.models import User
from django.db import transaction
from django.shortcuts import get_object_or_404, redirect, render
from .forms import LoginForm, TransferForm, AmountForm, PinForm
from .models import Account, Transaction

def login_view(request):
    if request.user.is_authenticated:
        return redirect("dashboard")
    form = LoginForm(request.POST or None)
    if request.method == "POST" and form.is_valid():
        user = authenticate(username=form.cleaned_data["username"], password=form.cleaned_data["password"])
        if user:
            login(request, user)
            return redirect("dashboard")
        messages.error(request, "Invalid username or password.")
    return render(request, "login.html", {"form": form})

@login_required
def dashboard(request):
    account = get_object_or_404(Account, user=request.user)
    return render(request, "dashboard.html", {"account": account, "transactions": account.transactions.all()[:5]})

@login_required
def deposit(request):
    account = get_object_or_404(Account, user=request.user)
    form = AmountForm(request.POST or None)
    if request.method == "POST" and form.is_valid():
        amount = form.cleaned_data["amount"]
        with transaction.atomic():
            account.balance += amount
            account.save(update_fields=["balance"])
            Transaction.objects.create(account=account, transaction_type="DEPOSIT", amount=amount, balance_after=account.balance, description="Cash deposit")
        messages.success(request, f"₹{amount:.2f} deposited successfully.")
        return redirect("dashboard")
    return render(request, "transaction.html", {"form": form, "title": "Cash Deposit", "button": "Deposit"})

@login_required
def withdraw(request):
    account = get_object_or_404(Account, user=request.user)
    form = AmountForm(request.POST or None)
    if request.method == "POST" and form.is_valid():
        amount = form.cleaned_data["amount"]
        if amount > account.balance:
            messages.error(request, "Insufficient balance.")
        else:
            with transaction.atomic():
                account.balance -= amount
                account.save(update_fields=["balance"])
                Transaction.objects.create(account=account, transaction_type="WITHDRAWAL", amount=amount, balance_after=account.balance, description="Cash withdrawal")
            messages.success(request, f"₹{amount:.2f} withdrawn successfully.")
            return redirect("dashboard")
    return render(request, "transaction.html", {"form": form, "title": "Cash Withdrawal", "button": "Withdraw"})

@login_required
def transfer(request):
    account = get_object_or_404(Account, user=request.user)
    form = TransferForm(request.POST or None)
    if request.method == "POST" and form.is_valid():
        target_no = form.cleaned_data["account_number"]
        amount = form.cleaned_data["amount"]
        target = Account.objects.filter(account_number=target_no).exclude(pk=account.pk).first()
        if not target:
            messages.error(request, "Recipient account not found.")
        elif amount > account.balance:
            messages.error(request, "Insufficient balance.")
        else:
            with transaction.atomic():
                account.balance -= amount
                target.balance += amount
                account.save(update_fields=["balance"])
                target.save(update_fields=["balance"])
                Transaction.objects.create(account=account, transaction_type="TRANSFER_OUT", amount=amount, balance_after=account.balance, description=f"Transfer to {target.account_number}")
                Transaction.objects.create(account=target, transaction_type="TRANSFER_IN", amount=amount, balance_after=target.balance, description=f"Transfer from {account.account_number}")
            messages.success(request, "Transfer completed successfully.")
            return redirect("dashboard")
    return render(request, "transaction.html", {"form": form, "title": "Fund Transfer", "button": "Transfer"})

@login_required
def transactions(request):
    account = get_object_or_404(Account, user=request.user)
    return render(request, "transactions.html", {"account": account, "transactions": account.transactions.all()})

@login_required
def change_pin(request):
    account = get_object_or_404(Account, user=request.user)
    form = PinForm(request.POST or None)
    if request.method == "POST" and form.is_valid():
        if not check_password(form.cleaned_data["old_pin"], account.pin_hash):
            messages.error(request, "Current PIN is incorrect.")
        else:
            account.pin_hash = make_password(form.cleaned_data["new_pin"])
            account.save(update_fields=["pin_hash"])
            messages.success(request, "PIN changed successfully.")
            return redirect("dashboard")
    return render(request, "transaction.html", {"form": form, "title": "Change ATM PIN", "button": "Change PIN"})

@login_required
def logout_view(request):
    logout(request)
    return redirect("login")
