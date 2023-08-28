package ar.edu.um.programacion2.anio2023.clase11.dto;

import ar.edu.um.programacion2.anio2023.clase11.entidades.Automovil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternoDTO {
    protected Long chofer;
    protected Automovil automovil;
}
