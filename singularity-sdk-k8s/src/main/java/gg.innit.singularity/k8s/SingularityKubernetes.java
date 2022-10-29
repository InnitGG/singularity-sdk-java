/*
 *     Singularity is an open-source game server orchestration framework
 *     Copyright (C) 2022 Innit Incorporated
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
