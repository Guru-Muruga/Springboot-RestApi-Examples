# Spring Boot Hello REST API

## Author
Muruganantham

## Overview
This is a simple Spring Boot REST API built using **Java 21**.
The project demonstrates basic REST principles, controller mappings,
and clean project structure following Spring Boot best practices.

This project is intended as a foundational backend service and will be
enhanced step-by-step with logging, exception handling, Docker, and CI/CD.

## Architecture
Client (Browser / Postman)
|
| HTTP Request
v
Spring Boot REST Controller
|
| Business Logic
v
Response (JSON / String)


## Package Structure
com.example.sb.first
├── FirstApplication.java # Main Spring Boot application
└── controller
└── FirstRestController # REST API endpoints

## API Endpoints

### 1️⃣. GET /hello
**Description:** Returns a welcome message.

**URL**
http://localhost:8080/hello

**Response**
Hello, Welcome to the Spring Boot!

### 2️⃣ GET /hello/{name}
**Description:** Returns a personalized welcome message.

**URL Example**
http://localhost:8080/hello/Muruga

**Response**
Hello! Muruga welcome to Spring Boot's world!

## Tech Stack
- Java 21
- Spring Boot
- Maven
- REST API
- Git & GitHub

## How to Run the Application

### Prerequisites
- Java 21
- Maven

### Run Locally
```bash/cmd
mvn spring-boot:run
Application will start at:

http://localhost:8080

Future Enhancements
Centralized logging
Global exception handling
Dockerization
CI/CD pipeline
User management APIs

## 🔹 1.3 Commit README Changes

Run:
```bash/cmd
git add README.md
git commit -m "Improve README with architecture and API details"
git push

