package ar.edu.um.programacion2.anio2023.clase10.clase10.controladores;

import ar.edu.um.programacion2.anio2023.clase10.clase10.entidades.Persona;
import ar.edu.um.programacion2.anio2023.clase10.clase10.servicios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona/")
public class PersonaController {

    @Autowired
    PersonaRepositorio personas;

    @GetMapping("/{codigo}")
    public Persona get(@PathVariable int codigo) {
        Persona p = this.personas.get(codigo);
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
