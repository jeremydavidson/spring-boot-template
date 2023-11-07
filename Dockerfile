FROM gradle:7.5.1-jdk17 AS builder
WORKDIR /home/gradle/src
COPY . .
RUN gradle build

FROM eclipse-temurin:17-jre-jammy AS runtime
COPY --from=builder /home/gradle/src/build/libs/*.jar /app.jar
EXPOSE 4326
ENTRYPOINT ["java", "-jar", "/app.jar"]
