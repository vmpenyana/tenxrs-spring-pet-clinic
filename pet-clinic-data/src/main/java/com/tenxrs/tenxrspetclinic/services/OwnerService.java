package com.tenxrs.tenxrspetclinic.services;

import com.tenxrs.tenxrspetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
