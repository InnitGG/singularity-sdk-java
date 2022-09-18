plugins {
    id("java")
}

group = "gg.innit.singularity"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:23.0.0")
    compileOnly("javax.validation:validation-api:2.0.1.Final")
    implementation("io.fabric8:kubernetes-client:6.1.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks {
    test {
        useJUnitPlatform()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
