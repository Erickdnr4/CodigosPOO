package Herencia;

public class segundaIncognita extends Ecuacion{
    private double coeficienteA;
    private double coeficienteB;
    private double terminoIndependienteC;
    private double coeficienteD;
    private double coeficienteE;
    private double terminoIndependienteF;

    public segundaIncognita (double coeficienteA, double coeficienteB, double terminoIndependienteC, double coeficienteD, double coeficienteE, double terminoIndependienteF){
        this.coeficienteA = coeficienteA;
        this.terminoIndependienteC = terminoIndependienteC;
        this.coeficienteB = coeficienteB;
        this.coeficienteD = coeficienteD;
        this.coeficienteE = coeficienteE;
        this.terminoIndependienteF = terminoIndependienteF;
        this.calcularDeterminante();
        this.calcularVariable();
    }

    @Override
    public void calcularDeterminante() {
        this.determinante = this.coeficienteA * this.coeficienteE - this.coeficienteB * this.coeficienteD;
    }

    @Override
    public void calcularVariable() {
        this.variable = this.coeficienteA * this.terminoIndependienteF - this.coeficienteD * this.terminoIndependienteC / this.determinante;
    }

}
