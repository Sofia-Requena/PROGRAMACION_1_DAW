package Actividades.Actividad10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        /*NO ENTIENDO PORQUE NO FUNCIONA, SI LO HE HECHO TODO */
        LocalDate fechaArchivo = LocalDate.now();
        String anio = fechaArchivo.format(DateTimeFormatter.ofPattern("yyyy"));
        String mes = fechaArchivo.format(DateTimeFormatter.ofPattern("MM"));
        String dia = fechaArchivo.format(DateTimeFormatter.ofPattern("dd"));

        try {
            Scanner ruta = new Scanner(System.in); 
            System.out.print("Escribe una ruta de un archivo .txt: ");
            String ruta_teclado=ruta.nextLine(); 
            
            Scanner sc = new Scanner(new File(ruta_teclado)); 
            while (sc.hasNextLine()) {
                String contenido = sc.nextLine();
                PrintWriter pw = new PrintWriter(ruta_teclado+"_copia_"+anio+"_"+mes+"_"+dia+".txt");
                pw.println(contenido);
                pw.close();
                System.out.println("Archivo creado con exito");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
