package Herencia;

public abstract class Ecuacion {
    protected double determinante;
    protected double variable;

    public abstract void calcularDeterminante();
    public abstract void calcularVariable();


    public double getDeterminante() {return this.determinante;}
    public double getVariable() {return this.variable;}

}
