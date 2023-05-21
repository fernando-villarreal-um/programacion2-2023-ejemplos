package ar.edu.um.programacion2.curso2023.clase7.pruebas;

public class ArranquePruebas {
    public static void main(String[] args) {
        ArranquePruebas arranquePruebas = new ArranquePruebas();
        arranquePruebas.arranque();
    }

    public void arranque() {
        Circulo circulo = new Circulo("circulo",10);
        System.out.println(circulo);
        System.out.println("Perimetro: "+circulo.calcularPerimetro());
        System.out.println("Superficie: "+circulo.calcularSuperficie());

        circulo = new Circulo("otro circulo", 14);
        System.out.println(circulo);
        System.out.println("Perimetro: "+circulo.calcularPerimetro());
        System.out.println("Superficie: "+circulo.calcularSuperficie());
    }
}
