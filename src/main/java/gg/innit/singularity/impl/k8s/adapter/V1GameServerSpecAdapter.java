package gg.innit.singularity.impl.k8s.adapter;

import gg.innit.singularity.resource.GameServerSpec;

public final class V1GameServerSpecAdapter implements GameServerSpec {
    private final gg.innit.singularity.impl.k8s.v1.GameServerSpec spec;

    public V1GameServerSpecAdapter(gg.innit.singularity.impl.k8s.v1.GameServerSpec spec) {
        this.spec = spec;
    }
}
