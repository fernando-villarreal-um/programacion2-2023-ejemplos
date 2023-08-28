package ar.edu.um.programacion2.anio2023.clase10.clase10.configuracion;

import ar.edu.um.programacion2.anio2023.clase10.clase10.entidades.Persona;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "lalista", ignoreUnknownFields = true)
public class ListaConfiguration {
    protected List<Persona> personas;
}
