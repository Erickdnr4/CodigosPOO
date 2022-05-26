package Metodos;
import Metodos.ecuacionLineal;

public class Main {
    public static void main (String[] args) {
        System.out.println ("Metodo constructor");
        ecuacionLineal ecuacion = new ecuacionLineal(2, 1, 4, 8, 6, 8);

        System.out.println ("Metodo de instancia");
        System.out.println(ecuacion.calcularDeterminante());

        System.out.println ("Metodo de clase");
        System.out.println(ecuacionLineal.calcuclarVariableY(2, 1, 3, 4, 8, 6));
        System.out.println(ecuacionLineal.calcularVariableX(2, 1, 3, 4, 8, 6));


    }
}
