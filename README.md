# Smart ATM

A full-stack ATM simulation built with Django, SQLite, HTML, CSS, JavaScript, and Bootstrap.

## Features
- User registration and login
- Hashed ATM PIN authentication
- Balance inquiry
- Cash deposit and withdrawal
- Fund transfer
- Transaction history
- Change PIN
- Responsive ATM-style dashboard
- Django admin support

## Run locally

```bash
python -m venv venv
# Windows
venv\Scripts\activate
# macOS/Linux
source venv/bin/activate

pip install -r requirements.txt
python manage.py migrate
python manage.py createsuperuser
python manage.py runserver
```

Open http://127.0.0.1:8000/

For a demo account, register through the web interface. Never use a real banking PIN or real financial data.
