#java -Dserver.port=$1 -jar ./target/caching-sample-0.0.1-SNAPSHOT.jar
java -Dhazelcast.client.statistics.enabled=true -Dserver.port=$1 -jar ./target/caching-sample-0.0.1-SNAPSHOT.jar