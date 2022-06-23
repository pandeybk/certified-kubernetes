## ReplicaSet

```
# Create
kubectl apply -f replicaset.yaml
kubectl apply --filename replicaset.yaml
kubectl create -f replicaset.yaml
kubectl create --filename replicaset.yaml

# Get
kubectl get replicasets
kubectl get replicaset
kubectl get rs

# Delete
kubectl delete replicaset replica-set
kubectl delete rs replica-set
kubectl delete -f replicaset.yaml
kubectl delete --filename replicaset.yaml

# Describe
kubectl describe replicaset replica-set
kubectl describe rs replica-set
kubectl describe -f replicaset.yaml
kubectl describe --filename replicaset.yaml
```

## Reference Blogs:

### Namespace

https://www.goglides.dev/nirajpdn/replicaset-how-it-manages-pods-in-k8s-cluster-1m2p
