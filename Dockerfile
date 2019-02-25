FROM openjdk:alpine
COPY ./build/libs/travis-demo-0.0.1-SNAPSHOT.jar /usr/scr/travis-demo.jar
EXPOSE 8761
CMD java -jar /usr/scr/travis-demo.jar