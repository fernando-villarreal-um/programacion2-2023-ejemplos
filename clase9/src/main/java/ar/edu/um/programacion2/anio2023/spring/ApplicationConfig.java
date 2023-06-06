package ar.edu.um.programacion2.anio2023.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ar.edu.um.programacion2.anio2023.spring")
public class ApplicationConfig {

    @Bean
    public Arranque arranque() {
        return new Arranque();
    }
}
