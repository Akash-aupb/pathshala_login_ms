package com.ps.pathshala.service;

import com.ps.pathshala.email.mail;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;


@Service
public interface SendEmailService {

    void sendWelcomeEmail(mail m);

    void sendMailWithAttachments(mail mail) throws MessagingException;
}
