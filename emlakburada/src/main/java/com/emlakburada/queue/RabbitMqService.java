package com.emlakburada.queue;

import com.emlakburada.config.RabbitMqConfig;
import com.emlakburada.model.EmailMessage;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService implements QueueService{
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private RabbitMqConfig config;


    @Override
    public void sendMessage(EmailMessage message) {
        rabbitTemplate.convertAndSend(config.getExchange(), config.getRoutingkey(), message);
    }
}
