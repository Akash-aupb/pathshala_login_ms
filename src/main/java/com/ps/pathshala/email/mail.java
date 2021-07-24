package com.ps.pathshala.email;

import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

@Component
public class mail {

    private String recipient;
    private String subject;
    private String message;


    public mail() {
    }

    public mail(String recipient, String subject, String message) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
    }

    public  String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


