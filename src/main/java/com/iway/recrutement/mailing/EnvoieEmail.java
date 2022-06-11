package com.iway.recrutement.mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Component
@ConditionalOnClass(JavaMailSender.class)
@SuppressWarnings("SpringJavaAutowiringInspection")
@Slf4j
@Service
public class EnvoieEmail {

    @Autowired
    private JavaMailSender mailSender;

    public void send(String receiver,String subject,String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("brahimb20@gmail.com");
        message.setTo(receiver);
        
        message.setText(text);
        message.setSubject(subject);
        mailSender.send(message);
    }
}


