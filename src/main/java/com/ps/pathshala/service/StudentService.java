package com.ps.pathshala.service;


import com.ps.pathshala.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

String insertStudentData(Student s);

Student getStudent(int i);
}
