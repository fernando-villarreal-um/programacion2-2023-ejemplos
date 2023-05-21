package ar.edu.um.programacion2.curso2023.clase7.pruebas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CirculoTest {
    Circulo circulo1;
    Circulo circulo2;

    @Before
    public void preparacion() {
        this.circulo1 = new Circulo("circulo", 10);
        this.circulo2 = new Circulo("otro circulo",14);
    }

    @Test
    public void testCalcularPerimetro() {
        assertEquals(62.83185307179586, this.circulo1.calcularPerimetro(),0.0001);
        assertEquals(87.96459430051421, this.circulo2.calcularPerimetro(),0.0001);
    }

    @Test
    public void testCalcularSuperficie() {
        assertEquals(314.1592653589793, this.circulo1.calcularSuperficie(),0.0001);
        assertEquals(615.7521601035994, this.circulo2.calcularSuperficie(),0.0001);
    }

    @Test
    public void testToString() {
        assertEquals("Circulo(nombre=circulo, radio=10.0)", this.circulo1.toString());
        assertEquals("Circulo(nombre=otro circulo, radio=14.0)", this.circulo2.toString());
    }

    @Test(expected = EjemploException.class)
    public void testExcepcion1() throws EjemploException{
        this.circulo1.excepcionSiCero(0);
    }

    @Test
    public void testExcepcion2() {
        try {
            this.circulo1.excepcionSiCero(0);
        } catch (EjemploException e) {
            return;
        }
        fail("Excepcion tirada");
    }


}
