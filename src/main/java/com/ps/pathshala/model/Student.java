package com.ps.pathshala.model;

import java.util.Date;

public class Student {


    private int student_id;

    private Date student_dob;

    private String student_name;


    private String father_name;

    private String mother_name;

    private String address;

    private String contact_number;


    public Student() {
    }

    public Student(int student_id, String student_name, String father_name, String mother_name, String address, String contact_number, Date student_dob) {
        this.student_dob = student_dob;
        this.student_id = student_id;
        this.student_name = student_name;
        this.father_name = father_name;
        this.mother_name = mother_name;
        this.address = address;
        this.contact_number = contact_number;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public Date getStudent_dob() {
        return student_dob;
    }

    public void setStudent_dob(Date student_dob) {
        this.student_dob = student_dob;
    }


}
