package com.ps.pathshala.model;


public class School {


   private  Integer id;

   private  String school_name;

   private  String address;

   private  String email_id;

    public School(Integer id, String school_name, String address, String email_id) {
        this.id = id;
        this.school_name = school_name;
        this.address = address;
        this.email_id = email_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", school_name='" + school_name + '\'' +
                ", address='" + address + '\'' +
                ", email_id='" + email_id + '\'' +
                '}';
    }
}
