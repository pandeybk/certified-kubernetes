If you find a bug in this project, please report it to the https://www.goglides.dev/ forum.


Run `mysql` docker container with volume mount.

```
podman volume create mysql-data
podman run -d -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -v mysql-data:/var/lib/mysql mysql
```
