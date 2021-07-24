package com.ps.pathshala.mapper;

import com.ps.pathshala.model.School;
import com.ps.pathshala.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s = new Student();
        s.setStudent_id(rs.getInt("student_id"));
        s.setStudent_dob(rs.getDate("student_dob"));
        s.setFather_name(rs.getString("father_name"));
        s.setMother_name(rs.getString("mother_name"));
        s.setAddress(rs.getString("address"));
        s.setContact_number(rs.getString("contact_number"));
        s.setStudent_name(rs.getString("student_name"));
        return s;
    }
}
