package com.tenxrs.tenxrspetclinic.repositories;

import com.tenxrs.tenxrspetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitsRepository extends CrudRepository<Visit, Long> {
}
