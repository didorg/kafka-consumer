package com.dido.kafkaconsumer.listener;

import com.dido.kafkaconsumer.model.Transfer;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final Gson gson;

    @Autowired // This annotation is NOT necessary, but it is always convenient
    public KafkaConsumer(Gson gson) {
        this.gson = gson;
    }

     @KafkaListener(topics = "kafka-example", groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "kafka-transfer")
    public void consumeJson(String transfer) {
        Transfer model = gson.fromJson(String.valueOf(transfer), Transfer.class);
        System.out.println("Model converted value: " + model);
    }
}
