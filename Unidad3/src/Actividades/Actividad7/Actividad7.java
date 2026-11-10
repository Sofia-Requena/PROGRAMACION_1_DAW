package Actividades.Actividad7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad7 {
    /*Actividad: ¿Qué cambia si tuviera el siguiente contenido? Prueba este código para ver qué pasa. 
    jugador1 3 jugador2 4 jugador3 1*/
    
    /*En esta Actividad (se encuentra en la pagina 28) comprobamos que es lo que sucede si no usamos un delimitador de salto de linea
    el cual si no saltamos la linea no lee el dato que esta en la linea de abajo. Por lo que tenemos que usar
    un useDelimiter("[\\n]+") para poder saltar de linea*/
    public static void main(String[] args) {

    int partidasJugador1=0,partidasJugador2=0, partidasJugador3=0;
    try {
        Scanner sc = new Scanner(new File("./src/Actividades/Actividad7/Actividad7_lineaSalto.txt")); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
        while (sc.hasNextLine()) {
            String linea = sc.nextLine(); //Lectura de toda la línea
            Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen
            while (scLinea.hasNext()) {
                scLinea.useDelimiter("[=\\s \\n]+");
                String jugador = scLinea.next();
                int partidas = scLinea.nextInt();
                if (jugador.equals("jugador1")) {
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
