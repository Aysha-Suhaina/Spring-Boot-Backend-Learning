# Beginner Level – Spring Boot Lab Exercises (Labs 1 to 25)

This folder contains the first 25 beginner-level backend development labs I completed as part of my internship using Spring Boot.

---

## My Learning Journey

When I first started learning Spring Boot, I felt overwhelmed. I had no idea where to begin, so like many beginners, I went to Google. I ended up on Geeks for Geeks, trying to figure out what a Spring Boot developer needs to know.

I saw so many new concepts — Aspect-Oriented Programming, Beans, Annotations, Embedded Servers, HTTP Requests, and more. It was hard to even remember what was what.

But one thing I believed in was:  
“Learning is best remembered when coupled with doing.”

Reading theory wasn't sticking. So I jumped straight into practical lab exercises — even though I was confused.

---

## How I Progressed

At first, even the basic idea of what a @RestController does was confusing. But as I moved lab by lab, things started to make sense:

- I learned how to use different types of HTTP requests like GET, POST, etc.
- I practiced with tools like Postman and ThunderClient to test my APIs.
- I understood how Spring Boot handles logs, how Tomcat runs the server, and how pom.xml defines dependencies.

But I also made lots of mistakes:
- I forgot to add dependencies, causing my project to crash several times.
- I misspelled method names or annotations — thinking the logic was broken, only to find out it was just a typo.
- I even ran mvn clean install without an internet connection... not a good idea.

For testing, I used H2 Database because it was easier and beginner-friendly. It helped me avoid the complexities of setting up a real database while still learning how JPA works.

---

## What I Learned (and Remember)

- The meaning and usage of core annotations like @RestController, @RequestMapping, @Autowired, @GetMapping, etc.
- How to build simple REST APIs in Spring Boot
- How to manage project dependencies using Maven (pom.xml)
- Using in-memory databases (H2) to experiment with CRUD operations
- How to debug errors, especially typos and misconfigured dependencies

---

## Completed Labs Overview

| Lab No | Topic |
|--------|-------|
| 01 | Setup Spring Boot project with Spring Initializr |
| 02 | Created "Hello World" REST API |
| 03 | Understanding application structure |
| 04 | Running app with embedded Tomcat |
| 05 | Building and running JAR |
| 06 | Creating REST controllers |
| 07 | Handling GET requests |
| 08 | Handling POST requests using Postman/ThunderClient |
| 09 | Using @RequestBody and @PathVariable |
| 10 | Exception Handling |
| 11 | Creating custom responses |
| 12 | Dependency Injection with @Autowired |
| 13 | Bean lifecycle using @PostConstruct |
| 14 | Using @Value and @Configuration |
| 15 | Environment-specific config with Profiles |
| 16 | H2 Database setup |
| 17 | Creating JPA Entity classes |
| 18 | Defining Repository interfaces |
| 19 | Basic CRUD operations |
| 20 | Custom queries with @Query |
| 21–25 | Extended tasks around refining APIs, testing, handling edge cases |

---

## Tools and Technologies

- Java 17
- Spring Boot
- Maven
- Postman / ThunderClient
- H2 In-Memory Database
- IntelliJ IDEA / VS Code

---

## Final Thoughts

Completing these 25 labs has given me not just technical skills but also the confidence to debug and fix problems on my own. I now understand how to approach a Spring Boot project, where to look when something breaks, and how each layer connects together.

This is just the beginning, but I feel ready to step into the intermediate level of backend development now.

---

Made with coffee and a lot of console errors  
— Aysha Suhaina

