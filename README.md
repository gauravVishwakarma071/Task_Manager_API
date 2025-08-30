# Task Manager API

A simple **Spring Boot REST API** for managing tasks.

## 🚀 Tech Stack
- Java 17
- Spring Boot 3.5.x
- Spring Data JPA
- H2 Database
- Lombok
- Postman (for testing)

## 🔑 Features
- Create, Read, Update, Delete (CRUD) tasks
- In-memory H2 database for quick testing
- Layered architecture (Controller → Service → Repository)

## 📌 API Endpoints

| Method | Endpoint         | Description       |
|--------|------------------|-------------------|
| POST   | `/api/tasks`     | Create new task   |
| GET    | `/api/tasks`     | Get all tasks     |
| GET    | `/api/tasks/{id}`| Get task by ID    |
| PUT    | `/api/tasks/{id}`| Update task       |
| DELETE | `/api/tasks/{id}`| Delete task       |

## ▶️ Run Locally
1. Clone the repo  
   ```bash
   git clone https://github.com/gauravVishwakarma071/Task_Manager_API.git
