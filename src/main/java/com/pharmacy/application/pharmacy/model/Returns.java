package com.pharmacy.application.pharmacy.model;

import javax.persistence.*;
@Entity
@Table(name = "returnss")
public class Returns {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ret_id")
        private Integer ret_id;

        @Column(name = "or_id",nullable = false)
        private Integer or_id;

        @Column(name = "ret_type" , nullable = false)
        private String ret_type;

    public Integer getRet_id() {
        return ret_id;
    }

    public void setRet_id(Integer ret_id) {
        this.ret_id = ret_id;
    }

    public Integer getOr_id() {
        return or_id;
    }

    public void setOr_id(Integer or_id) {
        this.or_id = or_id;
    }

    public String getRet_type() {
        return ret_type;
    }

    public void setRet_type(String ret_type) {
        this.ret_type = ret_type;
    }
}
