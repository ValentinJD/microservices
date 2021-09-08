package consumer.demo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class MessageListener {
    private int p =0;
// комит на гите
    @KafkaListener(topics="msg2", groupId = "demo.1")
    public void msgListener(ConsumerRecord<String, String> record){
        System.out.println(record.topic() + ' ' + record.value());
    }
    //1 комит
    //2 комит
    //3 комит
    private int p =0;
    private int z =0;
}
