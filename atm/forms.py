from django import forms
from django.contrib.auth.models import User
from .models import Account

class LoginForm(forms.Form):
    username = forms.CharField()
    password = forms.CharField(widget=forms.PasswordInput)

class TransferForm(forms.Form):
    account_number = forms.CharField(max_length=16)
    amount = forms.DecimalField(min_value=1, decimal_places=2, max_digits=12)

class AmountForm(forms.Form):
    amount = forms.DecimalField(min_value=1, decimal_places=2, max_digits=12)

class PinForm(forms.Form):
    old_pin = forms.CharField(min_length=4, max_length=6, widget=forms.PasswordInput)
    new_pin = forms.CharField(min_length=4, max_length=6, widget=forms.PasswordInput)
