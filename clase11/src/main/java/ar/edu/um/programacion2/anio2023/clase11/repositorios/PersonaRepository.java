package ar.edu.um.programacion2.anio2023.clase11.repositorios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
