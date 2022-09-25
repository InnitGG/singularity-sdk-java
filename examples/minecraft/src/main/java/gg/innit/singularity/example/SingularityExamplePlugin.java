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
