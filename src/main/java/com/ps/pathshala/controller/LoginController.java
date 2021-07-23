package com.ps.pathshala.controller;


import com.ps.pathshala.mapper.SchoolRowMapper;
import com.ps.pathshala.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;


@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("/get")
    public School hello(){

        String sql = "select id,school_name,email_id,address from SCHOOL_MAP;";
        School result = jdbcTemplate.queryForObject(sql, new SchoolRowMapper());
        //(result);
        return result;
    }


}
