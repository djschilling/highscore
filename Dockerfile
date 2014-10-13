FROM java:8
MAINTAINER David Schilling <davejs92@gmail.com>

ADD target/highscore-0.0.1-SNAPSHOT.jar /highscore-0.0.1-SNAPSHOT.jar
RUN chmod +x /highscore-0.0.1-SNAPSHOT.jar

ADD application-docker.properties /application.properties

EXPOSE 8080

CMD java -jar /highscore-0.0.1-SNAPSHOT.jar
