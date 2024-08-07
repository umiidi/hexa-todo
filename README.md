# HexaTodo

HexaTodo is a simple To-Do List application built using Hexagonal Architecture. This project allows users to manage tasks by adding, updating, and deleting them. It is designed to demonstrate the principles of Hexagonal Architecture, separating domain logic from infrastructure for better maintainability and scalability.

## Features

- **Task Management**: Create, update, delete, and list tasks.
- **REST API**: Provides endpoints for interacting with tasks.
- **Hexagonal Architecture**: Clean separation between domain, application, and infrastructure layers.

## Technologies Used

- **Java** and **Spring Boot**
- **In-Memory Database**
- **RESTful API**

## Prerequisites

- Java 17 or higher
- Gradle

## API Endpoints
* **GET  /tasks**: Retrieve a list of tasks.
* **POST /tasks**: Create a new task.
* **PUT /tasks/{id}**: Update an existing task.
* **DELETE /tasks/{id}**: Delete a task.