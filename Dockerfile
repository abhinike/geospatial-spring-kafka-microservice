FROM openjdk:23-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy Gradle build files
COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradle ./gradle

# Copy the source code
COPY src ./src

# Ensure gradlew script has executable permissions
RUN chmod +x gradlew

# Build the application
RUN ./gradlew build

# Copy the built JAR file
COPY ./build/libs/geospatial-0.0.1-SNAPSHOT.jar app.jar

# Specify the command to run your Spring Boot application when the container starts
ENTRYPOINT ["java", "-jar", "/app.jar"]
