FROM adoptopenjdk/openjdk15
COPY build/libs/home-stuff-maintenance-0.0.1-SNAPSHOT.jar home-stuff-maintenance-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "home-stuff-maintenance-0.0.1-SNAPSHOT.jar"]