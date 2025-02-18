FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/Product-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Product-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/Product-0.0.1-SNAPSHOT.jar"]

