# example-minecraft

## Running

**Build image:**

```bash
docker build -t localhost/singularity-example-minecraft -f examples/minecraft/Dockerfile . 
```

**Pushing image to node (k3s)**

```bash
docker save localhost/singularity-example-minecraft | ssh -C debian@stg-lon1-k8s-cp01 sudo k3s ctr images import -
```