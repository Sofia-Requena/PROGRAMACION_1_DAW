package Actividades.Actividad10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Actividad10 {
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
