package com.dido.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;

import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka-example", groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println("Consumed message: " + message);
    }

    //todo: add @KafkaListener for Transfer object
   /* @KafkaListener(topics = "kafka-transfer", groupId = "group_json")
    public void consumeJson(Transfer transfer){
        System.out.println("Consumed transfer: " + transfer);
    }*/
}
