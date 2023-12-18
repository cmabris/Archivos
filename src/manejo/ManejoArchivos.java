package manejo;

import creacion.ManejarArchivo;
import escritura.escribirInformacion;
import lectura.LecturaArchivos;

import java.io.*;

public class ManejoArchivos {
    public static void main(String[] args) {

        File archivo = ManejarArchivo.crear("resources/pruebaJava.txt");

        escribirInformacion.escribirLinea(archivo, "El perro de San Roque no tiene rabo");
        escribirInformacion.anexarLinea(archivo, "porque Ramón Ramírez se lo ha cortado");

        LecturaArchivos.lectura(archivo);
    }
}
