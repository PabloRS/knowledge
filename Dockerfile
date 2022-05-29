FROM amazoncorretto:11
VOLUME /tmp
COPY target/*.jar knowledge.jar
ENTRYPOINT ["java", "-jar", "/knowledge.jar"]