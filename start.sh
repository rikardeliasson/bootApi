mvn clean install
sudo docker build -t springio/gs-spring-boot-docker .
sudo docker run -p 8080:8080 -t springio/gs-spring-boot-docker
