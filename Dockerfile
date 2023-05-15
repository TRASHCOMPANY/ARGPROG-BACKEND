FROM amazoncorretto:20-alpine-jdk
MAINTAINER chamaco
COPY target/proyectointegrador-0.0.1-SNAPSHOT.jar proyectointegrador-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["Java","-jar","/proyectointegrador-0.0.1-SNAPSHOT.jar"]