public class EcuacionLineal {

    public float coeficienteA;
    public float coeficienteB;
    public float terminoIndependienteC;
    public float coeficienteD;
    public float coeficienteE;
    public float terminoIndependienteF;
    public float determinante;
    public float variableX;
    public float variableY;

    public EcuacionLineal(float coeficienteA, float coeficienteB, float terminoIndependienteC, float coeficienteD, float coeficienteE, float terminoIndependienteF) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.terminoIndependienteC = terminoIndependienteC;
        this.coeficienteD = coeficienteD;
        this.coeficienteE = coeficienteE;
        this.terminoIndependienteF = terminoIndependienteF;
        this.determinante = this.coeficienteA * this.coeficienteE - this.coeficienteB * this.coeficienteD;
        this.variableX = this.coeficienteE * this.terminoIndependienteC - this.coeficienteB * this.terminoIndependienteF / this.determinante;
        this.variableY = this.coeficienteA * this.terminoIndependienteF - this.coeficienteD * this.terminoIndependienteC / this.determinante;
    }

    public float getDeterminante() {
        return determinante;
    }

    public float getVariableX() {
        return variableX;
    }

    public float getVariableY() {
        return variableY;
    }

    public static void main(String[] args){
        EcuacionLineal ecuacionLineal = new EcuacionLineal(2, 1, 3, 4, 8, 6);
        System.out.println(ecuacionLineal.getDeterminante());
        System.out.println(ecuacionLineal.getVariableX());
        System.out.println(ecuacionLineal.getVariableY());
    }
}


