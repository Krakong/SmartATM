from django.contrib.auth.models import User
from django.db import models
class Flight(models.Model):
 flight_number=models.CharField(max_length=20,unique=True)
 airline=models.CharField(max_length=80)
 origin=models.CharField(max_length=80)
 destination=models.CharField(max_length=80)
 departure=models.DateTimeField()
 arrival=models.DateTimeField()
 price=models.DecimalField(max_digits=10,decimal_places=2)
 def __str__(self): return f'{self.flight_number} - {self.origin} to {self.destination}'
class Seat(models.Model):
 flight=models.ForeignKey(Flight,on_delete=models.CASCADE,related_name='seats')
 seat_number=models.CharField(max_length=5)
 is_booked=models.BooleanField(default=False)
 booked_by=models.ForeignKey(User,null=True,blank=True,on_delete=models.SET_NULL)
 class Meta: constraints=[models.UniqueConstraint(fields=['flight','seat_number'],name='unique_flight_seat')]
class Booking(models.Model):
 user=models.ForeignKey(User,on_delete=models.CASCADE)
 flight=models.ForeignKey(Flight,on_delete=models.CASCADE)
 seat=models.OneToOneField(Seat,on_delete=models.PROTECT)
 passenger_name=models.CharField(max_length=120)
 booking_code=models.CharField(max_length=12,unique=True)
 booked_at=models.DateTimeField(auto_now_add=True)
 status=models.CharField(max_length=12,default='CONFIRMED')
