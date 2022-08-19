FROM maven:3.6.3-jdk-11-slim AS build
FROM openjdk:11
EXPOSE 9000
WORKDIR /javabackend
COPY . /javabackend
#HEALTHCHECK --interval=25s --timeout=3s --retries=2 CMD wget --spider http://199.192.27.107:8085/actuator/health || exit 1
ADD target/CircleCi.jar CircleCi.jar
ENTRYPOINT ["java","-jar","target/CircleCi.jar"]