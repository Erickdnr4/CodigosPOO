import metodoStatic.EcuacionLineal;

public class Main{
    public static void main (String[] args) {
        EcuacionLineal EcuacionLineal = new EcuacionLineal();
        System.out.println(metodoStatic.EcuacionLineal.calcularValorDeX(2, 1, 3, 4, 8, 6));
        System.out.println(metodoStatic.EcuacionLineal.calcuclarValorDeY(2, 1, 3, 4, 8, 6));
    }

}
