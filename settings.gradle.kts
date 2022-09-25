rootProject.name = "singularity-sdk-parent"

include(":example-minecraft")
project(":example-minecraft").projectDir = File("examples", "minecraft")

include(":singularity-sdk-core")
include(":singularity-sdk-k8s")