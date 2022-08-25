package gg.innit.singularity.resource;

import org.jetbrains.annotations.NotNull;

public class Player {
    private final String id;
    private final String name;

    public Player(@NotNull String id, @NotNull String name) {
        this.id = id;
        this.name = name;
    }

    public @NotNull String getId() {
        return id;
    }

    public @NotNull String getName() {
        return name;
    }
}
