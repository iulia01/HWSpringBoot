package com.example.homework.controllers;

import com.example.homework.publishers.ConfigPublisher;
import com.example.homework.senders.SmsSender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@ConfigurationProperties("sms-sender")
public class TestController {

    private final ConfigPublisher configPublisher;
    private final ApplicationContext applicationContext;

    @Value("${sms-sender.phone-number}")
    private String phoneNumber;
    @Value("${sms-sender.text}")
    private String text;


    @GetMapping("/test")
    public void say(){
        configPublisher.publisher();
        SmsSender smsSender = applicationContext.getBean(SmsSender.class);
        smsSender.send(phoneNumber, text);
    }
}
