package com.example.homework.events;



import org.springframework.context.ApplicationEvent;


public class ConfigEvent extends ApplicationEvent {

    private final String firstConfig;
    private final String user;
    private final String subconfig;
    private final String ttl;
    public ConfigEvent(Object source, String firstConfig, String user, String subconfig, String ttl) {
        super(source);
        this.firstConfig = firstConfig;
        this.user = user;
        this.subconfig = subconfig;
        this.ttl = ttl;
    }

    public String getMessage(){
        return "first-config: " + firstConfig + "\n" +
                "second-config: " + "\n    " +
                "user: " + user + "\n    " +
                "subconfig: " + subconfig + "\n    " +
                "ttl: " + ttl +"\n";
    }
}
