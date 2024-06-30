# User Registration and Fetch API

This project implements a user registration and user details fetch endpoints for a RESTful API using Spring Boot.

## Technologies Used

- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Springdoc OpenAPI for Swagger UI
- JUnit 5

## Prerequisites

- Java 17
- Maven

## Setup and Run

1. Clone the repository:
    ```bash
    git clone  https://github.com/q201/userapi.git
    cd  /src/main/java/com/example/user
    ```

2. Build the project:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```


## Endpoints

### Register User

- **URL:** `/api/user/register`
- **Method:** `POST`
- **Description:** Registers a new user.
- **Request Body:**
    ```json
    {
        "username": "string",
        "password": "string",
        "email": "string"
    }
    ```
- **Response:**
    - `200 OK` if the user is registered successfully.
    - `400 Bad Request` if there is an error during registration.

- **cURL Command:**
    ```bash
    curl -X POST "http://localhost:8080/api/user/register" -H "Content-Type: application/json" -d '{
        "username": "john_doe",
        "password": "password123",
        "email": "john.doe@example.com"
    }'
    ```

### Fetch User Details

- **URL:** `/api/user/fetch`
- **Method:** `GET`
- **Description:** Fetches details of a user by username.
- **Query Parameter:** `username` (string)
- **Response:**
    - `200 OK` with user details if the user is found.
    - `404 Not Found` if the user is not found.

- **cURL Command:**
    ```bash
    curl -X GET "http://localhost:8080/api/user/fetch?username=john_doe"
    ```

## Project Structure

```plaintext
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── user
│   │               ├── UserApplication.java
│   │               ├── controller
│   │               │   └── UserController.java
│   │               ├── model
│   │               │   └── UserModel.java
│   │               ├── repository
│   │               │   └── UserRepository.java
│   │               └── service
│   │                   └── UserService.java
│   └── resources
│       ├── application.properties
│       └── data.sql
└── test
    └── java
        └── com
            └── example
                └── user
                    └── UserApplicationTests.java
```
## Swagger Configuration

The Swagger UI is configured to be available at the following URL:

http://localhost:8080/swagger-ui.html

## License

This project is licensed under the Apache License, Version 2.0.

## Developer

- **Name:** Quasim 
- **Email:** 202qasim202@gmail.com

## GitHub Repository

[GitHub Repository Link](https://github.com/q201/userapi.git)
