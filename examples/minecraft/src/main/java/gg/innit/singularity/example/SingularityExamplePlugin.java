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

package gg.innit.singularity.example;

import gg.innit.singularity.CurrentGameServer;
import gg.innit.singularity.Singularity;
import gg.innit.singularity.k8s.SingularityKubernetes;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.kubernetes.client.okhttp.OkHttpClientFactory;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;

@SuppressWarnings("unused")
public class SingularityExamplePlugin extends JavaPlugin {
    private final Logger logger = getSLF4JLogger();
    private Singularity singularity;

    public void onEnable() {
        // This is a workaround for service loading issues
        KubernetesClient client = new KubernetesClientBuilder()
            .withHttpClientFactory(new OkHttpClientFactory())
            .build();
        this.singularity = SingularityKubernetes.create(client);

        CurrentGameServer current = this.singularity.current();
        if (current == null) return;

        current.get()
            .thenComposeAsync(gs -> {
                logger.info("Current GameServer state: {}", gs.status().state());
                logger.info("Requesting Ready state...");

                return current.requestReady();
            })
            .whenCompleteAsync((ignored, err) -> {
                if (err != null) {
                    logger.warn("An error occurred", err);
                } else {
                    logger.info("Successfully requested Ready state");
                }
            });
    }

    @Override
    public void onDisable() {
        try {
            this.singularity.close();
        } catch (Exception ignored) {
            // Ignore
        }
        this.singularity = null;
    }
}
