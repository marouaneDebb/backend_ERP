
FROM openjdk:17

ENV MYSQL_ROOT_PASSWORD=admin\
    MYSQL_DATABASE=bd

WORKDIR /backend

COPY target/backend.jar /backend

EXPOSE 8070

CMD ["java", "-jar", "/backend/backend.jar"]
