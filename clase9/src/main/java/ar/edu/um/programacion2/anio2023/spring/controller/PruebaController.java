package ar.edu.um.programacion2.anio2023.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pepe")
public class PruebaController {

    @RequestMapping("/uno")
    public String pepe() {
        return "ok";
    }
}
