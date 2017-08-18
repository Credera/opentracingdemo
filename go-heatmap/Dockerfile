FROM golang:1.8
WORKDIR /go/src/github.com/Credera/opentracingdemo/go-heatmap
COPY . .
RUN go-wrapper download
WORKDIR /go/src/github.com/Credera/opentracingdemo/go-heatmap/go-create-db
RUN bash create.sh
WORKDIR /go/src/github.com/Credera/opentracingdemo/go-heatmap
EXPOSE 8081
CMD go run main.go -z http://zipkin:9411/api/v1/spans
