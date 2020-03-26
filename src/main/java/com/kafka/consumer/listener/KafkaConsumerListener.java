package com.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.kafka.consumer.model.User;

@Service
public class KafkaConsumerListener {

    @KafkaListener(topics = "KAFKA-TOPIC", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed Message :: "+ message);
    }

    @KafkaListener(topics = "KAFKA-TOPIC-JSON", groupId = "group_id_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user){
        System.out.println("Consumed Message :: "+ user);
    }
}
