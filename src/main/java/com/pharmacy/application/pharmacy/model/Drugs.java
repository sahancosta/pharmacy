package com.pharmacy.application.pharmacy.model;

import javax.persistence.*;

@Entity
@Table(name = "drugs")
public class Drugs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "drug_id")
    private Integer drug_id;

    @Column(name = "drug_name", nullable = false)
    private String drug_name;

    @Column(name = "drug_type", nullable = false)
    private String drug_type;

    @Column(name = "drug_price", nullable = false)
    private String drug_price;

    @Column(name = "drug_capacity", nullable = false)
    private String drug_capacity;

    @Column(name = "brand_id", nullable = false)
    private Integer brand_id;

    public Integer getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(Integer drug_id) {
        this.drug_id = drug_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getDrug_type() {
        return drug_type;
    }

    public void setDrug_type(String drug_type) {
        this.drug_type = drug_type;
    }

    public String getDrug_price() {
        return drug_price;
    }

    public void setDrug_price(String drug_price) {
        this.drug_price = drug_price;
    }

    public String getDrug_capacity() {
        return drug_capacity;
    }

    public void setDrug_capacity(String drug_capacity) {
        this.drug_capacity = drug_capacity;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }
}
