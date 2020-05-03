package com.example.cloudstreamrabbitmqprovider8801.controller;

import com.example.cloudstreamrabbitmqprovider8801.mq.SendMesss2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private SendMesss2 messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}
 
