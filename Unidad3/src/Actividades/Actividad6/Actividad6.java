package Actividades.Actividad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad6 {
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
