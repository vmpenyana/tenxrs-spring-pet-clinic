package com.tenxrs.tenxrspetclinic.repositories;

import com.tenxrs.tenxrspetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypesRepository extends CrudRepository<PetType, Long> {
}
