### Setting Up Kafka in Local
Kafka can be downloaded from https://kafka.apache.org/downloads this link. It is safe to download the latest version of Kafka.

1. **Downloading Kafka** : Once the download is complete unzip the dowloaded file.
```bash
cd <unzipped_kafka_folder>
```
2. **Starting the zookeeper** : Once you go into the Kafka folder using the above command we can start the zookeeper with the following command.

```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

One of the issues I faced during this is a build error as follows.
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
Classpath is empty. Please build the project first.
```
to fix this I first ran the following command
```bash
 ./gradlew jar -PscalaVersion=2.13.11
```
Once this command is completed you can try the zookeeper command once again it should start smoothly.
3. **Starting the Brokers** : Next step is to start the Kafka broker service with the following command. `Note : Kafka brokers by default use port 9092` incase you are running any other application on the same port please changes accordingly.

```bash
$ bin/kafka-server-start.sh config/server.properties
```
`Note: you should open two terminals and run step 1 and 2 simultaneously.`
4. Use the api after application start up to publish a json data to publish the data to the topic.
```json
{
  "playName" : "bulgogi",
  "actNumber" : 1,
  "author" : "Asmodeus"
}
```

5. **Consume messages from the topic** : The below command can be used to consume a message from the topic
```bash
$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
{
  "playName" : "bulgogi",
  "actNumber" : 1,
  "author" : "Asmodeus"
}
```
