package ar.edu.um.programacion2.anio2023.clase11.servicios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Qualifier("memoria")
public class PersonaMemoriaService implements PersonaService {
    protected Map<Long, Persona> personas;

    public PersonaMemoriaService() {
        this.personas = new HashMap<>();
    }

    @Override
    public Persona get(long id) {
        Persona p = this.personas.get(id);
        return p;
    }

    @Override
    public void add(Persona p) {
        this.personas.put(p.getId(), p);
    }

    @Override
    public void remove(long id) {
        this.personas.remove(id);
    }

    @Override
    public void remove(Persona p) {
        this.personas.remove(p.getId());
    }

    @Override
    public List<Persona> getAll() {
        List<Persona> personas;
        personas = this.personas.values().stream().collect(Collectors.toCollection(ArrayList::new));
        return personas;
    }
}