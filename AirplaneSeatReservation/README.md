# Airplane Seat Reservation System

Full-stack flight reservation application built with Python and Django.

### Features
- Flight search/listing with route, airline, timing and fare
- Interactive seat map showing available and booked seats
- User authentication and protected booking workflow
- Passenger booking confirmation with unique booking code
- My Bookings dashboard
- Database-backed flights, seats and bookings
- Django admin for managing flight inventory
- Responsive frontend for desktop and mobile

### Stack
Python, Django, SQLite, HTML5, CSS3, JavaScript

### Run
1. Create a virtual environment and install `requirements.txt`.
2. Run `python manage.py migrate`.
3. Run `python manage.py createsuperuser`.
4. Run `python manage.py runserver`.
5. Add flights and seats through `/admin/`, then open the home page.
