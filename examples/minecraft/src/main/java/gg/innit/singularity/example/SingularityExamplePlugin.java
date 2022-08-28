package gg.innit.singularity.example;

import gg.innit.singularity.Singularity;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

@SuppressWarnings("unused")
public class SingularityExamplePlugin extends JavaPlugin {
    private final Logger logger = getSLF4JLogger();
    private Singularity singularity;

    public void onEnable() {
        try {
            this.singularity = Singularity.kubernetes();
            this.singularity.getCurrentGameServer()
                .thenComposeAsync(gs -> {
                    if (gs != null) {
                        logger.info("Current GameServer state: {}", gs.getState());
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
        } catch (IOException e) {
            logger.error("Unable to initialize Singularity API", e);
        }
    }
}
