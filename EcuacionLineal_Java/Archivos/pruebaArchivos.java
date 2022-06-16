package Archivos;
import java.io.*;
import java.util.ArrayList;

public class pruebaArchivos {
    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Ecuacion> listaEntrada = new ArrayList<>();
    private final String rutaWindows =  "C:\\Users\\Erick\\Documents\\Programacion\\Practica 1.1\\src\\Archivos\\datos.txt";

    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Ecuacion> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo() {
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i = 0; i < this.contenidoArchivo.size(); i++) {
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split(";");
            try {
                int coeficienteA = Integer.parseInt(elementosLinea[0]);
                int coeficienteB = Integer.parseInt(elementosLinea[1]);
                int terminoIndependienteC = Integer.parseInt(elementosLinea[2]);
                int coeficienteD = Integer.parseInt(elementosLinea[3]);
                int coeficienteE = Integer.parseInt(elementosLinea[4]);
                int terminoIndependienteF = Integer.parseInt(elementosLinea[5]);
                listaEntrada.add(new Ecuacion(coeficienteA, coeficienteB, terminoIndependienteC, coeficienteD, coeficienteE, terminoIndependienteF));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                listaEntrada.add(new Ecuacion(0, 0, 0, 0, 0, 0));
            }
        }
    }
    public void escribirArchivo(ArrayList<Ecuacion> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("coeficienteA, coeficienteB, terminoIndependienteC, coeficienteD, coeficienteE, terminoIndependienteF, variableX, variableY\n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getCoeficienteA() + "," + lista.get(i).getCoeficienteB() +"," + lista.get(i).getTerminoIndependienteC() +
                        "," + lista.get(i).getCoeficienteD() + "," + lista.get(i).getCoeficienteE() + "," + lista.get(i).getTerminoIndependienteF() +
                        "," + lista.get(i).getVariableX() + "," + lista.get(i).getVariableY() +  "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main (String args[]){
        pruebaArchivos prueba = new pruebaArchivos();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getCoeficienteA() +
                    "\t" + prueba.getListaEntrada().get(i).getCoeficienteB() +
                    "\t" + prueba.getListaEntrada().get(i).getTerminoIndependienteC() +
                    "\t" + prueba.getListaEntrada().get(i).getCoeficienteD() +
                    "\t" + prueba.getListaEntrada().get(i).getCoeficienteE() +
                    "\t" + prueba.getListaEntrada().get(i).getTerminoIndependienteF() +
                    "\t" + prueba.getListaEntrada().get(i).getVariableX() +
                    "\t" + prueba.getListaEntrada().get(i).getVariableY());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());
    }
}
