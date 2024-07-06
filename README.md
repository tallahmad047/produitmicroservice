
# TallMicroserviceProduit

## Description
`tallmicroserviceproduit` is a Spring Boot application designed to manage products. It uses Spring Data JPA for database interactions and supports both MySQL and PostgreSQL databases.

## Prerequisites

1. **Java 17**: Make sure you have Java 17 installed. You can download it from the [official website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
2. **Maven**: Ensure Maven is installed and added to your system PATH. You can download it from the [official website](https://maven.apache.org/download.cgi).
3. **Database**: Either MySQL or PostgreSQL should be installed and running.

## Project Structure

- **Dependencies**:
  - `spring-boot-starter-data-jpa`: For database interactions.
  - `spring-boot-starter-web`: To create RESTful web services.
  - `spring-boot-devtools`: Provides development tools.
  - `mysql-connector-java`: MySQL database connector.
  - `postgresql`: PostgreSQL database connector.
  - `lombok`: Java library to reduce boilerplate code.
  - `spring-boot-starter-test`: For testing the application.
  - `spring-data-rest-core`: For RESTful data repositories.

- **Plugins**:
  - `spring-boot-maven-plugin`: Used to package the application as a Spring Boot executable JAR.

## Setup

### 1. Clone the Repository
```bash
git clone <repository-url>
cd tallmicroserviceproduit
