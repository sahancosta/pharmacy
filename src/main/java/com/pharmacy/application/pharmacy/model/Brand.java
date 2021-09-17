package com.pharmacy.application.pharmacy.model;

import javax.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private Integer brand_id;


    @Column(name = "comp_name", nullable = false)
    private String comp_name;

    @Column(name = "comp_desc", nullable = false)
    private String comp_desc;

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getComp_desc() {
        return comp_desc;
    }

    public void setComp_desc(String comp_desc) {
        this.comp_desc = comp_desc;
    }
}
