package com.ps.pathshala.service;

import com.ps.pathshala.email.mail;
import com.ps.pathshala.mapper.SchoolRowMapper;
import com.ps.pathshala.model.School;
import com.ps.pathshala.model.SchoolLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SchoolServiceImp implements SchoolService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Autowired
    SendEmailService sendEmailService;


    @Value("${db.select}")
    private String selectSql;

    @Value("${db.insert}")
    private String insertSql;

    @Value("${db.password.validate}")
    private String passwordValidate;

    School getSchoolData(School school) {
        School sc = new School();
        sc.setId(school.getId());
        sc.setSchool_name(school.getSchool_name());
        sc.setAddress(school.getAddress());
        sc.setEmail_id(school.getEmail_id());
        sc.setPassword(school.getPassword());

        return sc;
    }

    @Override
    public int insertSchoolData(School school) {

        int result = jdbcTemplate.update(insertSql, school.getId(), school.getSchool_name(), school.getAddress(), school.getEmail_id(), school.getPassword());

        if (result > 0) {

            StringBuffer msg = new StringBuffer();
            msg.append("Hi " + school.getSchool_name());
            msg.append("\n\nWelcome to Pathshala");
            mail m = new mail();
            m.setRecipient(school.getEmail_id());
            m.setSubject("Welcome Mail");
            m.setMessage(msg.toString());
            sendEmailService.sendWelcomeEmail(m);
            System.out.print("Mail send");
        }
        return result;
    }


    @Override
    public School getSchoolData(int id) {

        try {
            School school = jdbcTemplate.queryForObject(selectSql, new SchoolRowMapper(), id);
            return school;
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public String loginData(SchoolLogin schoolLogin) {
        if (jdbcTemplate.queryForObject(passwordValidate, Integer.class, schoolLogin.getSchool_name(), schoolLogin.getPassword()) == 1) {
            return "Login successful";
        } else return "Wrong password";

    }
}
