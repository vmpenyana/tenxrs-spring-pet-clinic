package com.tenxrs.tenxrspetclinic.repositories;

import com.tenxrs.tenxrspetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetsRepository extends CrudRepository<Pet, Long> {
}
