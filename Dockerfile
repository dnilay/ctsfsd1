FROM openjdk:8-jre-alpine
COPY target/MyDaysOfTheWeekProject-1.0-SNAPSHOT.jar /usr/share
WORKDIR /usr/share
ENTRYPOINT ["java","-cp", "MyDaysOfTheWeekProject-1.0-SNAPSHOT.jar", "mypackage.DaysOfTheWeek"]