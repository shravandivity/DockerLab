FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/*.jar tcsdemo.jar
ENTRYPOINT [ "java", "-jar", "tcsdemo.jar" ]