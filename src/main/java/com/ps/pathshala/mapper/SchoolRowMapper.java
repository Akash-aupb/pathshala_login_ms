package com.ps.pathshala.mapper;

import com.ps.pathshala.model.School;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolRowMapper implements RowMapper<School> {

    @Override
    public School mapRow(ResultSet rs, int rowNum) throws SQLException {
        School school = new School();
        school.setSchool_name(rs.getString("school_name"));
        school.setAddress(rs.getString("address"));
        school.setEmail_id(rs.getString("email_id"));
        school.setId(rs.getInt("id"));
        return school;
    }
}
