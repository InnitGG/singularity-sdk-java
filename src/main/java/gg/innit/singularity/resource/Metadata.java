package gg.innit.singularity.resource;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface Metadata {
    @NotNull String namespace();

    @NotNull String name();

    @NotNull Map<String, String> labels();
}
