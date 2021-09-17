package com.pharmacy.application.pharmacy.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "or_id")
    private Integer or_id;

    @Column(name = "or_status",nullable = false)
    private String or_status;

    @Column(name = "pay_id" , nullable = false)
    private Integer pay_id;

    public Integer getOr_id() {
        return or_id;
    }

    public void setOr_id(Integer or_id) {
        this.or_id = or_id;
    }

    public String getOr_status() {
        return or_status;
    }

    public void setOr_status(String or_status) {
        this.or_status = or_status;
    }

    public Integer getPay_id() {
        return pay_id;
    }

    public void setPay_id(Integer pay_id) {
        this.pay_id = pay_id;
    }
}
