FROM openjdk:21

WORKDIR /app

COPY . .

CMD ./mvnw spring-boot:run