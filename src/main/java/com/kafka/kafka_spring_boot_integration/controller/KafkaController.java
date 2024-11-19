package com.kafka.kafka_spring_boot_integration.controller;

import com.kafka.kafka_spring_boot_integration.utils.MessageProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 19/11/24, Tuesday
 **/

@Slf4j
@RestController
public class KafkaController {

    @Autowired
    public MessageProducer messageProducer;

    @PostMapping(value = "/send")
    public ResponseEntity<?> sendMessageToKafka(
            @RequestParam(value = "message") String message) {
        String topic = "test";
        messageProducer.sendMessage(topic, message);
        return new ResponseEntity<>("Message sent: " + message, HttpStatus.OK);
    }
}
