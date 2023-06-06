package ar.edu.um.programacion2.anio2023.spring;

import ar.edu.um.programacion2.anio2023.spring.prodcons.Almacenamiento;
import ar.edu.um.programacion2.anio2023.spring.prodcons.Consumidor;
import ar.edu.um.programacion2.anio2023.spring.prodcons.Productor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Arranque {

    @Autowired
    ServicioPrueba servicioPrueba;

    @Autowired
    Almacenamiento almacenamiento;
    public void arranque() {
        System.out.println("Arranque");
        this.servicioPrueba.llamado1();
        this.servicioPrueba.llamado2();

        // Creamos una instancia del productor y lo iniciamos
        Productor productor = new Productor();

        // Creamos una instancia del consumidor y lo iniciamos
        Consumidor consumidor = new Consumidor();

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(productor);
        es.submit(consumidor);

    }
}
