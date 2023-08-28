package ar.edu.um.programacion2.anio2023.clase11.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Chofer {
    @Id
    @GeneratedValue
    protected Long id;

    protected String nombre;
    protected String apellido;
    protected Integer edad;

    @OneToMany
    protected List<Automovil> automoviles;
}
