FROM openjdk:8-jdk-alpine

VOLUME /tmp

# docker build --build-arg JAR_FILE=target/*.jar -t danielng123/tortode .
ARG JAR_FILE

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]