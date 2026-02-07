# User & Role Storage API (Spring Boot)

## 📌 Overview

This project implements **Task 6 — User & Role Storage API** from the backend logic tasks.
It provides REST APIs to manage users and their roles in a simple platform where different types of users (developers, artists, editors, etc.) can register and be filtered by role.

The application is built using **Java, Spring Boot, Spring Data JPA**, and an **H2 in-memory database**, and is containerized using Docker for deployment.

---

## 🚀 Hosted API

**Base URL**

```
https://user-role-api-25zd.onrender.com
```

---

## 🛠 Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven
* Docker
* Render (Deployment)

---

## 📂 Features

* Add a user with name and role
* Fetch all users
* Fetch users by role
* Clean REST API structure
* Layered architecture (Controller → Service → Repository)

---

## 📡 API Endpoints

### ➤ Add User

**POST** `/api/users`

Request Body:

```json
{
  "name": "Ravi",
  "role": "Developer"
}
```

---

### ➤ Fetch All Users

**GET** `/api/users`

---

### ➤ Fetch Users By Role

**GET** `/api/users/role/{role}`

Example:

```
/api/users/role/Developer
```

---

## 🧪 Testing with cURL

### Add User

```
curl -X POST https://user-role-api-25zd.onrender.com/api/users \
-H "Content-Type: application/json" \
-d '{"name":"Test","role":"Developer"}'
```

### Get All Users

```
curl https://user-role-api-25zd.onrender.com/api/users
```

### Get By Role

```
curl https://user-role-api-25zd.onrender.com/api/users/role/Developer
```

---

## 🗄 Database

* Uses **H2 In-Memory Database**
* Data resets when application restarts
* Intended for demo/testing purposes

Local Console:

```
http://localhost:8080/h2-console
```

JDBC URL:

```
jdbc:h2:mem:testdb
```

---

## 🐳 Running Locally

### Build Project

```
mvn clean package
```

### Run

```
mvn spring-boot:run
```

---

## 📦 Docker Deployment

This project uses multi-stage Docker build:

```
docker build -t user-role-api .
docker run -p 8080:8080 user-role-api
```

---

## 👤 Author

Developed as part of backend task implementation using Spring Boot.

**Sinchana H M**
---

## ✅ Task Objectives Covered

* Clean API Design
* Proper Data Structure
* Simple Responses
* Role-based user filtering
* Hosted backend deployment
* GitHub repository submission

---
