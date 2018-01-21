package com.credera.demo.opentracing.cross_section;

import brave.opentracing.BraveTracer;
import brave.Tracing;
import io.opentracing.Tracer;
import io.opentracing.contrib.okhttp3.TracingCallFactory;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import zipkin2.reporter.AsyncReporter;
import zipkin2.reporter.okhttp3.OkHttpSender;

public class Application {

    public static void main(String[] args) throws Exception {
        String zipkinEndpoint = System.getProperty("zipkin.endpoint", "http://localhost:9411/api/v2/spans");
        String heatmapEndpoint = System.getProperty("heatmap.endpoint", "http://localhost:8081/heatmap");
        System.out.printf("Zipkin endpoint: %s\nHeatmap endpoint: %s\n", zipkinEndpoint, heatmapEndpoint);

        // Initialize Zipkin

        // Configure a reporter, which controls how often spans are sent
        //   (the dependency is io.zipkin.reporter2:zipkin-sender-okhttp3)
        OkHttpSender sender = OkHttpSender.create(zipkinEndpoint);
        AsyncReporter<zipkin2.Span> spanReporter = AsyncReporter.create(sender);

        // Now, create a Brave tracing component with the service name you want to see in Zipkin.
        Tracing braveTracing = Tracing.newBuilder()
                .localServiceName("Java Cross Section")
                .spanReporter(spanReporter)
                .build();

        // Finally, wrap this with the OpenTracing API
        Tracer tracer = BraveTracer.create(braveTracing);

        // Create HTTP client for accessing activity data from heatmap service
        OkHttpClient okHttpClient = (new Builder()).build();
        Call.Factory client = new TracingCallFactory(okHttpClient, tracer);

        CrossSectionServer server = new CrossSectionServer(8082, heatmapEndpoint, tracer, client);
        server.start();
        server.blockUntilShutdown();
    }
}
