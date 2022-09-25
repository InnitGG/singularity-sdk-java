package gg.innit.singularity.example;

import gg.innit.singularity.Singularity;
import gg.innit.singularity.k8s.SingularityKubernetes;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;

@SuppressWarnings("unused")
public class SingularityExamplePlugin extends JavaPlugin {
    private final Logger logger = getSLF4JLogger();
    private Singularity singularity;

    public void onEnable() {
        this.singularity = SingularityKubernetes.createDefault();
        this.singularity.getCurrentGameServer()
            .thenComposeAsync(gs -> {
                if (gs != null) {
                    logger.info("Current GameServer state: {}", gs.status().state());
                    logger.info("Requesting Ready state...");

                    return gs.requestReady();
                } else {
                    throw new IllegalStateException("Unable to retrieve GameServer");
                }
            })
            .whenCompleteAsync((ignored, err) -> {
                if (err != null) {
                    logger.warn("An error occurred", err);
                } else {
                    logger.info("Successfully requested Ready state");
                }
            });
    }
}
