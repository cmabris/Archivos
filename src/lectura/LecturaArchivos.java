package lectura;

import java.io.*;

public class LecturaArchivos
{
    public static void lectura(File archivo) {

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;

            lectura = entrada.readLine();

            while (lectura != null) {
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
