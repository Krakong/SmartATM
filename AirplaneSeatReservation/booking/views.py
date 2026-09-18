import random,string
from django.contrib import messages
from django.contrib.auth import authenticate,login,logout
from django.contrib.auth.decorators import login_required
from django.shortcuts import get_object_or_404,redirect,render
from .models import Flight,Seat,Booking

def home(request): return render(request,'home.html',{'flights':Flight.objects.order_by('departure')})
def flight_detail(request,flight_id):
 f=get_object_or_404(Flight,id=flight_id); return render(request,'flight_detail.html',{'flight':f,'seats':f.seats.order_by('seat_number')})
@login_required
def book_seat(request,seat_id):
 s=get_object_or_404(Seat,id=seat_id)
 if request.method=='POST' and not s.is_booked:
  name=request.POST.get('passenger_name','').strip()
  if name:
   Booking.objects.create(user=request.user,flight=s.flight,seat=s,passenger_name=name,booking_code=''.join(random.choices(string.ascii_uppercase+string.digits,k=10)))
   s.is_booked=True;s.booked_by=request.user;s.save();messages.success(request,'Seat booked successfully.');return redirect('my_bookings')
 return render(request,'book_seat.html',{'seat':s})
@login_required
def my_bookings(request): return render(request,'my_bookings.html',{'bookings':Booking.objects.filter(user=request.user).select_related('flight','seat')})
def login_view(request):
 if request.method=='POST':
  u=authenticate(request,username=request.POST.get('username'),password=request.POST.get('password'))
  if u: login(request,u);return redirect('home')
  messages.error(request,'Invalid username or password.')
 return render(request,'login.html')
def logout_view(request): logout(request);return redirect('home')
