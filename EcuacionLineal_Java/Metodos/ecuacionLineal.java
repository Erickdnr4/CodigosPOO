package Metodos;

public class ecuacionLineal {
    private double coeficienteA;
    private double coeficienteB;
    private double terminoIndependienteC;
    private double coeficienteD;
    private double coeficienteE;
    private double terminoIndependienteF;
    private double determinante;
    private double variableX;
    private double variableY;

    //Metodo Constructor
    public ecuacionLineal(double coeficienteA, double coeficienteB, double terminoIndependienteC,
                          double coeficienteD, double coeficienteE, double terminoIndependienteF) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.terminoIndependienteC = terminoIndependienteC;
        this.coeficienteD = coeficienteD;
        this.coeficienteE = coeficienteE;
        this.terminoIndependienteF = terminoIndependienteF;
        this.calcularVariableY();
        this.calcularVariableX();
        this.calcularDeterminante();

    }


    //Metodo De Clase
    public static double calcularVariableX (float coeficienteA, float coeficienteB, float terminoIndependienteC,
                                            float coeficienteD, float coeficienteE, float terminoIndependienteF) {
        double determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD;
        double variableX = coeficienteE * terminoIndependienteC - coeficienteB * terminoIndependienteF / determinante;
        return variableX;
    }
    public static double calcuclarVariableY (float coeficienteA, float coeficienteB, float terminoIndependienteC,
                                             float coeficienteD, float coeficienteE, float terminoIndependienteF) {
        double determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD;
        double variableY = coeficienteA * terminoIndependienteF - coeficienteD * terminoIndependienteC / determinante;
        return variableY;

    }

    //Metodo De Instancia
    public double calcularDeterminante(){
        this.determinante = this.coeficienteA * this.coeficienteE - this.coeficienteB * this.coeficienteD;
        return determinante;

    }

    public void calcularVariableX(){this.variableX = this.coeficienteE * this.terminoIndependienteC - this.coeficienteB
                                                        * this.terminoIndependienteF / this.determinante;}

    public void calcularVariableY(){this.variableY = this.coeficienteA * this.terminoIndependienteF - this.coeficienteD
                                                        * this.terminoIndependienteC / this.determinante;}



}
