package Actividades.Actividad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad6 {
    /*Actividad: Ahora considera el formato jugador1=3*/
    
    /*Esta actividad se encuentra en la pagina 28, en esta actividad nos damos cuenta de que necesitamos usar delimitadores para 
    poder coger el dato de jugador1=1 ya que el = no nos deja cogerlo, por lo que al usar el delimitador useDelimiter("[=\\s]+") al poner el = delante de la \\s 
    le estamos indicando que si se encuentra algun signo = lo ignore y si hay despues datos o informacion que queremos saber, nos lo de.*/
    public static void main(String[] args) {

        int partidasJugador1=0,partidasJugador2=0;
        try {
            Scanner sc = new Scanner(new File("./src/Actividades/Actividad6/Actividad6_igual.txt")); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
            while (sc.hasNextLine()) {
                String linea = sc.nextLine(); //Lectura de toda la línea
                Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen
                scLinea.useDelimiter("[=\\s]+");
                String jugador = scLinea.next();
                int partidas = scLinea.nextInt();
                if (jugador.equals("jugador1")) { //Compruebo si he leído jugador1
                    partidasJugador1 = partidas;
                } else if (jugador.equals("jugador2")) {
                    partidasJugador2 = partidas;
                }
                scLinea.close();
            }
            System.out.println(partidasJugador1+"-"+partidasJugador2);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero.");
        }
    }
}
