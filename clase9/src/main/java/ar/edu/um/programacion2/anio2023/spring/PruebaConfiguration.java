package ar.edu.um.programacion2.anio2023.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class PruebaConfiguration {
    @Value("${clase9.conf1.parametro1}")
    protected String parametro1;

}
