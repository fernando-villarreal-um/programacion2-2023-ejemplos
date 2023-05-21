package ar.edu.um.programacion2.curso2023.clase7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    protected String nombre;
    protected String apellido;
    protected boolean activo;
    protected int codigo;
    protected String dni;
}
