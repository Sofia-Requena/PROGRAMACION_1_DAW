package Ejemplos_Clase;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Fichero2 {
        public static void main(String[] args) {
            BufferedReader leer = null;

            try {
                leer = new BufferedReader (new FileReader("./src/Ejemplos_Clase/FicheroEjemplo2.txt"));
                String linea;

                while ((linea=leer.readLine()) != null) {
                    System.out.println(linea);
                }
                leer.close();
            } catch (Exception e) {
                System.out.println("No se ha encontrado el archivo");
                // e.printStackTrace();
            }
        }
//No borrar llave
}
