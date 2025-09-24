package com.example.example.controller;


import com.example.example.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private KafkaProducer producer;

    @PostMapping("/send")
    public String send(@RequestParam String message) {
        producer.sendMessage(message);
        return "Message sent!";
    }
}
