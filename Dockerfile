FROM amazoncorretto:20-alpine-jdk
MAINTAINER chamaco
COPY target/proyectointegrador-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["Java","-jar","/app.jar"]