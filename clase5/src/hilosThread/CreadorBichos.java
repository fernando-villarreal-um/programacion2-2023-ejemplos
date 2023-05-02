package hilosThread;

import servicios.Bicho;

import java.util.Random;

public class CreadorBichos implements Runnable {
    protected ManejadorPantalla pantalla;
    protected int cantidad;
    protected int demora;
    protected int minX;
    protected int maxX;
    protected int minY;
    protected int maxY;


    @Override
    public void run() {
        for(int i = 0; i < this.cantidad; i++) {
            int x = this.generarAleatorio(this.minX, this.maxX);
            int y = this.generarAleatorio(this.minY, this.maxY);
            char[] direcciones={'n','s','e','o'};
            int pos = this.generarAleatorio(0,3);
            char caracter = direcciones[pos];
            Bicho b = new Bicho(x,y,caracter,caracter);
            int velocidad = this.generarAleatorio(100,1000);
            this.pantalla.agregarBicho(b,velocidad);
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int generarAleatorio(int min, int max) {
        Random aleatorio = new Random(System.currentTimeMillis());
        int numero = aleatorio.nextInt(max-min+1)+min;
        return numero;
    }


    public int generarX() {
        Random aleatorio = new Random(System.currentTimeMillis());
        int numero = aleatorio.nextInt(this.maxX-this.minX)+minX;
        return numero;
    }

    public CreadorBichos() {
    }

    public CreadorBichos(ManejadorPantalla pantalla, int cantidad, int demora) {
        this.pantalla = pantalla;
        this.cantidad = cantidad;
        this.demora = demora;
    }

    public ManejadorPantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(ManejadorPantalla pantalla) {
        this.pantalla = pantalla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public int getMinX() {
        return minX;
    }

    public void setMinX(int minX) {
        this.minX = minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMinY() {
        return minY;
    }

    public void setMinY(int minY) {
        this.minY = minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }
}
