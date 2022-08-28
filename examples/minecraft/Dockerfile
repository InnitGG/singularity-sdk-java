FROM gradle:7.4 AS build

ADD . /build
WORKDIR /build

RUN gradle --no-daemon :example-minecraft:shadowJar

FROM ghcr.io/cubxity/minecraft-server:paper-1.19.2-java17-slim-bullseye

COPY --from=build --chown=minecraft:minecraft /build/examples/minecraft/build/libs/*.jar /data/plugins/singularity.jar
