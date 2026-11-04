import java.io.*;
public class Fichero2 {
        public static void main(String[] args) {
            BufferedReader leer = null;

            try {
                leer = new BufferedReader (new FileReader("./src/FicheroEjemplo2.txt"));
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
