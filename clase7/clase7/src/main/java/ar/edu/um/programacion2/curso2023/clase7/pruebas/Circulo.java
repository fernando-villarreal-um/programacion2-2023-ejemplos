package ar.edu.um.programacion2.curso2023.clase7.pruebas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circulo {
    protected String nombre;
    protected double radio;

    public double calcularPerimetro() {
        double resultado = Math.PI*2*this.radio ;
        return resultado;
    }

    public double calcularSuperficie() {
        double resultado = Math.PI*Math.pow(this.radio,2);
        return resultado;
    }

    public void excepcionSiCero(int valor) throws EjemploException{
        if(valor==0) {
            throw new EjemploException("Ejemplo");
        }
    }
}
