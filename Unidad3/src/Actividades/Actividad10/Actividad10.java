package Actividades.Actividad10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Actividad10 {

    /*2) Implementa un procedimiento que lee el contenido de un fichero, cuya ruta le indicas por teclado, 
    y lo escribe en otro fichero con el mismo nombre y añadiendo copia y fecha. Ejemplo: fichero→ fichero_copia_yyyy_mm_dd.txt. 
    Recuerda usar LocalDate.now() y que para sacar el nombre sin la extensión puedes usar nombre.substring(0, nombre.lastIndexOf('.')); 
    ¡¡Ojo que si no das extensión fallará!! Con fichero.getParent() tendrás el path del archivo */

    /*Este es la actividad es de la pagina 31 en donde copiamos el contenido de un fichero, con su mismo nombre, 
    pero poniendo copia y la fecha copia_yyyy_mm_dd */
    public static void main() {
        Actividad10();

    }

    public static void Actividad10() {
        try {
            String ruta;
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la ruta del fichero: ");
            ruta = sc.nextLine();

            File fichero = new File(ruta);

            if (!fichero.exists() || !fichero.isFile()) {
                System.out.println("El fichero no existe");
                return;
            }

            String nombre = fichero.getName();
            int posicionPunto = nombre.lastIndexOf('.');

            String nombreSinExtension;
            String extension;

            if (posicionPunto > 0) {
                nombreSinExtension = nombre.substring(0, posicionPunto);
                extension = nombre.substring(posicionPunto);
            } else {
                nombreSinExtension = nombre;
                extension = "";
            }

            LocalDate fecha = LocalDate.now();
            String nuevoNombre = nombreSinExtension + "_copia_" + fecha.getYear() + "_" + fecha.getMonthValue() + "_"
                    + fecha.getDayOfMonth() + ".txt";
            File copia = new File(fichero.getParent(), nuevoNombre);

            Scanner lector = new Scanner(fichero);
            PrintWriter escritor = new PrintWriter(copia);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                escritor.println(linea);
            }

            lector.close();
            escritor.close();
            System.out.println("Copia creada: " + copia.getName());

        } catch (FileNotFoundException e) {
            System.out.println("Error al copiar el fichero.");
        }

    }
    /* No borrar llave */
}
