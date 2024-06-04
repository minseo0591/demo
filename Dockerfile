FROM gradle:jdk11 as builder

WORKDIR /app
COPY . .
RUN gradle build
FROM openjdk:11-jdk

ARG JAR_FILE=./build/libs/demo-0.0.1-SNAPSHOT.jar
COPY --from=builder /app/${JAR_FILE} app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
