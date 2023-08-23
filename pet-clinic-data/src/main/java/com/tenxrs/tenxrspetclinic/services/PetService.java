package com.tenxrs.tenxrspetclinic.services;


import com.tenxrs.tenxrspetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
