
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
kubectl run nginx --image=nginx --port=80 --labels="run=nginx" --restart=Never  

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

# Dry-run
kubectl run nginx --image=nginx --port=80 --labels="run=nginx" --restart=Never  --dry-run=client -o yaml
## --dry-run=client -o yaml is used to get the yaml output of the dry-run  command. This is useful to see what the command will do without actually running it. The object is not validated by the apiserver.
kubectl run nginx --image=nginx --port=80 --labels="run=nginx" --restart=Never  --dry-run=server -o yaml
## --dry-run=server -o yaml is used to get the yaml output of the dry-run command. If server strategy, submit server-side request without persisting the resources. The object is validated by the apiserver. 
kubectl run nginx --image=nginx --port=80 --labels="run=nginx" --restart=Never  --dry-run=none -o yaml
## --dry-run=none -o yaml is used to get the yaml output of the dry-run command. If none strategy, submit server-side request and presist the resources. The object is validated by the apiserver.
```


## Reference Blogs:

### Namespace
https://www.goglides.dev/bkpandey/kubernetes-namespaces-how-to-isolate-resources-in-a-cluster-all-you-need-to-know-for-cka-certification-3om6

### Pods
https://www.goglides.dev/bkpandey/understanding-kubernetes-part-1-pods-3pnd