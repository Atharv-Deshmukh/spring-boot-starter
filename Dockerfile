FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-starter.jar spring-boot-starter.jar
ENTRYPOINT ["java","-jar","spring-boot-starter.jar"]