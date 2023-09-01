package com.tenxrs.tenxrspetclinic.services.springdatajpa;

import com.tenxrs.tenxrspetclinic.model.Pet;
import com.tenxrs.tenxrspetclinic.repositories.PetsRepository;
import com.tenxrs.tenxrspetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetServiceJPA implements PetService {
    private final PetsRepository petsRepository;

    public PetServiceJPA(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petsRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petsRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petsRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petsRepository.deleteById(aLong);
    }
}
