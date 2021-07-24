package com.ps.pathshala.controller;


import com.ps.pathshala.model.Student;
import com.ps.pathshala.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    StudentServiceImp studentServiceImp;

    @PostMapping(value="/insert",consumes = "application/json", produces = "application/json")
    String insertStudent(@RequestBody Student s){

       return studentServiceImp.insertStudentData(s);
    }

    @GetMapping("/get/{id}")
    Student getStudent(@PathVariable("id") int id){
        return studentServiceImp.getStudent(id);

    }
}
