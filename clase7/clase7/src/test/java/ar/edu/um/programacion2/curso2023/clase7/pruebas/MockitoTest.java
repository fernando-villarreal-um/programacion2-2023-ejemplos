package ar.edu.um.programacion2.curso2023.clase7.pruebas;

import ar.edu.um.programacion2.curso2023.clase7.mockito.OtroServicio;
import ar.edu.um.programacion2.curso2023.clase7.mockito.ServicioEjemplo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoTest {

    @Test
    public void pruebaServicioTest1() {
        // Hacemos el mock de una clase y de un llamado en particular con ciertos parametros
        ServicioEjemplo servicioMock = mock(ServicioEjemplo.class);
        when(servicioMock.suma(4,4)).thenReturn(8);
        when(servicioMock.suma(4,5)).thenReturn(82234234);
        assertEquals(8, servicioMock.suma(4,4));
        verify(servicioMock).suma(4,4);
    }

    @Test
    public void pruebaServicioTest2() {
        // Hacemos el mock de una clase y de un llamado en particular con ciertos parametros
        // En este caso el tes falla a proposito
        ServicioEjemplo servicioMock = mock(ServicioEjemplo.class);
        when(servicioMock.suma(4,4)).thenReturn(9);
        assertEquals(8, servicioMock.suma(4,4));
    }

    @Test
    public void pruebaServicioTest3() {
        // Una prueba llamando al servicio real, funciona el test
        OtroServicio otroServicio = new OtroServicio();
        Circulo c1 = new Circulo("Circulo1", 10);
        assertEquals(otroServicio.radio10(c1),true);
    }

    @Test
    public void pruebaServicioTest4() {
        // Una prueba llamando al servicio real, el test falla
        OtroServicio otroServicio = new OtroServicio();
        Circulo c1 = new Circulo("Circulo1", 10);
        assertEquals(otroServicio.radio10(c1),false);
    }

    @Test
    public void pruebaServicioTest5() {
        // Hacemos la prueba de un servicio.
        // Llamamos a un servicio que es "complejo" a traves de un mock
        // El resultado devuelto lo usamos para llamar a otro servicio que es el que
        // estamos probando.

        // Llamado al mock para obtener un resultado simulado
        Circulo c1 = new Circulo("Circulo1", 10);
        ServicioEjemplo servicioMock = mock(ServicioEjemplo.class);
        when(servicioMock.devolverCirculo("a",3)).thenReturn(c1);
        Circulo calculado = servicioMock.devolverCirculo("a",3);

        // Hacemos la prueba
        OtroServicio otroServicio = new OtroServicio();
        assertEquals(otroServicio.radio10(calculado),true);
    }

}
