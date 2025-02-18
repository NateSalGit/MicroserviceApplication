FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/Customer-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Customer-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/Customer-0.0.1-SNAPSHOT.jar"]
