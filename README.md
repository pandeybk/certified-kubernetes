If you find a bug in this project, please report it to the https://www.goglides.dev/ forum.


Run `mysql` docker container with volume mount.

```
podman volume create mysql-data
podman run -d -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -v mysql-data:/var/lib/mysql mysql
```


MYSQl
```
docker network create myapp
docker volume create mysql-data
docker run --name mysql --network myapp -d -e MYSQL_ROOT_PASSWORD=rootroot -e MYSQL_USER=goglides -e MYSQL_PASSWORD=passwordapp -p 3306:3306 -v mysql-data:/var/lib/mysql mysql
```

MYAPP
```
docker run -d --network myapp -p 8080:8080 myapp:0.1
```
