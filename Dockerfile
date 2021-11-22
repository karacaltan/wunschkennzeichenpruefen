FROM openjdk:11
EXPOSE 8090
ADD target/wunschkennzeichenpruefen.jar wunschkennzeichenpruefen.jar
ENTRYPOINT ["java", "-jar", "/wunschkennzeichenpruefen.jar"]