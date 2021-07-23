package com.ps.pathshala.controller;


import com.ps.pathshala.mapper.SchoolRowMapper;
import com.ps.pathshala.model.School;
import com.ps.pathshala.service.SchoolService;
import com.ps.pathshala.service.SchoolServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;


@RestController
@ComponentScan(basePackages = {"com.ps.pathshala.service.SchoolService"})
@RequestMapping("/login")
public class LoginController {

    @Autowired
    SchoolService schoolService;


    @GetMapping("/get")
    public School hello(){

        School school = schoolService.getSchoolData(1);
        return school;
    }

    @PostMapping(value="/insert",consumes = "application/json", produces = "application/json")
    public int inertData(@RequestBody School school){
       return  schoolService.insertSchoolData(school);
    }


}
