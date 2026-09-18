from django.urls import path
from . import views
urlpatterns=[path('',views.home,name='home'),path('flight/<int:flight_id>/',views.flight_detail,name='flight_detail'),path('book/<int:seat_id>/',views.book_seat,name='book_seat'),path('my-bookings/',views.my_bookings,name='my_bookings'),path('login/',views.login_view,name='login'),path('logout/',views.logout_view,name='logout')]
