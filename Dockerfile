FROM openjdk:17-alpine
COPY target/first-docker-app-0.0.1-SNAPSHOT.jar docker-app.jar
ENTRYPOINT ["java", "-jar", "docker-app.jar"]


