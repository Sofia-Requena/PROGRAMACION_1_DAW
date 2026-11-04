package Actividades.Actividad5;

import java.io.File;
import java.util.Scanner;

public class Actividad5_Scanner {
    public static void main(String[] args) {
        try{
            Scanner leer = new Scanner(new File("./src/Actividades/Actividad5/FicheroActividad5Scanner.txt"));
            String linea;
            int suma=0;
            double contador=0;
            /*Procesamos el archivo linea a linea */
            while(leer.hasNextInt()){
                /*Se guarda y procesa con Scanner */
                linea=leer.nextLine();
                Scanner sc = new Scanner(linea);
                suma=0;
                contador=0;
                while (sc.hasNextInt()) {/*Se van leyendo los numeros dentro de la linea */
                    int numero1=sc.nextInt();
                    contador=contador+1;
                    suma=suma+numero1;
                }
                System.out.println("La media de la linea es: "+(suma/contador));
                sc.close();/*Se cierra la lectura de la linea */
            }
            leer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            }
    }
}
