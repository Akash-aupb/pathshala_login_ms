package com.ps.pathshala.controller;


import com.ps.pathshala.email.mail;
import com.ps.pathshala.model.School;
import com.ps.pathshala.service.SchoolService;
import com.ps.pathshala.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;


@RestController
@ComponentScan(basePackages = {"com.ps.pathshala.service.SchoolService"})
@RequestMapping("/login")
public class LoginController {

    @Autowired
    SchoolService schoolService;

    @Autowired
    SendEmailService sendEmailService;


    @GetMapping("/get")
    public School hello(){

        School school = schoolService.getSchoolData(1);
        return school;
    }

    @GetMapping("/sendmail")
    public String mail() throws IOException, MessagingException {
        //sendEmailService.sendWelcomeEmail();
        return "Mail send";
    }

    @PostMapping(value="/insert",consumes = "application/json", produces = "application/json")
    public int inertData(@RequestBody School school){

        return  schoolService.insertSchoolData(school);
    }


}
