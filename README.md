
# Geospatial-map-microservice
-> Building a miniature model that replicates the architecture of Uber/Zomato's big data (Geospatial Data) engineering backend

## Setup Instructions

1. Clone the repository.
2. Copy the `application.properties.example` file in the `src/main/resources/` directory and rename it to `application.properties`.
3. Replace the placeholder values in the `application.properties` file with your actual database connection details.
4. Save the `application.properties` file.
5. Build and run the project.




# Docker Setup


To build a Docker image using this Dockerfile, you would run the following command in the directory containing your Dockerfile and Spring Boot project:

```bash
docker build -t map-backend-image .
```

Once the Docker image is built, you can run a container using the image:

```bash
docker run -p 8080:8080 map-backend-image
```

This will start your Spring Boot application inside a Docker container, and you can access it at `http://localhost:8080` on your host machine.
