package gg.innit.singularity.health;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * A simple HTTP Server serving as liveness probe and readiness probe.
 * See <a href="https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#types-of-probe">Kubernetes Pod probes</a>.
 */
public final class HealthServer implements AutoCloseable {
    private final HttpServer server;

    public HealthServer(HttpServer server, HealthProvider provider) {
        this.server = server;

        server.createContext("/", exchange -> {
            exchange.sendResponseHeaders(404, 0);
            exchange.close();
        });

        server.createContext("/livez", exchange -> {
            boolean ok = false;
            try {
                ok = provider.isLive();
            } catch (Throwable t) {
                // Unable to process
            }
            exchange.sendResponseHeaders(ok ? 200 : 503, 0);
            exchange.close();
        });
        server.createContext("/readyz", exchange -> {
            boolean ok = false;
            try {
                ok = provider.isReady();
            } catch (Throwable t) {
                // Unable to process
            }
            exchange.sendResponseHeaders(ok ? 200 : 503, 0);
            exchange.close();
        });
        server.start();
    }


    public static HealthServer create(int port, HealthProvider provider) throws IOException {
        return create(new InetSocketAddress("0.0.0.0", port), provider);
    }

    public static HealthServer create(InetSocketAddress address, HealthProvider provider) throws IOException {
        return new HealthServer(HttpServer.create(address, 0), provider);
    }

    @Override
    public void close() {
        this.server.stop(0);
    }
}
