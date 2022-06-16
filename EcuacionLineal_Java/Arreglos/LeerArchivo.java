package Archivos;
import java.io.*;
import java.util.ArrayList;

public class LeerArchivo {
    private String linea;
    private ArrayList<String> lineasArchivo = new ArrayList<String>();

    public ArrayList<String> leerArchivo (String ruta){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File (ruta);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            while((linea=br.readLine()) != null) {
                if (linea != "") {
                    lineasArchivo.add(linea);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return lineasArchivo;
    }

    private void escribirArchivo(String archivo) {
        File f = new File(archivo);
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Texto");
            wr.append("\n");
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main(String args[]){
        LeerArchivo leer = new LeerArchivo();

        System.out.println(leer.leerArchivo("/Users/Erick/Documents/Programacion/Practica 1.1/src/Archivos/datos.txt"));


    }
}