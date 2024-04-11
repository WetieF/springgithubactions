FROM openjdk:17
EXPOSE 8080
ADD target/springboot-githubaction.jar springboot-githubaction.jar
ENTRYPOINT ["java", "-jar", "/springboot-githubaction.jar"]