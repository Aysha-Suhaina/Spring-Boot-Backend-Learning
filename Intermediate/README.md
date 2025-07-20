# Intermediate Level – Spring Boot Labs

##  Prerequisites

To run the projects in this folder, ensure the following are installed and properly configured on your system:

- **Java Development Kit (JDK)** – Version 17 or above  
- **Maven** – For building and managing project dependencies  
- **MySQL** – Installed and running locally (adjust `application.properties` accordingly)  
- **Postman / Thunder Client** – To test and debug RESTful APIs  
- **Spring Boot 3+** – With dependencies like Spring Web, Spring Data JPA, Spring Security (in selected labs), and Lombok

---

##  Overview

The Intermediate Level labs mark a big step forward from the basic hands-on tasks in the Beginner Level. This stage is focused on shaping your understanding of how to **structure** and **design** a real-world Spring Boot application with some core production-ready features.  

If the Beginner Level was about "trying", the Intermediate Level is about "building with purpose."

### Key Concepts Covered

- REST API Design with Spring MVC  
- Connecting Spring Boot with **MySQL Database**  
- Implementing business logic clearly and separately  
- Creating and handling **DTOs**, **services**, **repositories**, and **controllers**  
- Advanced concepts:  
  - **Pagination**
  - **Sorting**
  - **ResponseEntity and HttpStatus handling**  
- Introduction to **Aspect-Oriented Programming (AOP)** using Spring AOP

---

##  My Learning Experience

Coming from the Beginner Level, I realized this phase demanded more than just experimenting with code. The Intermediate Level labs pushed me to think like a developer working on an actual application — setting up the structure, separating layers, writing cleaner logic, and dealing with real-world issues.

Here, I **moved away from H2DB** and started using **MySQL**, which was a whole new experience — from installing and configuring to understanding version compatibility issues that threw errors in my terminal and consumed hours of debugging time.

Role-based authentication and basic security setups were also introduced, although some labs were skipped due to overlaps or repetitive patterns. The remaining exercises still helped me understand how to control user access and structure routes accordingly.

I learned how to handle data more responsibly — using pagination and sorting where needed, making my APIs more usable and efficient. All these practices made the app feel closer to something ready for production.

Trust me, it was fun, frustrating, and fulfilling — sometimes the issues came from small typos or incorrect mapping. But with consistent help from my research and guidance here, I was able to tackle each lab one by one.

---

##  Lab Exercises Included

Below are the labs that were completed and added to this level. Security and file-handling related ones were skipped for clarity.

1. Lab 1 – Introduction to REST APIs  
2. Lab 2 – GET and POST Mapping  
3. Lab 3 – Data Handling with RequestBody  
4. Lab 4 – Path Variables and Request Params  
5. Lab 5 – Connecting to MySQL  
6. Lab 6 – Basic CRUD Operations  
7. Lab 7 – Repository and Service Layer Separation  
8. Lab 8 – Using DTOs and ResponseEntity  
9. Lab 9 – Global Exception Handling  
10. Lab 10 – Pagination and Sorting  
11. Lab 11 – AOP Introduction  
12. Lab 12 – Custom Business Logic Integration  
13. Lab 13 – Structuring Controller and Service Properly  
14. Lab 14 – Mapping Relationships (One-to-Many, Many-to-One)
