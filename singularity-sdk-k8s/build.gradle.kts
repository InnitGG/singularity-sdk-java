dependencies {
    api(project(":singularity-sdk-core"))

    api("io.fabric8:kubernetes-client:6.1.1") {
        exclude(module = "kubernetes-httpclient-okhttp")
    }
}