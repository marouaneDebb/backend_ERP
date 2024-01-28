
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /backend


COPY target/backend.jar /backend/backend.jar

# Expose the port that the application will run on
EXPOSE 8088

# Specify the command to run on container start
CMD ["java", "-jar", "backend.jar"]
