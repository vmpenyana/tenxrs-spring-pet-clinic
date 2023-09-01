package com.tenxrs.tenxrspetclinic.services.springdatajpa;

import com.tenxrs.tenxrspetclinic.model.Vet;
import com.tenxrs.tenxrspetclinic.repositories.VetsRepository;
import com.tenxrs.tenxrspetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetServiceJPA implements VetService {

    private final VetsRepository vetsRepository;

    public VetServiceJPA(VetsRepository vetsRepository) {
        this.vetsRepository = vetsRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetsRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetsRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetsRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetsRepository.deleteById(aLong);
    }
}
