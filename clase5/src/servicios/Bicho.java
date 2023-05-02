package servicios;

public class Bicho {
    protected int posX;
    protected int posY;
    protected char direccion;
    protected char representacion;

    public Bicho() {
        this.posX = 10;
        this.posY = 10;
        this.direccion = 'n';
        this.representacion = '@';
    }

    public Bicho(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.direccion = 'n';
        this.representacion = '@';
    }

    public Bicho(int posX, int posY, char direccion, char representacion) {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
        this.representacion = representacion;
    }

    public void mover() {
        //System.out.println("MOVER");
        switch(this.direccion) {
            case 'n':
                this.posY--;
                break;
            case 's':
                this.posY++;
                break;
            case 'e':
                this.posX++;
                break;
            case 'o':
                this.posX--;
                break;
        }
    }

    @Override
    public String toString() {
        StringBuffer mensaje = new StringBuffer();
        mensaje.append("Datos del bicho: ");
        mensaje.append(" - Posición X: "+this.posX);
        mensaje.append(" - Posición Y: "+this.posY);
        mensaje.append(" - Dirección: "+this.direccion);
        mensaje.append(" - "+this.representacion);
        return mensaje.toString();
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public char getRepresentacion() {
        return representacion;
    }

    public void setRepresentacion(char representacion) {
        this.representacion = representacion;
    }
}

