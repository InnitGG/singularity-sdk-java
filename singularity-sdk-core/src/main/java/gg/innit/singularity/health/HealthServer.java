/*
 *     Singularity is an open-source game server orchestration framework
 *     Copyright (C) 2022 Innit Incorporated
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
