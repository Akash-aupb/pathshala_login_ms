package com.ps.pathshala.service;

import com.ps.pathshala.mapper.StudentRowMapper;
import com.ps.pathshala.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("${db.student.insert}")
    private String insertSql;

    @Value("${db.student.select}")
    private String selectSql;

    @Override
    public String insertStudentData(Student s) {
        int result = jdbcTemplate.update(insertSql, s.getStudent_id(), s.getStudent_dob(), s.getFather_name(), s.getMother_name(), s.getAddress(), s.getContact_number(), s.getStudent_name());

        if (result > 0) {
            return "Data inserted";
        }
        return "Data not inserted";
    }

    @Override
    public Student getStudent(int id) {

        try {
            Student s = jdbcTemplate.queryForObject(selectSql, new StudentRowMapper(), id);
            return s;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
