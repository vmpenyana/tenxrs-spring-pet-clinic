package com.tenxrs.tenxrspetclinic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Speciality extends BaseEntity {

    private String description;

    @ManyToOne
    private Vet vet;
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
