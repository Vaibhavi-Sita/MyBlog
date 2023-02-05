FROM eclipse-temurin:17-jdk-alpine

COPY target/*.jar myblog.jar
ENTRYPOINT ["java","-jar","/myblog.jar"]