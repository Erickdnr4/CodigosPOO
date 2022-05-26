package Herencia;

public class Implementacion {
    public static void main (String[] args){

        // Clase hija 1
        primerIncognita X = new primerIncognita(2, 1, 3, 4, 8, 6);

        System.out.println("El determinante es:" + X.getDeterminante());
        System.out.println("La variable X es:" + X.getVariable());
        System.out.println(" ");

        // Clase hija 2
        segundaIncognita Y = new segundaIncognita(2, 1, 3, 4, 8, 6);
        System.out.println("El determinante es:" + Y.getDeterminante());
        System.out.println("La variable Y es:" + Y.getVariable());















    }
}
