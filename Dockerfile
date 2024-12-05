FROM openjdk:21
EXPOSE 8080
ADD docker-jenkins/target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java", "-jar", "/devops-integration.jar"]