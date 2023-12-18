package manejo;

import java.io.*;

public class ManejoArchivos {
    public static void main(String[] args) {

        File archivo = new File("resources/pruebaJava.txt");

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("El archivo se ha creado correctamente");
    }
}
