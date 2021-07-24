package com.ps.pathshala.controller;


import com.ps.pathshala.email.mail;
import com.ps.pathshala.model.School;
import com.ps.pathshala.model.SchoolLogin;
import com.ps.pathshala.service.SchoolService;
import com.ps.pathshala.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;


@RestController
@ComponentScan(basePackages = {"com.ps.pathshala.service.SchoolService"})
@RequestMapping("/main")
public class LoginController {

    @Autowired
    SchoolService schoolService;

    @Autowired
    SendEmailService sendEmailService;


    @GetMapping("/get/{id}")
    public School getSchool(@PathVariable("id") int id) {

        School school = schoolService.getSchoolData(id);
        return school;
    }

    @GetMapping("/sendmail")
    public String mail() throws IOException, MessagingException {
        //sendEmailService.sendWelcomeEmail();
        return "Mail send";
    }


    @PostMapping(value = "/signup", consumes = "application/json", produces = "application/json")
    public int inertData(@RequestBody School school) {

        return schoolService.insertSchoolData(school);
    }

    @PostMapping(value = "/login", consumes = "application/json", produces = "application/json")
    public String loginData(@RequestBody SchoolLogin schoolLogin) {

        return schoolService.loginData(schoolLogin);
    }

}
