package com.kafka.kafka_spring_boot_integration.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 18/11/24, Monday
 **/

@Slf4j
@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(
            String topic,
            String message) {
        kafkaTemplate.send(topic, message);
        log.info("massage send to topic : {}", topic);
    }
}
