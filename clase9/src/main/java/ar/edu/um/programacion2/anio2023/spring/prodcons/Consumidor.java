package ar.edu.um.programacion2.anio2023.spring.prodcons;

import ar.edu.um.programacion2.anio2023.spring.ApplicationContextProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


public class Consumidor implements Runnable{
    private Almacenamiento almacenamiento;

    public Consumidor() {
        ApplicationContext context = ApplicationContextProvider.getContext();
        this.almacenamiento = context.getBean(Almacenamiento.class);
    }

    public Consumidor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            int valor = almacenamiento.retirar();
            System.out.println("Retirado: "+valor);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
