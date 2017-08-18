FROM java:8-jdk
COPY ./proto /usr/src/proto
COPY ./spring-web /usr/src/spring-web
WORKDIR /usr/src/spring-web
RUN ./gradlew build
EXPOSE 8080
CMD ./gradlew bootRun -Dzipkin.endpoint=http://zipkin:9411/api/v1/spans -Dheatmap.endpoint=http://go-heatmap:8081/heatmap -Dcross-section.address=java-cross-section:8082
