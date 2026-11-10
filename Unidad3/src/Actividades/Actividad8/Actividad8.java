package Actividades.Actividad8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad8 {
    /*Práctica: ¿Y si se procesara este formato? Jugador1=3, jugador2=4, jugador3=1
    Habría que usar useDelimiter("[=,\\s]+"); */

    /*Este ejercicio es uno de practica, es el de la pagina 28. En este ejercicio podemos ver 
    como se procesa el formato de jugador=1, con la coma en medio en el cual tenemos que usar un delimitador para poder
    coger el dato que nos interesa que es el numero de partidas ganadas y que jugador ha sido sin importar el signo que este
    de por medio, en este caso es la coma ,*/
    public static void main(String[] args) {

    int partidasJugador1=0,partidasJugador2=0, partidasJugador3=0;
    try {
        Scanner sc = new Scanner(new File("./src/Actividades/Actividad8/Actividad8.txt")); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
        while (sc.hasNextLine()) {
            String linea = sc.nextLine(); //Lectura de toda la línea
            Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen
            while (scLinea.hasNext()) {
                scLinea.useDelimiter("[=,\\s]+");
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
