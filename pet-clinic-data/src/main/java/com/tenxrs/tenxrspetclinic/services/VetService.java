package com.tenxrs.tenxrspetclinic.services;


import com.tenxrs.tenxrspetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName();

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
