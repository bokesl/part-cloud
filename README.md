
consul

nohup ./consul agent -server -ui -bootstrap-expect=1 -data-dir=/Volumes/starfire/datareel/consul/ &


docker consul

docker run -d  -p 8500:8500/tcp -v /Volumes/starfire/datareel/consul:/consul/data --name consul  consul agent -server -ui -bootstrap-expect=1 -client=0.0.0.0


rabbitmq

sbin/rabbitmq-server start &


elasticsearch

bin/elasticsearch -d


kibana

nohup bin/kibana &


zipkin

nohup java -jar zipkin-server-2.12.9-exec.jar --STORAGE_TYPE=elasticsearch --ES_HOSTS=http://localhost:9200 --RABBIT_ADDRESSES=localhost &


zipkin-dependencies

STORAGE_TYPE=elasticsearch ES_HOSTS=http://localhost:9200 java -jar zipkin-dependencies-2.4.1.jar


docker-compose -f docker-compose-build.yml build

docker-compose -f docker-compose-up1.yml up

docker-compose -f docker-compose-up2.yml up


http://localhost:8768/hystrix  ==>>  http://localhost:8768/turbine.stream
