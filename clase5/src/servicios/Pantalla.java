package servicios;

public class Pantalla {
    protected int tamX;
    protected int tamY;
    protected char escCode = 0x1B;
    protected char borde = '*';
    protected char vacio = ' ';


    public Pantalla() {
        // Pantalla por defecto
        this.tamX = 40;
        this.tamY = 10;
        this.borrarTablero();
    }

    public Pantalla(int tamX, int tamY) {
        this.tamX = tamX;
        this.tamY = tamY;
        this.borrarTablero();
    }
    /*
    public void dibujar() {
        for(int x=1; x<=this.tamX; x++) {
            for(int y=1; y<=this.tamY; y++) {
                if(x==1 || y==1 || x==this.tamX || y == this.tamY) {
                    this.moverA(x,y);
                    System.out.print("*");
                }
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }*/

    public void borrarTablero() {
        for(int x=1; x<=this.tamX; x++) {
            for(int y=1; y<=this.tamY; y++) {
                if(x==1 || y==1 || x==this.tamX || y == this.tamY) {
                    this.dibujarCaracter(x,y, this.borde);
                }
                else {
                    this.dibujarCaracter(x,y, this.vacio);
                }
            }
        }
    }

    public void dibujarCaracter(int x, int y, char caracter) {
        this.moverA(x,y);
        System.out.print(caracter);
    }

    protected void moverA(int x, int y) {
        System.out.print(String.format("%c[%d;%df",this.escCode,y,x));
    }

    public void moverATextos(int posicion) {
        this.moverA(10, this.tamY+2+posicion);
    }

    public void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    public int getTamX() {
        return tamX;
    }

    public int getTamY() {
        return tamY;
    }
}
