package com.credera.demo.opentracing.web;

import brave.Tracing;
import brave.opentracing.BraveTracer;
import io.opentracing.Tracer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import zipkin2.reporter.AsyncReporter;
import zipkin2.reporter.okhttp3.OkHttpSender;

@SpringBootApplication
public class Application {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    @Bean
    Tracer zipkinTracer() {
        String zipkinEndpoint = System.getProperty("zipkin.endpoint", "http://localhost:9411/api/v2/spans");
        LOG.info("Zipkin endpoint: {}", zipkinEndpoint);

        // Configure a reporter, which controls how often spans are sent
        //   (the dependency is io.zipkin.reporter2:zipkin-sender-okhttp3)
        OkHttpSender sender = OkHttpSender.create(zipkinEndpoint);
        AsyncReporter<zipkin2.Span> spanReporter = AsyncReporter.create(sender);

        // Now, create a Brave tracing component with the service name you want to see in Zipkin.
        Tracing braveTracing = Tracing.newBuilder()
                .localServiceName("Spring Boot Web")
                .spanReporter(spanReporter)
                .build();

        // Finally, wrap this with the OpenTracing API
        return BraveTracer.create(braveTracing);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
