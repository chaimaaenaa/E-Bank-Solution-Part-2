FROM openjdk:21
EXPOSE 8080
ADD /target/ebank.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
