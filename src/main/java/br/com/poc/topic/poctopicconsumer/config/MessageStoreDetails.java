package br.com.poc.topic.poctopicconsumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class MessageStoreDetails {

    @Value("${namespace.host}")
    private String host;

    @Value("${namespace.username}")
    private String username;

    @Value("${namespace.password}")
    private String password;
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getUrlString() throws UnsupportedEncodingException {
        return String.format("amqps://%1s?amqp.idleTimeout=3600000", host);
    }
}
