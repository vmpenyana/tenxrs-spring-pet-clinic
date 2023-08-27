package com.tenxrs.tenxrspetclinic.bootstrap;

import com.tenxrs.tenxrspetclinic.model.Owner;
import com.tenxrs.tenxrspetclinic.model.Pet;
import com.tenxrs.tenxrspetclinic.model.PetType;
import com.tenxrs.tenxrspetclinic.model.Vet;
import com.tenxrs.tenxrspetclinic.services.OwnerService;
import com.tenxrs.tenxrspetclinic.services.PetTypeService;
import com.tenxrs.tenxrspetclinic.services.VetService;
import com.tenxrs.tenxrspetclinic.services.map.OwnerServiceMap;
import com.tenxrs.tenxrspetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;

    public DataLoader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Loading Vets....");

        Vet sofie = new Vet();
        sofie.setFirstName("Sofie");
        sofie.setLastName("Marie");

        Vet mike = new Vet();
        mike.setFirstName("Mike");
        mike.setLastName("Jackson");

        Vet elaine = new Vet();
        elaine.setFirstName("Elaine");
        elaine.setLastName("Marge");

        vetService.save(sofie);
        vetService.save(mike);
        vetService.save(elaine);

        System.out.println("Loaded Vets!");

        System.out.println("Loading Owners....");

        Owner peter = new Owner();
        peter.setFirstName("Peter");
        peter.setLastName("Parker");

        Owner ricky = new Owner();
        ricky.setFirstName("Ricky");
        ricky.setLastName("Dolphin");

        Owner tom = new Owner();
        tom.setFirstName("Tom");
        tom.setLastName("Widmer");

        ownerService.save(peter);
        ownerService.save(ricky);
        ownerService.save(tom);

        System.out.println("Loaded Owners!");

        System.out.println("Loading Pet types...");

        PetType cat = new PetType();
        cat.setName("Cat");

        PetType dog = new PetType();
        cat.setName("Dog");

        PetType reptile = new PetType();
        cat.setName("Reptile");

        petTypeService.save(cat);
        petTypeService.save(dog);
        petTypeService.save(reptile);

        System.out.println("Loaded pet types!");

    }
}
