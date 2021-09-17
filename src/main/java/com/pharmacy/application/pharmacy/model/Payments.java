package com.pharmacy.application.pharmacy.model;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pay_id")
    private Integer pay_id;

    @Column(name = "pay_amt", nullable = false)
    private Integer pay_amt;

    @Column(name = "pay_type",nullable = false)
    private String pay_type;

    public Integer getPay_id() {
        return pay_id;
    }

    public void setPay_id(Integer pay_id) {
        this.pay_id = pay_id;
    }

    public Integer getPay_amt() {
        return pay_amt;
    }

    public void setPay_amt(Integer pay_amt) {
        this.pay_amt = pay_amt;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }
}
