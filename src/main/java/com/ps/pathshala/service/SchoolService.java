package com.ps.pathshala.service;


import com.ps.pathshala.model.School;
import com.ps.pathshala.model.SchoolLogin;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface SchoolService {

    int insertSchoolData(School school);

    School getSchoolData(int id);

    String loginData(SchoolLogin schoolLogin);


}
