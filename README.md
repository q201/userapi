#User API Service
##This project implements a RESTful API service for user management using Spring Boot and integrates Swagger UI for API documentation.

#Features
##User Registration: Endpoint to register a new user.
Fetch User: Endpoint to fetch user details by username.
Exception Handling: Handles UserNotFoundException with appropriate HTTP responses.
Technologies Used
Java: Version 17
Spring Boot: Version 3.3.1
Swagger: Integrated for API documentation
JUnit 5: For unit testing
Setup Instructions
Clone the repository:

bash
Copy code
git clone <repository-url>
cd user-api-service
Build and Run:

bash
Copy code
mvn clean install
mvn spring-boot:run
Access Swagger UI:

Open your browser and go to http://localhost:8080/swagger-ui.html to view and interact with API documentation.
OpenAPI description is available at http://localhost:8080/v3/api-docs.
API Endpoints
POST /api/user/register: Register a new user.

bash
Copy code
curl -X POST http://localhost:8080/api/user/register -H "Content-Type: application/json" -d '{"username": "john.doe", "password": "secret", "email": "john.doe@example.com"}'
GET /api/user/fetch: Fetch user details by username.

bash
Copy code
curl -X GET 'http://localhost:8080/api/user/fetch?username=john.doe'
Contributing
Contributions are welcome. Feel free to fork the repository and submit pull requests.
