FROM java:8-jdk
COPY ./proto /usr/src/proto
COPY ./java-cross-section /usr/src/java-cross-section
WORKDIR /usr/src/java-cross-section
RUN ./gradlew build
EXPOSE 8082
CMD ./gradlew run
