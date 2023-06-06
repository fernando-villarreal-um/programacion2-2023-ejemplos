package ar.edu.um.programacion2.curso2023.clase7.fechas;

import lombok.Data;

@Data
public class FechaPropia {
    protected int dia;
    protected int mes;
    protected int anio;

    public FechaPropia() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2020;
    }

    public FechaPropia(int anio, int mes, int dia) {
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public FechaPropia(String fecha) {
        // Falta evaluar el string como regex para ver si cumple el formato AAAA-MM-dd
        String dividido[] = fecha.split("-");
        this.anio = Integer.parseInt(dividido[0]);
        this.mes = Integer.parseInt(dividido[1]);
        this.dia = Integer.parseInt(dividido[2]);
    }

    public FechaPropia clone() {
        return new FechaPropia(this.anio, this.mes, this.dia);
    }

    public FechaPropia sumarDias(int dias) {
        FechaPropia nuevaFecha = this.clone();
        nuevaFecha = this.sumarDias(nuevaFecha, dias);
        return nuevaFecha;
    }

    protected FechaPropia sumarDias(FechaPropia actual, int dias) {
        int nuevoDia = actual.getDia()+dias;
        //int mesActual = actual.getMes();
        if(nuevoDia>this.diasDelMes(actual)) {
            //el dia es mayor, incrementamos el mes
            int diasConsumidos = this.diasDelMes(actual)-actual.getDia();
            dias = dias-(this.diasDelMes(actual)-actual.getDia());
            if(actual.getMes()==12) {
                actual.setAnio(actual.getAnio()+1);
                actual.setMes(1);
            }
            else {
                actual.setMes(actual.getMes()+1);
            }
            actual.setDia(0);
            this.sumarDias(actual, dias);
        }
        else {
            actual.setDia(nuevoDia);
        }
        return actual;
    }

    protected int diasDelMes(FechaPropia fecha) {
        int mes = fecha.getMes();
        if(mes == 2 && this.esBisiesto(fecha)) {
            return 29;
        }
        if(mes == 2 && !this.esBisiesto(fecha)) {
            return 28;
        }
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
            return 31;
        }
        return 30;
    }

    protected boolean esBisiesto(FechaPropia fecha) {
        return fecha.getAnio() % 4 == 0 && (fecha.getAnio() % 100 != 0 || fecha.getAnio() % 400 == 0);
    }


    public String restarDias(int dias) {
        return "";
    }

    @Override
    public String toString() {
        String mes = String.format("%02d",this.getMes());
        String dia = String.format("%02d",this.getDia());
        return this.getAnio()+"-"+mes+"-"+dia;
    }


}
