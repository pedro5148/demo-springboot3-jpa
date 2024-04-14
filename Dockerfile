# Estágio 1: Build
FROM maven:3.9.6-eclipse-temurin-17-alpine as builder
COPY pom.xml /build/pom.xml
COPY src /build/src
WORKDIR /build
RUN mvn clean package -DskipTests
# Estágio 2: Execução
FROM amazoncorretto:17-alpine
COPY --from=builder /build/target/demo-spring3-jpa-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
