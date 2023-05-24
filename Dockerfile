# Use the official OpenJDK 11 image as the base
FROM openjdk:11-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file to the container
COPY target/Demo-Devops-Project-0.0.1-SNAPSHOT.jar .

# Expose the application port
EXPOSE 80

# Set the command to run the application
CMD ["java", "-jar", "Demo-Devops-Project-0.0.1-SNAPSHOT.jar"]
