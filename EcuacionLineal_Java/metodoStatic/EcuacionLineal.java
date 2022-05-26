package metodoStatic;

public class EcuacionLineal {

          public static double calcularValorDeX (float coeficienteA, float coeficienteB, float terminoIndependienteC, float coeficienteD, float coeficienteE, float terminoIndependienteF) {
              double determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD;
              double variableX = coeficienteE * terminoIndependienteC - coeficienteB * terminoIndependienteF / determinante;
              return variableX;
          }
          public static double calcuclarValorDeY (float coeficienteA, float coeficienteB, float terminoIndependienteC, float coeficienteD, float coeficienteE, float terminoIndependienteF) {
              double determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD;
              double variableY = coeficienteA * terminoIndependienteF - coeficienteD * terminoIndependienteC / determinante;
              return variableY;
          }
}