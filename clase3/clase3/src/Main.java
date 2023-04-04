import clases.Ejemplo;
import clases.Empleado;
import clases.MiExcepcion;
import clases.Persona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.arrancar4();
    }

    public void arrancar() {
        Persona persona = new Persona("Fernando", "Villarreal");
        persona.mover();
        Empleado empleado = new Empleado("Pepe", "Hongo", "L011",20);
        empleado.mover();

        Persona empleado2 = new Empleado("Pepe", "Honguito", "L012",15);
        empleado2.mover();
        Empleado empleado3 = (Empleado)empleado2;
        empleado3.moverEmpleado();
        System.out.println(empleado);
        System.out.println(empleado3);
        System.out.println(empleado2);

        String tipo = "Empleado";
        if(persona instanceof Empleado) {
            System.out.println("Es un " + tipo);
        }
        else {
            System.out.println(" NO es un " + tipo);
        }
    }

    public void arrancar2(){
        Persona persona = new Persona("Fernando", "Villarreal");
        Persona persona2 = new Persona("Fernando", "Villarreal");
        Persona persona3 = new Persona("Fernando", "Villarreal");
        Persona persona4 = new Persona("Fernando", "Villarreal");

        Set<Persona> personas = new HashSet<>();
        personas.add(persona);
        personas.add(persona2);

        if(persona.equals(persona3)) {
            System.out.println("Tiene los mismos atributos");
        }
        else {
            System.out.println("No son iguales");
        }

        Iterator<Persona> iter = personas.iterator();
        while(iter.hasNext()) {
            System.out.println("Iterando");
            Persona pers = iter.next();
            System.out.println(persona);
        }
    }

    public void arrancar3() {

        try {
            FileReader archivo = new FileReader("ruta/al/archivo.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        String dato = "hola";
        double num1 = Double.parseDouble(dato);


    }

    public void metodo1() throws MiExcepcion {
        Ejemplo ejemplo = new Ejemplo();
        ejemplo.metodo1(11);
    }

    public void metodo2() throws MiExcepcion {
        Ejemplo ejemplo = new Ejemplo();
        ejemplo.metodo1(11);
    }

    public void metodo3() {
        Ejemplo ejemplo = new Ejemplo();
        try {
            ejemplo.metodo3("Texto");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            //Algo mas
        }
    }

    public void arrancar4() {
        Empleado empleado = new Empleado("Pepe", "Hongo", "L011",20);
        Empleado empleado2 = new Empleado("Pepe", "Honguito", "L012",15);
        Empleado empleado3 = new Empleado("Pepe", "Honguito", "L012",15);

        Set<Empleado> empleados = new HashSet<>();
        empleados.add(empleado);
        empleados.add(empleado2);
        empleados.add(empleado3);

        Empleado empleado4 = new Empleado("Pepe", "Honguito4", "L012",40);
        Empleado empleado5 = new Empleado("Pepe", "Honguito5", "L012",8);

        List<Empleado> empleadosLista = new ArrayList<>();
        empleadosLista.add(empleado);
        empleadosLista.add(empleado2);
        empleadosLista.add(empleado3);
        empleadosLista.add(empleado4);
        empleadosLista.add(empleado5);
        Collections.sort(empleadosLista);

        String pepe = "";

    }


}

















