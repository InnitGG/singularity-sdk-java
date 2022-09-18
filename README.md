# singularity-sdk-java

## Developing

### Generating CRDs

See https://github.com/fabric8io/kubernetes-client/blob/master/doc/java-generation-from-CRD.md.

```bash
export SINGULARITY_SRC="$HOME/dev/clients/innit/singularity"
export SINGULARITY_SDK_SRC="$HOME/dev/clients/innit/singularity-sdk-java"

mkdir /tmp/fabric8-gen && cd /tmp/fabric8-gen

export VERSION=$(wget -q -O - http://github.com/fabric8io/kubernetes-client/releases/latest --header "Accept: application/json" | jq -r '.tag_name' | cut -c 2-)
wget https://oss.sonatype.org/content/repositories/releases/io/fabric8/java-generator-cli/$VERSION/java-generator-cli-$VERSION.sh
chmod a+x java-generator-cli-$VERSION.sh

./java-generator-cli-$VERSION.sh -s "$SINGULARITY_SRC/charts/singularity-operator/crds/" -t "$SINGULARITY_SDK_SRC/src/main/java/"  
```