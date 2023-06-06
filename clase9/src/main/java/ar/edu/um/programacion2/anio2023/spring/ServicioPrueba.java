package ar.edu.um.programacion2.anio2023.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPrueba {

    @Autowired
    PruebaConfiguration pruebaConfiguration;

    public void llamado1() {
        System.out.println("Llamado 1");
    }

    public void llamado2() {
        System.out.println("El parametro definido en las propiedades es: "+this.pruebaConfiguration.getParametro1());
    }
}
