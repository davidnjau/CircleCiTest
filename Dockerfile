FROM maven:3.6.3-jdk-11-slim AS build
FROM openjdk:11
EXPOSE 8081
WORKDIR /javabackend
COPY . /javabackend
ADD target/CircleCi.jar CircleCi.jar
ENTRYPOINT ["java","-jar","target/CircleCi.jar"]