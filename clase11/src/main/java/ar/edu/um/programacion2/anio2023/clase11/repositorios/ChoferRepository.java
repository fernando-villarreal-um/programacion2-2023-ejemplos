package ar.edu.um.programacion2.anio2023.clase11.repositorios;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Automovil;
import ar.edu.um.programacion2.anio2023.clase11.entidades.Chofer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChoferRepository extends JpaRepository<Chofer, Long> {

    List<Chofer> findByAutomoviles(Automovil automovil);
    List<Chofer> findByAutomovilesMarca(String marca);
}
