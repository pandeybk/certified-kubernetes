## Deployment

```
# Create with manifest file (yaml)
kubectl apply -f deployment.yaml
kubectl apply --filename deployment.yaml
kubectl create -f deployment.yaml
kubectl create --filename deployment.yaml

# Create with CLI
kubectl create deployment portfolio-deployment --image=nirajpdn/react-app:v1 # Need to specify image for container
kubectl create deploy portfolio-deployment --image=nirajpdn/react-app:v1

# Dry run
kubectl create deployment portfolio-deployment --image=nirajpdn/react-app:v1 --dry-run=client # It will not create object
kubectl create deployment portfolio-deployment --image=nirajpdn/react-app:v1 --dry-run=server # It will not create object
kubectl create deployment portfolio-deployment --image=nirajpdn/react-app:v1 --dry-run=none # It will create object

# Get
kubectl get deployments
kubectl get deployment
kubectl get deploy
kubectl get deploy -o wide # For more details about deployments

# Edit
kubectl edit deployments portfoilo-deployment # Default yaml format
kubectl edit deployment portfoilo-deployment -o json # JSON format
kubectl edit deploy portfolio-deployment
kubectl edit deployments/portfoilo-deployment
kubectl edit deployment/portfoilo-deployment
kubectl edit deploy/portfoilo-deployment


# Delete
kubectl delete deployments portfoilo-deployment
kubectl delete deployment portfoilo-deployment
kubectl delete deploy portfolio-deployment
kubectl delete deployments/portfoilo-deployment
kubectl delete deployment/portfoilo-deployment
kubectl delete deploy/portfolio-deployment
kubectl delete -f deployment.yaml
kubectl delete --filename deployment.yaml

# Describe
kubectl describe deployments portfolio-deployment
kubectl describe deployment portfolio-deployment
kubectl describe deploy portfolio-deployment
kubectl describe deployments/portfolio-deployment
kubectl describe deployment/portfolio-deployment
kubectl describe deploy/portfolio-deployment
kubectl describe -f replicaset.yaml
kubectl describe --filename replicaset.yaml

# Update Image
kubectl set image deployment portfolio-deployment app-container=nirajpdn/react-app:v2
kubectl set image deployment/portfolio-deployment app-container=nirajpdn/react-app:v2
```

## Reference Blogs:

### Deployment

https://www.goglides.dev/nirajpdn/deployment-object-in-kubernetes-why-deployment-object-over-replicaset-2cnf
