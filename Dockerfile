FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/kaddem-0.0.1-SNAPSHOT.jar  kaddem-0.0.1-SNAPSHOT.jar
# ADD target/kaddem.jar /kaddem.jar
<<<<<<< Updated upstream
 COPY target/kaddem-0.0.1-SNAPSHOT.jar /kaddem-0.0.1-SNAPSHOT.jar
=======
# COPY target/kaddem.jar /kaddem.jar
>>>>>>> Stashed changes
ENTRYPOINT ["java", "-jar", "/kaddem-0.0.1-SNAPSHOT.jar"]
