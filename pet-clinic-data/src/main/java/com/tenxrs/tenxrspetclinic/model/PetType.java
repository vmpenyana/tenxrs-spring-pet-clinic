package com.tenxrs.tenxrspetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
