package com.ps.pathshala.model;

public class SchoolLogin {
    private  String school_name;

    private String password;

    public SchoolLogin() {
    }

    public SchoolLogin(String school_name, String password) {
        this.school_name = school_name;
        this.password = password;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
