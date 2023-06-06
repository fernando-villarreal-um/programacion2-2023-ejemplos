package ar.edu.um.programacion2.curso2023.clase7.fechas;

public class ProbarFechas {
    public static void main(String[] params) {
        FechaPropia fecha = new FechaPropia(2020,1,10);
        fecha = new FechaPropia("2019-01-01");
        int dias = 360;
        FechaPropia nueva = fecha.sumarDias(dias);
        System.out.println("Fecha: "+fecha+" - sumar "+dias+" - Resultado: "+nueva);
    }
}
