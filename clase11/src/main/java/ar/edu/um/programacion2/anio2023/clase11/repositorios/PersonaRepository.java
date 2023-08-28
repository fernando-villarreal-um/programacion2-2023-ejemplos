package ar.edu.um.programacion2.anio2023.clase11.repositorios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Persona;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    //Creación de consultas
    // #1 Métodos con nombres de campos - Derived Query
    List<Persona> findByNombre(String nombre);

    List<Persona> findByNombreIn(Collection<String> nombres);

    // #2 Usando JPQL
    @Query("SELECT p from Persona p WHERE p.nombre = :nombre")
    List<Persona> buscarPorNombre(@Param("nombre") String nombre);

    // #3 Usando SQL Nativo
    @Query(value = "SELECT * from persona WHERE nombre = :nombre", nativeQuery = true)
    List<Persona> buscarPorNombreSQL(@Param("nombre") String nombre);

    // #4 Actualizando datos
    @Modifying
    @Transactional
    @Query("UPDATE Persona p set p.apellido = :apellido WHERE p.id = :id")
    int actualizarPersona(@Param("apellido") String apellido, @Param("id") Long id);
}
