package gg.innit.singularity.impl.k8s.adapter;

import gg.innit.singularity.impl.k8s.models.V1GameServerSpec;
import gg.innit.singularity.resource.GameServerSpec;

public final class V1GameServerSpecAdapter implements GameServerSpec {
    private final V1GameServerSpec spec;

    public V1GameServerSpecAdapter(V1GameServerSpec spec) {
        this.spec = spec;
    }
}
