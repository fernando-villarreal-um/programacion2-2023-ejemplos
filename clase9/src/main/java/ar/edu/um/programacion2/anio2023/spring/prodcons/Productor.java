package ar.edu.um.programacion2.anio2023.spring.prodcons;

import ar.edu.um.programacion2.anio2023.spring.ApplicationContextProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Productor implements Runnable{
    private Almacenamiento almacenamiento;

    public Productor() {
        ApplicationContext context = ApplicationContextProvider.getContext();
        this.almacenamiento = context.getBean(Almacenamiento.class);

    }

    public Productor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            almacenamiento.agregar(i);
            System.out.println("Agregado: "+i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
