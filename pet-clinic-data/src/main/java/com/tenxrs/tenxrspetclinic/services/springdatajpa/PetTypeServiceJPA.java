package com.tenxrs.tenxrspetclinic.services.springdatajpa;

import com.tenxrs.tenxrspetclinic.model.PetType;
import com.tenxrs.tenxrspetclinic.repositories.PetTypesRepository;
import com.tenxrs.tenxrspetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeServiceJPA implements PetTypeService {
    private final PetTypesRepository petTypesRepository;

    public PetTypeServiceJPA(PetTypesRepository petTypesRepository) {
        this.petTypesRepository = petTypesRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypesRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypesRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypesRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypesRepository.deleteById(aLong);
    }
}
