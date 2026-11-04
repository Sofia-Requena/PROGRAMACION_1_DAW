import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroSalida {
    public static void main(String[] args) {

        /*PrintWriter */
        System.out.println("Escribe por pantalla");
        String contenido = "Escribir por pantalla con PrintWriter";
        try {
            PrintWriter pw = new PrintWriter("./src/prueba.txt");
            pw.println(contenido);
            pw.close();
            System.out.println("Archivo creado con exito");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /*Con Buffered Writer */
        // String contenido = "Este es un ejemplo de uso de BufferedWriter en Java. Segunda parte";
        // try {
        //     FileWriter archivo = new FileWriter("ejemplo.txt", true); 
        //     BufferedWriter escritor = new BufferedWriter(archivo); 
        //     escritor.write(contenido);  // Escribimos la cadena en el archivo
        //     escritor.newLine();         // Añadimos una nueva línea
        //     escritor.close();           // Cerramos el BufferedWriter
        //     System.out.println("¡Archivo escrito con éxito!");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

    }
}
