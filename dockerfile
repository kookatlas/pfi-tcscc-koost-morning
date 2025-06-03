# Use OpenJDK 21 as base
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/pfi-tcscc-koost-morning.jar app.jar

# Expose the app port
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
