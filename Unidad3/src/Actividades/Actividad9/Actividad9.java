package Actividades.Actividad9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad9 {
/*1) Implementa un procedimiento que lee el contenido de un fichero, solicita una palabra por teclado y 
dice cuántas veces aparece en el texto. Una vez leas la línea con readLine, usa Scanner con 
useDelimeter("\\s+") para separar por uno o varios espacios y equalsIgnoreCase para ignorar caso Hola y hola. */

/*Esta actividad es de la pagina 31, en esta actividad se pide que se introduzca una palabra, y comprobamos si esta 
escrita en un archivo concreto, en caso de que no este esa palabra escrita en el archivo se notifica, y si esta escrita,
mostraremos cuantas veces esta escrita esa palabra. */
    public static void main(String[] args) {
        Actividad9();
    }

    public static void Actividad9(){
    int letraRepetida=0;
        try {
            File ficheroFile = new File ("./src/Actividades/Actividad9/Actividad9.txt");
            Scanner sc = new Scanner(ficheroFile); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
        
            if (!ficheroFile.exists() && !ficheroFile.isFile()) { /*Comprobamos si el arhivo existe */
                System.out.println("El fichero no existe o no es un fichero");
            }
            else{
                /*Aqui pedimos que palabra queremos buscar, lo ponemos fuera del while ya que queremos que se ponga una vez */
                Scanner teclado = new Scanner(System.in); /*pedimos por teclado que escriban una palabra */
                System.out.print("Escribe alguna palabra para ver cuantas veces esta escrita en el archivo: ");
                String palabra_Teclado=teclado.nextLine(); /*Convertimos esa palabra en texto */
           
                while (sc.hasNextLine()) {
                String linea = sc.nextLine(); //Lectura de toda la línea
                Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen

                while (scLinea.hasNext()) {                
                    scLinea.useDelimiter("[=,;:¿?!¡\\s \\n]+"); /*No puedo poner - entre dos caracteres a no ser que sea para delimitar palabras o numeros entre ellos*/
                    String palabra = scLinea.next();
                    /*En el if ponemos que la palabra escrita si es igual a la que esta en el documento .txt */
                    if (palabra.equalsIgnoreCase(palabra_Teclado)) {
                        letraRepetida=letraRepetida+1;
                    }
                }
                scLinea.close();
            }}
            System.out.println("La letra esta escrita en el archivo "+letraRepetida+" veces");
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());/*Muestra el mensaje del porque no funciona el programa. Si pusieramos solo e nos mostraria tambien que excepcion ocurre*/
        }
        
    }

/*No borrar llave */
}