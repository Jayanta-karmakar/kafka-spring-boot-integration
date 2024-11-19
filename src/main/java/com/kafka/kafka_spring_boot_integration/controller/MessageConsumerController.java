package com.kafka.kafka_spring_boot_integration.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 19/11/24, Tuesday
 **/

@Slf4j
@Component
public class MessageConsumerController {

    @KafkaListener(topics = "test", groupId = "jayantakarmakar998")
    public void listener(Object data) {
        log.info("Data Received through KafkaListener : {}", data);
    }
}
