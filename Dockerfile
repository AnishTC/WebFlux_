# Use a base image with Java pre-installed
FROM openjdk:17-oracle

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/small-finance.jar /app/app.jar

# Expose the port your application will run on
EXPOSE 8085

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]