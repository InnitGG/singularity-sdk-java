# singularity-sdk-java

**singularity-sdk-java** is an SDK for [Singularity](https://github.com/innitgg/singularity) GameServers running in
Java.

## Quick Start

This quick start guide will use the default Kubernetes implementation of the SDK.

**Dependencies (build.gradle.kts):**

```kotlin
dependencies {
    implementation("gg.innit.singularity:singularity-sdk-k8s:<VERSION>")

    // We need to select an HTTP client to use. In this guide, we'll be using the OkHttp implementation.
    // See: https://github.com/fabric8io/kubernetes-client/blob/master/doc/FAQ.md#what-artifacts-should-my-project-depend-on
    implementation("io.fabric8:kubernetes-httpclient-okhttp:6.1.1") // or runtimeOnly(...)
}
```

## Developing

