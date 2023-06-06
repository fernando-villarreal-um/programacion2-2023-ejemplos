package ar.edu.um.programacion2.anio2023.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan("ar.edu.um.programacion2.anio2023.spring")
public class ApplicationConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("config.properties"));
        return configurer;
    }
    @Bean
    public Arranque arranque() {
        return new Arranque();
    }
}
