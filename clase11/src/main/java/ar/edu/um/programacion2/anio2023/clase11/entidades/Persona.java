package ar.edu.um.programacion2.anio2023.clase11.entidades;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Persona {
    @Id
    @GeneratedValue
    protected long id;
    protected String nombre;
    protected String apellido;
    protected int codigo;
}