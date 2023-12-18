package creacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejarArchivo {

    public static File crear(String nombre) {

        File archivo = new File(nombre);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("El archivo se ha creado correctamente");

        return archivo;

    }

}
