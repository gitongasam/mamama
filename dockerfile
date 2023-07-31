FROM openjdk:20
WORKDIR /app
COPY target/winston-apartment.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
