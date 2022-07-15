
```
docker volume create nginx_volume 
docker run -d --name nginx -v nginx_volume:/var/lib/mysql nginx
docker exec -it nginx sh

echo "hello nginx volume" > /var/lib/mysql/hello.txt
exit

docker stop nginx
docker rm nginx

docker run -d --name nginx -v nginx_volume:/var/lib/mysql nginx
cat /var/lib/mysql/hello.txt

docker container prune
docker volume rm nginx_volume
```