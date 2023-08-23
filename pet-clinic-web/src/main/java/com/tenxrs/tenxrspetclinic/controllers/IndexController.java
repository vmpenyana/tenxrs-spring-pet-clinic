package com.tenxrs.tenxrspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "", "futsek"})
    public String index() {

        return "index";
    }
}
