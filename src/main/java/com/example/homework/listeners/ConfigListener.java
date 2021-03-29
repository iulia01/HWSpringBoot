package com.example.homework.listeners;

import com.example.homework.events.ConfigEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ConfigListener implements ApplicationListener<ConfigEvent> {
    @Override
    public void onApplicationEvent(ConfigEvent event) {
        System.out.println(event.getMessage());
    }
}
