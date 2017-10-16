package com.samarthgupta.sfa_app.POJO;

/**
 * Created by samarthgupta on 03/10/17.
 */

public class Employee {

    String name, mobile, email, pass, dept,token;
    boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDept() {
        return dept;
    }

    public Employee(String name, String mobile, String email, String pass, String dept) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.pass = pass;
        this.dept = dept;
    }

    public Employee(String mobile, String pass) {
        this.mobile = mobile;
        this.pass = pass;
    }
}
