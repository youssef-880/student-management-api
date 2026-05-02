# Student Management REST API

A professional Backend API built with **Spring Boot 3** to manage student records. This project demonstrates a clean, layered architecture and provides a fully functional interface for CRUD operations.

## Features
*   **Full CRUD Logic:** Create, Read, Update, and Delete student records.
*   **Automatic Data Seeding:** The database is pre-populated with sample students (Alice, Bob, Charlie) on startup via `import.sql`.
*   **Interactive Documentation:** Integrated **Swagger UI** for testing endpoints without external tools.
*   **Data Validation:** Server-side validation for email formats and age requirements.
*   **H2 In-Memory Database:** Fast, zero-setup database for development.

## Technology Stack
*   **Java 21**
*   **Spring Boot 3.2.0**
*   **Spring Data JPA** (Hibernate)
*   **H2 Database**
*   **Maven** (Build Tool)
*   **SpringDoc OpenAPI** (Swagger UI)

## 📂 Architecture
The project follows the standard **Layered Architecture**:
1.  **Controller:** Handles HTTP requests and routing.
2.  **Service:** Contains business logic and validation.
3.  **Repository:** Manages database interaction via JPA.
4.  **Model (Entity):** Defines the Student data structure.



## How to Run
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/student-management-api.git](https://github.com/YOUR_USERNAME/student-management-api.git)
