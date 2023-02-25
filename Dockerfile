FROM openjdk:17-jdk-alpine3.14
WORKDIR /app
COPY target/*.jar /app/myapp.jar
CMD ["java", "-jar", "/app/myapp.jar"]