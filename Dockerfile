FROM openjdk:17-jdk as builder
COPY . /app
WORKDIR /app
RUN rm -rf build \
    && chmod +x gradlew \
    && microdnf install findutils \
    && ./gradlew build

FROM openjdk:17-jdk as runner
COPY --from=builder /app/build/libs/*.jar /app/app.jar
WORKDIR /app
CMD ["java", "-jar", "app.jar"]
