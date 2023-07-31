FROM   openjdk:20
# Use the official OpenJDK 11 image as the base image 

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR into the container
COPY target/*.jar app.jar

# Expose the port that your Spring Boot application listens on
EXPOSE 8080

# Set the entrypoint command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]