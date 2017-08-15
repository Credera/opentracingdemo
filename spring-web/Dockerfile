FROM java:8-jdk
COPY ./proto /usr/src/proto
COPY ./spring-web /usr/src/spring-web
WORKDIR /usr/src/spring-web
RUN ./gradlew build
EXPOSE 8080
CMD ./gradlew bootRun
