allprojects {
    group = "gg.innit.singularity"
    version = "0.1.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    afterEvaluate {
        dependencies {
            "compileOnly"("org.jetbrains:annotations:23.0.0")

            "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.9.0")
            "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.9.0")
        }
    }

    tasks.withType<Test>() {
        useJUnitPlatform()
    }
    configure<JavaPluginExtension>() {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(8))
        }
    }
}
