FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy the JAR file built by Maven
COPY target/*.jar app.jar

# Set environment variables (can be overridden at runtime)
ENV SPRING_DATASOURCE_URL=jdbc:mysql://mysql:3306/tour_booking_db
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=Sang5850!

# Expose the port your app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]