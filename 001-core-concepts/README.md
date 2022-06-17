
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


