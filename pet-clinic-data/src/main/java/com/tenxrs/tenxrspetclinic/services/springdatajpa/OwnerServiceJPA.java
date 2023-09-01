package com.tenxrs.tenxrspetclinic.services.springdatajpa;

import com.tenxrs.tenxrspetclinic.model.Owner;
import com.tenxrs.tenxrspetclinic.repositories.OwnersRepository;
import com.tenxrs.tenxrspetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

public class OwnerServiceJPA implements OwnerService {

    private final OwnersRepository ownersRepository;

    public OwnerServiceJPA(OwnersRepository ownersRepository) {
        this.ownersRepository = ownersRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownersRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownersRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownersRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownersRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownersRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownersRepository.findOwnerByLastName(lastName);
    }
}
