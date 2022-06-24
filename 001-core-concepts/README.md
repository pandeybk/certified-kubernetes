
## Namespace
```
# Create
kubectl create namespace test
kubectl create ns test
kubectl apply -f 001-test-namespace.yaml
kubectl apply --filename 001-test-namespace.yaml

# Delete
kubectl delete namespace test
kubectl delete ns test
kubectl delete -f 001-test-namespace.yaml
kubectl delete --filename 001-test-namespace.yaml

# Describe 
kubectl describe namespace test
kubectl describe ns test
kubectl describe -f 001-test-namespace.yaml
kubectl describe --filename 001-test-namespace.yaml
```

## Pod

```
## Pod
# Create
kubectl create -f 002-pod.yaml
kubectl create --filename 002-pod.yaml
kubectl apply -f 002-pod.yaml
kubectl apply --filename 002-pod.yaml

# Delete
kubectl delete -f 002-pod.yaml
kubectl delete --filename 002-pod.yaml
kubectl delete pod test-pod
kubectl delete pod test-pod --filename 002-pod.yaml

# Describe
kubectl describe pod test-pod
kubectl describe pod test-pod --filename 002-pod.yaml
kubectl describe -f 002-pod.yaml
kubectl describe --filename 002-pod.yaml 
```


## Reference Blogs:

### Namespace
https://www.goglides.dev/bkpandey/kubernetes-namespaces-how-to-isolate-resources-in-a-cluster-all-you-need-to-know-for-cka-certification-3om6

### Pods
https://www.goglides.dev/bkpandey/understanding-kubernetes-part-1-pods-3pnd