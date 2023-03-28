import entidades.Empleado;
import entidades.Persona;
import obreros.Lijador;
import obreros.Pintor;

import java.util.ArrayList;
import java.util.List;

public class Arranque {

    public static void main(String[] args) {
        Arranque arranque = new Arranque();
        arranque.arrancar2();
    }

    public void arrancar() {
        System.out.println("Vamos a pintar una pared");
        Pintor pintor = new Pintor();
        Lijador lijador = new Lijador();
        boolean resultadoPintar = pintor.sePuedePintar(false);
        if(true) {
        }

        if(!resultadoPintar) {
            System.out.println("La pared no se puede pintar");
            boolean resultadoLijar = lijador.sePuedeLijar(true);
            if(resultadoLijar ) {
                // Se puede lijar
            }
            else {
                // No se puede lijar
            }
        }
    }

    public void arrancar2() {
        Persona persona1 = new Persona("Fernando", "Villarreal");
        persona1.hacerAlgo();

        Empleado empleado1 = new Empleado("Fernando", "Villarreal", "l001");
        empleado1.hacerAlgo();
        empleado1.funcionEmpleado();

        Persona persona2 = (Persona) empleado1;
        persona2.hacerAlgo();

        if (persona2 instanceof Persona) {
            System.out.println("persona2 es del tipo persona");
        }

        if (persona2 instanceof Empleado) {
            System.out.println("Persona2 es del tipo empleado");
        }
        // Esto da error
        //persona2.funcionEmpleado();

        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(empleado1);

        for(Persona p : personas) {
            p.hacerAlgo();
        }
    }
}
