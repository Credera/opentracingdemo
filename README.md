OpenTracing Demonstration
======
This project is composed of multiple simple services setup to use Zipkin via the OpenTracing standard. The services are composed to provide interesting traces.

The demo site allows the user to navigate the final image created by Reddit's [r/place experiment](https://www.reddit.com/r/place/). The activity heat map will be filled in as the user moves a mouse over the image. The user may also move two markers to plot a cross section of the heatmap data. These activities will result in a large number of traces that can be inspected.

## Usage

### Prerequisites

* [Go 1.8.x](https://golang.org/dl/)
* [Java 1.8.x JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### Option 1 - Manual Start

#### Additional Prerequisites

* [Zipkin](https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec)

#### Prepare Activity Database
```bash
$ go get github.com/Credera/opentracingdemo
$ cd $(go env GOPATH)/src/github.com/Credera/opentracingdemo/go-create-db
$ go run main.go
```

#### Start Zipkin
From a terminal with the same current directory as the Zipkin jar was downloaded:
```bash
$ java -jar zipkin*.jar
```

#### Start Spring Boot
From another terminal:
```bash
$ cd $(go env GOPATH)/src/github.com/Credera/opentracingdemo/spring-web
$ ./gradlew bootRun
```

#### Start Heat Map Service
From another terminal:
```bash
$ cd $(go env GOPATH)/src/github.com/Credera/opentracingdemo/go-heatmap
$ go run main.go
```

#### Start Cross Section Service
From another terminal:
```bash
$ cd $(go env GOPATH)/src/github.com/Credera/opentracingdemo/java-cross-section
$ ./gradlew run
```

### Option 2 - Tmuxinator Start

#### Additional Prerequisites

* [tmux](http://tmux.github.io)
* [tmuxinator](https://github.com/tmuxinator/tmuxinator)

#### Setup Project

```bash
$ go get github.com/Credera/opentracingdemo
```

#### Start all

```bash
$ cd $(go env GOPATH)/src/github.com/Credera/opentracingdemo
$ tmuxinator
```

### Connect to Demo Site and Zipkin UI
* [Demo Page](http://localhost:8080)
* [Zipkin UI](http://localhost:9411)

## Third party libraries
* [Bootstrap](http://getbootstrap.com)
* [LeafletJS](http://leafletjs.com)
* [D3js](http://d3js.org)
* [jQuery](http://jquery.com)
* [OpenTracing clients](https://github.com/opentracing)
* [OpenTracing Java Spring Web](https://github.com/opentracing-contrib/java-spring-web)
* [OpenTracing OkHttp](https://github.com/opentracing-contrib/java-okhttp)
* [GRPC-OpenTracing](https://github.com/grpc-ecosystem/grpc-opentracing)
* [Zipkin clients](https://github.com/openzipkin)
* [Spring](http://spring.io)
* [OkHttp](https://github.com/square/okhttp)
* [gRPC](http://www.grpc.io)
* [Instrumented SQL](http://github.com/ExpansiveWorlds/instrumentedsql)
* [SQLite3 Go Driver](github.com/mattn/go-sqlite3)
