FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/Order-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Order-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/Order-0.0.1-SNAPSHOT.jar"]
