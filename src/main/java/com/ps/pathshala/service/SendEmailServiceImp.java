package com.ps.pathshala.service;

import com.ps.pathshala.email.mail;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class SendEmailServiceImp implements SendEmailService {

    private final JavaMailSender javaMailSender;



    public SendEmailServiceImp(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendWelcomeEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();

        mail m = new mail();

        m.setMessage("welcome to pathshala");
        m.setSubject("Welcome mail");
        m.setRecipient("akashaupb@gmail.com");
        msg.setTo(m.getRecipient(),m.getRecipient());

        msg.setSubject(m.getSubject());
        msg.setText(m.getMessage());

        javaMailSender.send(msg);

    }

    @Override
    public void sendMailWithAttachments(mail mail) throws MessagingException {

    }
}
