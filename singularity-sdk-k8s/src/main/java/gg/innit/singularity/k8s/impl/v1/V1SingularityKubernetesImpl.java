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

package gg.innit.singularity.k8s.impl.v1;

import gg.innit.singularity.CurrentGameServer;
import gg.innit.singularity.k8s.SingularityKubernetes;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class V1SingularityKubernetesImpl implements SingularityKubernetes {
    public static final String API_GROUP = "singularity.innit.gg";
    public static final String API_VERSION = "v1";

    public static final String ENV_GAMESERVER_NAMESPACE = "SINGULARITY_GAMESERVER_NAMESPACE";
    public static final String ENV_GAMESERVER_NAME = "SINGULARITY_GAMESERVER_NAME";

    private final KubernetesClient client;
    private final MixedOperation<V1GameServer, KubernetesResourceList<V1GameServer>, Resource<V1GameServer>> gameServers;
    private final CurrentGameServer currentGameServer;

    public V1SingularityKubernetesImpl() {
        this(new KubernetesClientBuilder().build());
    }

    public V1SingularityKubernetesImpl(KubernetesClient client) {
        this.client = client;
        this.gameServers = client.resources(V1GameServer.class);

        String namespace = System.getenv(ENV_GAMESERVER_NAMESPACE);
        String name = System.getenv(ENV_GAMESERVER_NAME);
        if (namespace != null && name != null) {
            this.currentGameServer = new V1CurrentGameServer(this, namespace, name);
        } else {
            this.currentGameServer = null;
        }
    }

    @Override
    public @Nullable CurrentGameServer current() {
        return this.currentGameServer;
    }

    public KubernetesClient client() {
        return client;
    }

    public MixedOperation<V1GameServer, KubernetesResourceList<V1GameServer>, Resource<V1GameServer>> gameServers() {
        return gameServers;
    }

    @Override
    public void close() {
        this.client.close();
    }
}
