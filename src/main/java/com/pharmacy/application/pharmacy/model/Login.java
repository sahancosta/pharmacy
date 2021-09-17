package com.pharmacy.application.pharmacy.model;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empy_id")
    private Integer empy_id;

    @Column(name = "emp_usename")
    private String emp_usename;

    @Column(name = "emp_password")
    private String emp_password;

    public Integer getEmpy_id() {
        return empy_id;
    }

    public void setEmpy_id(Integer empy_id) {
        this.empy_id = empy_id;
    }

    public String getEmp_usename() {
        return emp_usename;
    }

    public void setEmp_usename(String emp_usename) {
        this.emp_usename = emp_usename;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }
}
