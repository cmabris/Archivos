package escritura;

import javax.imageio.IIOException;
import java.io.*;

public class escribirInformacion {

    public static void escribirLinea(File archivo, String contenido) {

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public static void anexarLinea(File archivo, String contenido) {

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha añadido al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
