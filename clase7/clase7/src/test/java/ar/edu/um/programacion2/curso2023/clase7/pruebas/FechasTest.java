package ar.edu.um.programacion2.curso2023.clase7.pruebas;

import ar.edu.um.programacion2.curso2023.clase7.fechas.FechaPropia;
import org.junit.Test;
import static org.junit.Assert.*;

public class FechasTest {

    @Test
    public void sumas() {
        FechaPropia fecha = new FechaPropia(2019,1,1);
        fecha = new FechaPropia("2019-01-01");
        assertEquals("2019-01-02", fecha.sumarDias(1).toString());
        assertEquals("2019-01-16", fecha.sumarDias(15).toString());
        assertEquals("2019-02-10", fecha.sumarDias(40).toString());
        assertEquals("2019-03-22", fecha.sumarDias(80).toString());
        assertEquals("2019-06-30", fecha.sumarDias(180).toString());
        assertEquals("2019-12-27", fecha.sumarDias(360).toString());
        assertEquals("2020-02-05", fecha.sumarDias(400).toString());
        assertEquals("2020-08-23", fecha.sumarDias(600).toString());
        fecha = new FechaPropia("2019-02-27");
        assertEquals("2019-02-28", fecha.sumarDias(1).toString());
        fecha = new FechaPropia("2019-02-28");
        assertEquals("2019-03-01", fecha.sumarDias(1).toString());
        fecha = new FechaPropia("2019-03-01");
        assertEquals("2019-03-02", fecha.sumarDias(1).toString());
        assertEquals("2019-03-16", fecha.sumarDias(15).toString());
        assertEquals("2019-04-10", fecha.sumarDias(40).toString());
        assertEquals("2019-05-20", fecha.sumarDias(80).toString());
        assertEquals("2019-08-28", fecha.sumarDias(180).toString());
        assertEquals("2020-02-24", fecha.sumarDias(360).toString());
        assertEquals("2020-04-04", fecha.sumarDias(400).toString());
        assertEquals("2020-12-15", fecha.sumarDias(655).toString());
        assertEquals("2021-05-08", fecha.sumarDias(799).toString());
        fecha = new FechaPropia("2020-01-01");
        assertEquals("2020-01-02", fecha.sumarDias(1).toString());
        assertEquals("2020-01-16", fecha.sumarDias(15).toString());
        assertEquals("2020-02-10", fecha.sumarDias(40).toString());
        assertEquals("2020-03-21", fecha.sumarDias(80).toString());
        assertEquals("2020-06-29", fecha.sumarDias(180).toString());
        fecha = new FechaPropia("2020-02-27");
        assertEquals("2020-02-28", fecha.sumarDias(1).toString());
        assertEquals("2024-06-04", fecha.sumarDias(1500).toString());
        fecha = new FechaPropia("2020-02-28");
        assertEquals("2020-02-29", fecha.sumarDias(1).toString());
        fecha = new FechaPropia("2020-02-29");
        assertEquals("2020-03-01", fecha.sumarDias(1).toString());
        fecha = new FechaPropia("2020-03-01");
        assertEquals("2020-03-02", fecha.sumarDias(1).toString());
        assertEquals("2020-03-16", fecha.sumarDias(15).toString());
        assertEquals("2020-04-10", fecha.sumarDias(40).toString());
        assertEquals("2020-05-20", fecha.sumarDias(80).toString());
        assertEquals("2020-08-28", fecha.sumarDias(180).toString());
        assertEquals("2021-02-24", fecha.sumarDias(360).toString());
        assertEquals("2021-05-04", fecha.sumarDias(400).toString());
        fecha = new FechaPropia("2020-12-15");
        assertEquals("2020-12-16", fecha.sumarDias(1).toString());
        assertEquals("2020-12-30", fecha.sumarDias(15).toString());
        assertEquals("2021-01-24", fecha.sumarDias(40).toString());
        assertEquals("2021-03-05", fecha.sumarDias(80).toString());
        assertEquals("2021-06-13", fecha.sumarDias(180).toString());
        assertEquals("2021-10-12", fecha.sumarDias(360).toString());
        assertEquals("2022-01-19", fecha.sumarDias(400).toString());

    }
}
