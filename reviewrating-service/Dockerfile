FROM openjdk:21
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} reviewandrating-service.jar
ENTRYPOINT ["java","-jar","/reviewandrating-service.jar"]
EXPOSE 8080