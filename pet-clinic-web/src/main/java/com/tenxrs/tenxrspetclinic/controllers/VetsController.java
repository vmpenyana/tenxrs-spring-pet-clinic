package com.tenxrs.tenxrspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping("/vets")
    public String listVets(){

        return "vets/index";

    }

}
