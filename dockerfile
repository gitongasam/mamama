FROM openjdk:20
WORKDIR /app
COPY target/winston-backend.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
