# singularity-sdk-java

## Developing

### Generating CRDs

```bash
docker run \
  --rm \
  -v "$(pwd)/../singularity/charts/singularity-operator/crds:/tmp/crds" \
  -v "$(pwd):$(pwd)" \
  -v "${DOCKER_SOCK:-/var/run/docker.sock}:/var/run/docker.sock" \
  --network host \
  -it \
  ghcr.io/kubernetes-client/java/crd-model-gen:v1.0.6 \
  /generate.sh \
  -u /tmp/crds \
  -n gg.innit.singularity \
  -p gg.innit.singularity.impl.k8s.client \
  -o "$(pwd)"
```