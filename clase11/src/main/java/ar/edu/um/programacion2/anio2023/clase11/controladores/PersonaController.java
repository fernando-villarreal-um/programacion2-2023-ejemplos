package ar.edu.um.programacion2.anio2023.clase11.controladores;


import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;
import ar.edu.um.programacion2.anio2023.clase11.servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona/")
public class PersonaController {

    @Autowired
    @Qualifier("db")
    PersonaService personas;

    @GetMapping("/{id}")
    public Persona get(@PathVariable Long id) {
        Persona p = this.personas.get(id);
        return p;
    }

    @GetMapping
    public List<Persona> getAll() {
        List<Persona> personas = this.personas.getAll();
        return personas;
    }

    @PostMapping
    public Persona post(@RequestBody Persona persona) {
        this.personas.add(persona);
        return persona;
    }
}
