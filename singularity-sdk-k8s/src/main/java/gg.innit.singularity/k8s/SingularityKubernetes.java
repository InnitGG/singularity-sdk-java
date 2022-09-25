package gg.innit.singularity.k8s;

import gg.innit.singularity.Singularity;
import gg.innit.singularity.k8s.impl.SingularityKubernetesImpl;

public interface SingularityKubernetes extends Singularity {
    /**
     * Creates a Singularity Kubernetes SDK with default in-cluster configuration.
     */
    static SingularityKubernetes createDefault() {
        return new SingularityKubernetesImpl();
    }
}
