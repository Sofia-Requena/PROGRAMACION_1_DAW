package Actividades.Actividad8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad8 {
            public static void main(String[] args) {

    int partidasJugador1=0,partidasJugador2=0, partidasJugador3=0;
    try {
        Scanner sc = new Scanner(new File("./src/Actividades/Actividad8/Actividad8.txt")); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
        while (sc.hasNextLine()) {
            String linea = sc.nextLine(); //Lectura de toda la línea
            Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen
            while (scLinea.hasNext()) {
                scLinea.useDelimiter("[=,\\s \\n]+");
                String jugador = scLinea.next();
                int partidas = scLinea.nextInt();
                if (jugador.equals("Jugador1")) {
                    partidasJugador1=partidas;
                }

                if (jugador.equals("jugador2")) {
                    partidasJugador2=partidas;
                }

                if (jugador.equals("jugador3")) {
                    partidasJugador3=partidas;
                }
            }
            scLinea.close();
        }
        System.out.println(partidasJugador1+"-"+partidasJugador2+"-"+partidasJugador3);
        sc.close();
    } catch (FileNotFoundException e) {
        System.out.println("No se encuentra el fichero.");
    }
}
}
