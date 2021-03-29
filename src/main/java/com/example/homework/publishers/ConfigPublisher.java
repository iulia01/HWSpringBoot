package com.example.homework.publishers;

import com.example.homework.events.ConfigEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Service
public class ConfigPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final ApplicationContext applicationContext;

    public ConfigPublisher(ApplicationEventPublisher applicationEventPublisher, ApplicationContext applicationContext) {
        this.applicationEventPublisher = applicationEventPublisher;
        this.applicationContext = applicationContext;
    }

    public void publisher(){
        ConfigEvent configEvent = applicationContext.getBean(ConfigEvent.class);
        applicationEventPublisher.publishEvent(configEvent);
    }
}
