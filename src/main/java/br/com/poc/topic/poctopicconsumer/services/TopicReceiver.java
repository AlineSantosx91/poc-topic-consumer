package br.com.poc.topic.poctopicconsumer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class TopicReceiver {

    private final Logger logger = LoggerFactory.getLogger(TopicReceiver.class);
    
    @JmsListener(destination = "topicoteste",
            containerFactory = "topicJmsListenerContainerFactory",
            subscription = "TopicReceiver")
    public void onMessage(String message) {
        logger.info("Received message from topic: {}", message);
    }
    
}
