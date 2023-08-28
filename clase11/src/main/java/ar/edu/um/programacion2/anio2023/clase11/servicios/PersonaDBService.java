package ar.edu.um.programacion2.anio2023.clase11.servicios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;
import ar.edu.um.programacion2.anio2023.clase11.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Qualifier("db")
public class PersonaDBService implements PersonaService {

    @Autowired
    protected PersonaRepository personaRepository;
    @Override
    public Persona get(long id) {
        Optional<Persona> persona = this.personaRepository.findById(id);
        if(persona.isPresent()) {
            return persona.get();
        }
        return null;
    }

    @Override
    public void add(Persona persona) {
        this.personaRepository.save(persona);
    }

    @Override
    public void remove(long id) {
        Optional<Persona> borrar = this.personaRepository.findById(id);
        this.personaRepository.delete(borrar.get());
    }

    @Override
    public void remove(Persona p) {
        this.personaRepository.delete(p);
    }

    @Override
    public List<Persona> getAll() {
        List<Persona> personas = this.personaRepository.findAll();
        return personas;
    }

}
