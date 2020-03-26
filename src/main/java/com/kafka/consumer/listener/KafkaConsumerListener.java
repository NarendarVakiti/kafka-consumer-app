package com.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.kafka.consumer.model.User;

@Service
public class KafkaConsumerListener {
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = "KAFKA-TOPIC", groupId = "group_id")
    public void consume(String message){
        logger.info("Consumed Message :: "+message);
    }

    @KafkaListener(topics = "KAFKA-TOPIC-JSON", groupId = "group_id_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user){
    	logger.info("Consumed Message :: "+ user);
    }
}
