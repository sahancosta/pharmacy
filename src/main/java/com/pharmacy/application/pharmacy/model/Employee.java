package com.pharmacy.application.pharmacy.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Integer emp_id;

    @Column(name = "emp_name", nullable = false)
    private String emp_name;

    @Column(name = "emp_address", nullable = false)
    private String emp_address;

    @Column(name = "emp_gender", nullable = false)
    private String emp_gender;

    @Column(name = "emp_email", nullable = false)
    private String emp_email;

    @Column(name = "empy_id", nullable = false)
    private Integer empy_id;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public Integer getEmpy_id() {
        return empy_id;
    }

    public void setEmpy_id(Integer empy_id) {
        this.empy_id = empy_id;
    }
}
