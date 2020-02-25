项目运行步骤：
一 镜像构建
  1、构建基础镜像：openjdk:netcat = openjdk:latest + netcat 
  2、构建特殊镜像：zipkin:netcat
   cd Dockerfiles 
   docker build -f Dockerfile_zipkin . -t openzipkin/zipkin:netcat
  3  构建项目镜像
   mvn clean package
   mvn docker:build
二 镜像部署
  docker-compose up 

运行处理：
zipkin-dependencies
docker run -e STORAGE_TYPE=elasticsearch -e ES_HOSTS=elasticsearch:9200 --network=part_cloud_net openzipkin/zipkin-dependencies

监控管理：
http://localhost:8768/hystrix  ==>>  http://localhost:8768/turbine.stream

   

