package ar.edu.um.programacion2.curso2023.clase7.mockito;

import ar.edu.um.programacion2.curso2023.clase7.pruebas.Circulo;

public class OtroServicio {
    public boolean radio10(Circulo c) {
        System.out.println("Circulo: "+c.toString());
        System.out.println("Perimetro: "+c.calcularPerimetro());
        if(c.calcularPerimetro()==62.83185307179586) {
            return true;
        }
        return false;
    }

}
