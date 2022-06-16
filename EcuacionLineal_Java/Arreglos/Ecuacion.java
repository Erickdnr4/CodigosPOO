package Archivos;

public class Ecuacion {
    private int coeficienteA;
    private int coeficienteB;
    private int terminoIndependienteC;
    private int coeficienteD;
    private int coeficienteE;
    private int terminoIndependienteF;
    private double determinante;
    private double variableX;
    private double variableY;

    public Ecuacion(int coeficienteA, int coeficienteB, int terminoIndependienteC, int coeficienteD, int coeficienteE, int terminoIndependienteF) {
        this.coeficienteA = coeficienteA;
        this.terminoIndependienteC = terminoIndependienteC;
        this.coeficienteB = coeficienteB;
        this.coeficienteD = coeficienteD;
        this.coeficienteE = coeficienteE;
        this.terminoIndependienteF = terminoIndependienteF;
        this.calcularDeterminante();
        this.calcularVariableX();
        this.calcularVariableY();
    }

    public double getCoeficienteA(){
        return coeficienteA;
    }
    public void setCoeficienteA(int coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public double getCoeficienteB(){
        return coeficienteB;
    }
    public void setCoeficienteB(int coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public double getTerminoIndependienteC(){
        return terminoIndependienteC;
    }
    public void setTerminoIndependienteC(int terminoIndependienteC){
        this.terminoIndependienteC = terminoIndependienteC;
    }

    public double getCoeficienteD(){
        return coeficienteD;
    }
    public void setCoeficienteD(int coeficienteD) {
        this.coeficienteD = coeficienteD;
    }

    public double getCoeficienteE(){
        return coeficienteE;
    }
    public void setCoeficienteE(int coeficienteE) {
        this.coeficienteE = coeficienteE;
    }

    public double getTerminoIndependienteF(){
        return terminoIndependienteF;
    }
    public void setTerminoIndependienteF(int terminoIndependienteF) {
        this.terminoIndependienteF = terminoIndependienteF;
    }

    public double getDeterminante(){
        return determinante;
    }
    public void calcularDeterminante(){
        this.determinante = this.coeficienteA * this.coeficienteE - this.coeficienteB * this.coeficienteD;
    }

    public double getVariableX(){
        return variableX;
    }
    public void calcularVariableX(){
        this.variableX = this.coeficienteE * this.terminoIndependienteC - this.coeficienteB * this.terminoIndependienteF / this.determinante;
    }

    public double getVariableY() {
        return variableY;
    }
    public void calcularVariableY(){
        this.variableY = this.coeficienteA * this.terminoIndependienteF - this.coeficienteD * this.terminoIndependienteC / this.determinante;
    }

    public static void main(String[] args){
        Ecuacion ecuacion = new Ecuacion(2, 1, 3, 4, 8, 6);
        System.out.println(ecuacion.getVariableX());
        System.out.println(ecuacion.getVariableY());
    }
}