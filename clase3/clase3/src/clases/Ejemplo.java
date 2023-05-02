package clases;

public class Ejemplo {
    protected String param1;

    public void metodo1(Integer valor1) throws MiExcepcion{
        if(valor1>10) {
            throw new MiExcepcion("Esta excepción es porque el valor es mayor a 10");
        }
    }

    public void metodo2(String valor2) throws MiExcepcion{
        if(valor2.equals("texto no permitodo")) {
            throw new MiExcepcion("Esta excepción es porque el texto es inválido");
        }
    }

    public void metodo3(String valor2) throws MiExcepcion, MiExcepcionHija{
        if(valor2.equals("texto no permitodo")) {
            throw new MiExcepcion("Esta excepción es porque el texto es inválido");
        }
        if(valor2 == null) {
            throw new MiExcepcionHija("Esta excepción es porque el texto es nulo");
        }
    }

    public Ejemplo() {
    }

    public Ejemplo(String param1) {
        this.param1 = param1;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }
}
