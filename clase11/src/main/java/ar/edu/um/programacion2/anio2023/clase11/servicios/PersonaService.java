package ar.edu.um.programacion2.anio2023.clase11.servicios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;

import java.util.List;

public interface PersonaService {
    public Persona get(long id);
    public void add(Persona persona);
    public void remove(long id);
    public void remove(Persona p);
    public List<Persona> getAll();
}
