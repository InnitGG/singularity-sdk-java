package gg.innit.singularity.health;

/**
 * Provides application's health statuses to {@link HealthServer}.
 * See <a href="https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#types-of-probe">Kubernetes Pod probes</a>.
 */
public interface HealthProvider {
    /**
     * @return application's liveness.
     */
    default boolean isLive() {
        return true;
    }

    /**
     * @return application's readiness.
     */
    boolean isReady();
}
