package gg.innit.singularity.k8s;

import gg.innit.singularity.Singularity;
import gg.innit.singularity.k8s.impl.v1.V1SingularityKubernetesImpl;
import io.fabric8.kubernetes.client.KubernetesClient;

public interface SingularityKubernetes extends Singularity {
    /**
     * Creates a Singularity Kubernetes SDK with default in-cluster configuration.
     */
    static SingularityKubernetes createDefault() {
        return new V1SingularityKubernetesImpl();
    }

    /**
     * Creates a Singularity Kubernetes SDK with provided {@link KubernetesClient}.
     *
     * @param client the configured Kubernetes client.
     */
    static SingularityKubernetes create(KubernetesClient client) {
        return new V1SingularityKubernetesImpl(client);
    }
}
