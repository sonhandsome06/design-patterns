package kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.internals.NoOpConsumerRebalanceListener;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.common.utils.LogContext;
import org.slf4j.spi.LocationAwareLogger;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
public class MyFirstProducer {
    public static void main(String[] args) throws InterruptedException {
        final var topic = "sonph";

        final Map<String, Object> config =
                Map.of(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                        "localhost:9092",
                        ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                        StringSerializer.class.getName(),
                        ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                        StringSerializer.class.getName());
        new Thread(() -> {
            try (var producer = new KafkaProducer<String, String>(config)) {
                while (true) {
                    producer.send(new ProducerRecord<>(topic, "myKey", "hello Kafka"));
//                    producer.send(new ProducerRecord<>(topic, 2, "myKey2", "hello Kafka 2"));
//                    producer.send(new ProducerRecord<>(topic, 3, "myKey3", "hello Kafka 3"));
//                    producer.send(new ProducerRecord<>(topic, 4, "myKey", "hello Kafka"));
                    System.out.println("Sent....");
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            final Map<String, Object> properties =
                    Map.of(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                            "localhost:9092",
                            ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                            StringDeserializer.class.getName(),
                            ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                            StringDeserializer.class.getName(), ConsumerConfig.GROUP_ID_CONFIG, UUID.randomUUID().toString());

            TopicPartition partition1 = new TopicPartition(topic, 2);

            NoOpConsumerRebalanceListener rebalanceListener = new NoOpConsumerRebalanceListener();
            rebalanceListener.onPartitionsAssigned(List.of(partition1));

            try (var consumer = new KafkaConsumer<String, String>(properties)) {
                consumer.subscribe(List.of(topic), rebalanceListener);


                while (true) {
                    ConsumerRecords<String, String> records = consumer.poll(Duration.ofSeconds(3));
                    for (ConsumerRecord<String, String> record : records) {

                        System.out.println("received: key: " + record.key()+ " - " + record.value());
                    }
                }
            }
        }).start();


    }
}
