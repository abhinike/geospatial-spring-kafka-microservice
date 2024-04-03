# Use an appropriate base image that includes Java and Gradle
FROM gradle:7.3.3-jdk17 as builder

# Set the working directory in the container
WORKDIR /app

# Copy Gradle build files
COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradle ./gradle

# Copy the source code
COPY src ./src

# Build the application
RUN ./gradlew build --no-daemon

# Use a lightweight base image with JRE for running the application
FROM debian:stretch-slim as packager

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/build/libs/geospatial-0.0.1-SNAPSHOT.jar ./app.jar

# Expose the port that your Spring Boot application runs on
EXPOSE 8080

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
