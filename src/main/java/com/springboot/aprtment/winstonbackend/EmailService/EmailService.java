package com.springboot.aprtment.winstonbackend.EmailService;

import com.springboot.aprtment.winstonbackend.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;



    public EmailService sendRegistrationEmailSuccess(User user){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(user.getEmail());
        message.setSubject("registration Successful");
        message.setText("dear "+ user.getFirstName()+" your registration is successfull");

        javaMailSender.send(message);
        return null;
    }
}
