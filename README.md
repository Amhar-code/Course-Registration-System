# Course Registration System

A comprehensive full-stack web application for managing course registrations in educational institutions.

## 🚀 Features

- **User Authentication**
- Course Catalog Browsing
- Course Registration and Enrollment
- Student Dashboard
- Responsive Design for all devices
- Real-time Updates

## 🛠️ Technology Stack

### Frontend
- HTML5
- CSS3
- JavaScript (ES6+)

### Backend
- Java 21
- Spring Boot 3.5.4
- Spring Data JPA
- Maven

### Database
- MySQL 8.0+

## 📋 Prerequisites

- Java Development Kit (JDK) 21 or later
- Maven 3.6.0 or later
- MySQL Server 8.0 or later
- Modern web browser (Chrome, Firefox, Safari, or Edge)

## 🚀 Getting Started

### Backend Setup

1. **Database Configuration**
   ```sql
   CREATE DATABASE course_reg_sym;
   ```

2. **Configure Database**
   Update the database credentials in `Backend/src/main/resources/application.properties`

3. **Build and Run**
   ```bash
   cd Backend
   mvn spring-boot:run
   ```
   The backend server will start on `http://localhost:8080`

### Frontend Setup

1. Open `Frontend/index.html` in your web browser
2. No build step is required as it's plain HTML/CSS/JS

## 📁 Project Structure

```
Course-Registration-System/
├── Backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/Course/Registration/System/
│   │   │   └── resources/
│   │   └── test/
│   └── pom.xml
└── Frontend/
    ├── css/
    │   ├── style.css
    │   └── table.css
    ├── js/
    │   └── myscript.js
    ├── availablecourse.html
    ├── enrolled.html
    ├── index.html
    └── register.html
```

## 🌐 API Endpoints

- `GET /api/courses` - Get all available courses
- `POST /api/register` - Register a new student
- `GET /api/students` - Get all students
- `POST /api/enroll` - Enroll in a course

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.
