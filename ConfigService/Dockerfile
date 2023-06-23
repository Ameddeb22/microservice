FROM openjdk:17
EXPOSE 8762
ADD /target/ConfigService-0.0.1-SNAPSHOT.jar ConfigService.jar
ENTRYPOINT ["java","-jar","ConfigService.jar"]