package gg.innit.singularity.k8s.impl.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import gg.innit.singularity.resource.GameServerSpec;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1GameServerSpec implements GameServerSpec {
}
