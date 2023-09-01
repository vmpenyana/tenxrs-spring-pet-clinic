package com.tenxrs.tenxrspetclinic.model;

import jakarta.persistence.Entity;

@Entity
public class Speciality extends BaseEntity {

    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
