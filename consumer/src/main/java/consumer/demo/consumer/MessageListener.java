package consumer.demo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class MessageListener {
// комит на гите
    @KafkaListener(topics="msg2", groupId = "demo.1")
    public void msgListener(ConsumerRecord<String, String> record){
        System.out.println(record.topic() + ' ' + record.value());
    } 
}
