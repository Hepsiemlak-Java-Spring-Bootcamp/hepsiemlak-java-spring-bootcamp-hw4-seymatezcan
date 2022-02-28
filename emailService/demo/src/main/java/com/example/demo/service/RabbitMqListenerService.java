package com.example.demo.service;

import com.example.demo.dto.EmailMessage;
import com.example.demo.model.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMqListenerService {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = "${emlakburada.rabbitmq.queue}")
    public void receiveMessage(EmailMessage message) {
        log.info(message.toString());
        emailService.send(message.getEmail());
        EmailMessage emailMessage=new EmailMessage();
        Email email=new Email();
        //email.setEmail(message.split(",")[0]);
        email.setEmail(message);
        //email.setEmailId(Integer.parseInt(message.split(",")[1]));
        log.info(String.valueOf(message));
        emailService.send(emailMessage.getEmail().split(",")[0]);
    }
}
