# DataJpaApp

A simple RESTful API built using **Spring Boot**, **Spring Data JPA**, **Hibernate ORM**, and **MySQL**.

This project was created to understand how Spring Boot applications interact with a relational database using JPA and Hibernate, while following a layered architecture.

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven

## Project Structure

```text
src/main/java
│
├── com.sourabh
│   └── Application.java
│
├── com.sourabh.controller
│   └── DataController.java
│
├── com.sourabh.model
│   └── Data.java
│
├── com.sourabh.Repository
│   └── DataRepository.java
│
└── com.sourabh.service
    └── DataService.java
```

The application follows the layered architecture:

```text
Client
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
Hibernate / JPA
  ↓
MySQL Database
```

## Features

- REST API using Spring Boot
- Fetch all records from MySQL
- Fetch records by ID
- Spring Data JPA repository
- Hibernate ORM for database interaction
- Layered Controller-Service-Repository architecture
- JSON responses through REST endpoints

## Example API Endpoints

### Get All Records

```http
GET /getall
```

Example response:

```json
[
  {
    "id": 1,
    "name": "abhishek",
    "sem": 6,
    "dept": "cyber"
  }
]
```

### Get Record by ID

```http
GET /id/{id}
```

Example:

```http
GET /id/1
```

## Database Configuration

Configure MySQL in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> Do not commit real database passwords or other secrets to GitHub.

## Running the Project

Clone the repository and navigate to the project directory.

Run using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will start by default at:

```text
http://localhost:8080
```

## Learning Objectives

This project helped me understand:

- Spring Boot REST APIs
- `@RestController`
- `@GetMapping`
- `@PathVariable`
- Dependency Injection
- Service layer
- Repository layer
- Spring Data JPA
- Hibernate ORM
- Entity mapping
- MySQL integration
- JSON serialization

## Future Improvements

- Add POST API
- Add PUT API
- Add DELETE API
- Add exception handling
- Add input validation
- Use DTOs
- Improve API response handling

## Author

**Saurabh Kumar Lodhi**