FROM openjdk:21
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} flight-service.jar
ENTRYPOINT ["java","-jar","/flight-service.jar"]
EXPOSE 9001