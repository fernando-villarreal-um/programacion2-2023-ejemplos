package ar.edu.um.programacion2.anio2023.clase11.controladores;


import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;
import ar.edu.um.programacion2.anio2023.clase11.repositorios.PersonaRepository;
import ar.edu.um.programacion2.anio2023.clase11.servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/persona/")
public class PersonaController {

    @Autowired
    @Qualifier("db")
    PersonaService personas;

    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/{id}")
    public Persona get(@PathVariable Long id) {
        Persona p = this.personas.get(id);
        return p;
    }

    @GetMapping("/{id}/nombre")
    public String sdfsdfsdfsdf(@PathVariable Long id) {
        Persona p = this.personas.get(id);
        return p.getNombre();
    }

    @GetMapping("/filtrar/{nombre}")
    public List<Persona> filtrar(@PathVariable String nombre) {
        List<Persona> personas = this.personaRepository.findByNombre(nombre);
        List<String> nombres = Arrays.asList("pepe","Maria");
        personas = this.personaRepository.findByNombreIn(nombres);
        return personas;
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
