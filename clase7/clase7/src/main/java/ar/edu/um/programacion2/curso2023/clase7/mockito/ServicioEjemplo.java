package ar.edu.um.programacion2.curso2023.clase7.mockito;

import ar.edu.um.programacion2.curso2023.clase7.pruebas.Circulo;

public class ServicioEjemplo {

    public int suma(int a, int b) {
        return a+b;
    }

    public int resta(int a, int b) {
        return a-b;
    }

    public int multiplicacion(int a, int b) {
        return a*b;
    }

    public int potencia(int a, int b) {
        return a^b;
    }

    public Circulo devolverCirculo(String nombre, int radio) {
        Circulo c = new Circulo();
        c.setNombre(nombre);
        c.setRadio(radio);
        return c;
    }

}
