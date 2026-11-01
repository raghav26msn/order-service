FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/order-service-app.jar app.jar
EXPOSE 8882
ENTRYPOINT ["java", "-jar", "app.jar"]