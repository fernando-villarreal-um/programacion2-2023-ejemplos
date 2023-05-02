package hilosThread;

import servicios.Bicho;
import servicios.Pantalla;

import java.util.ArrayList;
import java.util.List;

public class ManejadorPantalla implements Runnable{
    protected Pantalla pantalla;
    protected int demora;
    protected boolean continuar = true;

    protected List<ManejadorBicho> bichos = new ArrayList<>();

    public ManejadorPantalla(Pantalla pantalla, int demora) {
        this.pantalla = pantalla;
        this.demora = demora;
        this.continuar = continuar;
    }

    @Override
    public void run() {
        while(continuar) {
            pantalla.borrarTablero();
            this.dibujarBichos();
            //System.out.println("\n\n Borrado");
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected void dibujarBichos() {
        for(int contaBichos = 0; contaBichos<this.bichos.size(); contaBichos++) {
            ManejadorBicho bicho = this.bichos.get(contaBichos);
            if(bicho.getBicho().getPosX()>=2 &&
                    bicho.getBicho().getPosY()>=2 &&
                    bicho.getBicho().getPosX() < this.pantalla.getTamX() &&
                    bicho.getBicho().getPosY() < this.pantalla.getTamY()
            ) {
                // El bicho está en los limites aceptados, lo podemos dibujar
                this.pantalla.dibujarCaracter(bicho.getBicho().getPosX(), bicho.getBicho().getPosY(),
                        bicho.getBicho().getRepresentacion());
                //this.pantalla.moverATextos(contaBichos);
                //this.pantalla.imprimirTexto(bicho.toString());
            }
            else {
                // El bicho está fuera de limites, lo inhabilitamos
                bicho.setActivo(false);
                this.bichos.remove(contaBichos);
            }
        }
    }

    public void agregarBicho(Bicho bicho, int velocidad){
        ManejadorBicho manejadorBicho = new ManejadorBicho(bicho, velocidad);
        this.bichos.add(manejadorBicho);
        Thread manejador = new Thread(manejadorBicho);
        manejador.start();
    }


    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public boolean isContinuar() {
        return continuar;
    }

    public void setContinuar(boolean continuar) {
        this.continuar = continuar;
    }
}
