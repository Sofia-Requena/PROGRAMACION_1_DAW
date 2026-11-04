package Actividades.Actividad9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad9 {

    public static void main(String[] args) {
        Actividad9();
    }

    public static void Actividad9(){
    int letraRepetida=0;
        try {
            Scanner sc = new Scanner(new File("./src/Actividades/Actividad9/Actividad9.txt")); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
            while (sc.hasNextLine()) {
                
                String linea = sc.nextLine(); //Lectura de toda la línea
                Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen

                Scanner teclado = new Scanner(System.in); /*pedimos por teclado que escriban una palabra */
                System.out.print("Escribe alguna palabra para ver cuantas veces esta escrita en el archivo: ");
                String palabra_Teclado=teclado.nextLine(); /*Convertimos esa palabra en texto */

                while (scLinea.hasNext()) {                
                    scLinea.useDelimiter("[=,;:¿?!¡\\s \\n]+"); /*No puedo poner - entre dos caracteres a no ser que sea para delimitar palabras o numeros entre ellos*/
                    String palabra = scLinea.next();
                    /*En el if ponemos que la palabra escrita si es igual a la que esta en el documento .txt */
                    if (palabra.equalsIgnoreCase(palabra_Teclado)) {
                        letraRepetida=letraRepetida+1;
                    }
                }
                scLinea.close();
            }
            System.out.println("La letra esta escrita en el archivo "+letraRepetida+" veces");
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());/*Muestra el mensaje del porque no funciona el programa. Si pusieramos solo e nos mostraria tambien que excepcion ocurre*/
        }
        
    }

/*No borrar llave */
}