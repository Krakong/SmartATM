from django.contrib import admin
from .models import Flight,Seat,Booking
admin.site.register([Flight,Seat,Booking])
