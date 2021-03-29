package com.example.homework.configurations;


import com.example.homework.events.ConfigEvent;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app")
@Setter
public class SimpleConfig {
    private String first_config;
    @Value("${app.second-config.user}")
    private String user;
    @Value("${app.second-config.subconfig}")
    private String subconfig;
    @Value("${app.second-config.ttl}")
    private String ttl;

    @Bean
    public ConfigEvent configEvent() {
        return new ConfigEvent(this, first_config, user, subconfig, ttl);
    }

}
