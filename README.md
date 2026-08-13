# LinkedIn Microservices (Spring Boot)

A learning project that splits a LinkedIn-like backend into small Spring Boot services.

## Services

- `user-service` — user accounts
- `post-service` — posts and likes

Java 21, Spring Boot, Spring Data JPA, PostgreSQL.

Each service is a standalone Maven module. From a service directory:

```bash
./mvnw spring-boot:run
```
