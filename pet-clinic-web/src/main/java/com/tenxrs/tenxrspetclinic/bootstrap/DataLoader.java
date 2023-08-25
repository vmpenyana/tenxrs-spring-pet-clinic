package com.tenxrs.tenxrspetclinic.bootstrap;

import com.tenxrs.tenxrspetclinic.model.Owner;
import com.tenxrs.tenxrspetclinic.model.Vet;
import com.tenxrs.tenxrspetclinic.services.OwnerService;
import com.tenxrs.tenxrspetclinic.services.VetService;
import com.tenxrs.tenxrspetclinic.services.map.OwnerServiceMap;
import com.tenxrs.tenxrspetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Loading Vets....");

        Vet sofie = new Vet();
        sofie.setId(1L);
        sofie.setFirstName("Sofie");
        sofie.setLastName("Marie");

        Vet mike = new Vet();
        mike.setId(2L);
        mike.setFirstName("Mike");
        mike.setLastName("Jackson");

        Vet elaine = new Vet();
        elaine.setId(3L);
        elaine.setFirstName("Elaine");
        elaine.setLastName("Marge");

        vetService.save(sofie);
        vetService.save(mike);
        vetService.save(elaine);

        System.out.println("Loaded Vets!");

        System.out.println("Loading Owners....");

        Owner peter = new Owner();
        peter.setId(1L);
        peter.setFirstName("Peter");
        peter.setLastName("Parker");

        Owner ricky = new Owner();
        ricky.setId(2L);
        ricky.setFirstName("Ricky");
        ricky.setLastName("Dolphin");

        Owner tom = new Owner();
        tom.setId(3L);
        tom.setFirstName("Tom");
        tom.setLastName("Widmer");

        ownerService.save(peter);
        ownerService.save(ricky);
        ownerService.save(tom);

        System.out.println("Loaded Owners!");

    }
}
