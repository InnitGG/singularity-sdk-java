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

import gg.innit.singularity.k8s.impl.adapter.ObjectMetaAdapter;
import gg.innit.singularity.resource.GameServer;
import gg.innit.singularity.resource.GameServerSpec;
import gg.innit.singularity.resource.GameServerStatus;
import gg.innit.singularity.resource.Metadata;
import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Kind;
import io.fabric8.kubernetes.model.annotation.Version;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
@Group(V1SingularityKubernetesImpl.API_GROUP)
@Version(V1SingularityKubernetesImpl.API_VERSION)
@Kind("GameServer")
public class V1GameServer extends CustomResource<V1GameServerSpec, V1GameServerStatus> implements Namespaced, GameServer {
    @Override
    public @NotNull Metadata meta() {
        return new ObjectMetaAdapter(this.getMetadata());
    }

    @Override
    public @NotNull GameServerSpec spec() {
        return this.getSpec();
    }

    @Override
    public @NotNull GameServerStatus status() {
        return this.getStatus();
    }
}
