
FROM openjdk:17

ENV MYSQL_ROOT_PASSWORD=admin\
    MYSQL_DATABASE=bd
# Set the working directory
WORKDIR /backend

COPY target/backend.jar /backend/backend.jar

# Expose the port that the application will run on


# Specify the command to run on container start
CMD ["java", "-jar", "/backend/backend.jar"]
