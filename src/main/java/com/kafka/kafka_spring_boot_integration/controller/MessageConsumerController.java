package com.kafka.kafka_spring_boot_integration.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 19/11/24, Tuesday
 **/

@Slf4j
@Component
@EnableKafka
public class MessageConsumerController {

    @KafkaListener(topics = "test", groupId = "jayanta")
    public void listener(String data) {
        log.info("Data Received through KafkaListener : {}", data);
    }
}
