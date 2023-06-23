FROM openjdk:17
EXPOSE 8762
ADD /target/GestionVoyage-0.0.1-SNAPSHOT.jar GestionVoyage.jar
ENTRYPOINT ["java","-jar","GestionVoyage.jar"]