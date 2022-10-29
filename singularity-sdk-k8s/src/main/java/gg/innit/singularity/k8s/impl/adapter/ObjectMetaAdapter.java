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

package gg.innit.singularity.k8s.impl.adapter;

import gg.innit.singularity.resource.Metadata;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;

@ApiStatus.Internal
public final class ObjectMetaAdapter implements Metadata {
    private final ObjectMeta meta;

    public ObjectMetaAdapter(ObjectMeta meta) {
        this.meta = meta;
    }

    @Override
    public @NotNull String namespace() {
        return Objects.requireNonNull(this.meta.getNamespace());
    }

    @Override
    public @NotNull String name() {
        return Objects.requireNonNull(this.meta.getName());
    }

    @Override
    public @NotNull Map<String, String> labels() {
        return Objects.requireNonNull(this.meta.getLabels());
    }
}
