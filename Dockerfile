FROM openjdk:8-jdk-alpine
EXPOSE 8083
# ADD target/kaddem.jar  kaddem.jar
# ADD target/kaddem.jar /kaddem.jar
# COPY target/kaddem.jar /kaddem.jar
ENTRYPOINT ["java", "-jar", "/kaddem.jar"]
