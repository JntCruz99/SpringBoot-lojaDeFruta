FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/demo-1.0.0-SNAPSHOT.jar demo-1.0.0-SNAPSHOT.jar
EXPOSE 8080
CMD CMD ["java", "-jar", "demo-1.0.0-SNAPSHOT.jar"]
