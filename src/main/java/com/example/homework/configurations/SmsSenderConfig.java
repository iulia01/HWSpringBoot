package com.example.homework.configurations;


import com.example.homework.senders.DevSmsSender;
import com.example.homework.senders.ProdSmsSender;
import com.example.homework.senders.SmsSender;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

@Setter
public class SmsSenderConfig {

    @Bean
    @Profile("dev")
    public SmsSender devSmsSender(){
        return new DevSmsSender();
    }

    @Bean
    @Profile({"test", "prod"})
    public SmsSender prodSmsSender(){
        return new ProdSmsSender();
    }
}
