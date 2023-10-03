#FROM maven:3.8.3-openjdk-17
#
#WORKDIR /app
#COPY . .
#RUN mvn clean install
#EXPOSE 8080
#CMD mvn spring-boot:run
FROM openjdk:17-oracle as builder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]