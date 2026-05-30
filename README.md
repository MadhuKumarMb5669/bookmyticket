# BookMyTicket - Spring Boot + Thymeleaf + MySQL

## Default Login
User: `9123456789` / `@123654`  
Admin: `admin` / `admin@123`

## URLs
Home: `http://localhost:8080/`  
User Login: `http://localhost:8080/user/login`  
Admin Login: `http://localhost:8080/admin/login`

## Run in VS Code
1. Install Java 21 and MySQL.
2. Open MySQL and create database:
   ```sql
   CREATE DATABASE bookmyticket_db;
   ```
3. Open this folder in VS Code.
4. Edit `src/main/resources/application.properties` if your MySQL password is not `root`.
5. Run:
   ```powershell
   .\mvnw.cmd spring-boot:run
   ```
6. Open `http://localhost:8080/`.

## Features Included
- User login using mobile number and password
- Admin login separately
- BCrypt password storage
- Movie CRUD
- Theater management
- Show timing management
- Seat generation and real seat layout
- Booking confirmation
- Booking history
- Admin view all bookings
- Duplicate seat booking prevention using unique constraint and service validation
- Mobile responsive UI

## Project Structure
`controller`, `service`, `repository`, `entity`, `config`, `templates`, `static/css`, `static/js`, `static/images` are included.
