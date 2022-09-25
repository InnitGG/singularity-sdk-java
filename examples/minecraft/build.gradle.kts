plugins {
    id("xyz.jpenilla.run-paper") version "1.0.6"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "gg.innit.singularity.example"

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation(project(":singularity-sdk-k8s"))
    implementation("io.fabric8:kubernetes-httpclient-okhttp:6.1.1")
    compileOnly("io.papermc.paper:paper-api:1.19.2-R0.1-SNAPSHOT")
}

tasks {
    shadowJar {
        archiveClassifier.set("")
    }
    assemble {
        dependsOn(getByName("shadowJar"))
    }
    runServer {
        minecraftVersion("1.19.2")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
