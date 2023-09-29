# ELK stack example

demo showing logging and tracing in a simple springboot app

## ELK stack

The docker compose stack creates the ELK services

```shell
docker compose up
```

http://localhost:5601/app/home#/

    user: elastic
    password: changeme

to add indexes
stack management > kibana > index patterns
Create Index Patterns
name: logstash


## Springboot app

start app with following vm options
```shell
-javaagent:./elastic-apm-agent.jar
-Delastic.apm.service_name=my-cool-service
-Delastic.apm.application_packages=uk.co.sheffieldwebprogrammer.loggingexample
-Delastic.apm.server_url=http://localhost:8200
-Delastic.apm.secret_token=<TOKEN FROM ELASTIC>
```

following endpoints create logs and tracing 

```text
http://localhost:8080/test
http://localhost:8080/test2
```