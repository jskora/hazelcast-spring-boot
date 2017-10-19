# Hazelcast Spring Boot Integration


## Steps to run

### Start Eureka 

Run the following from the sample-eureka-server project:

``` 
mvn clean install
java -jar ./target/sample-eureka-server-0.0.1-SNAPSHOT.jar 
```

### Start Spring Boot Admin

Run the following from the boot-admin project:

``` 
mvn clean install
java -jar ./target/sample-boot-admin-0.0.1-SNAPSHOT.jar
```

### (Optional) Start Hazelcast Mancenter

Run the following from the hazelcast-management-center/management-center-3.7.8:

```
./startManCenter.sh 8070 mancenter
```

Notice that this version *has* to be the same as the hazelcast version of the running project.


### Start the caching-service

Runt the following from the caching-sample project:

``` 
mvn clean install
```

Then in 3 different sessions run the following:

```
./start-server.sh 9080
./start-server.sh 9081
./start-server.sh 9082
```

This should start 3 different processes with our caching-sample service.

### Testing cache

Run the following:

```
curl localhost:9080/api/hola/alberto
curl localhost:9081/api/hola/alberto
curl localhost:9082/api/hola/alberto
```

