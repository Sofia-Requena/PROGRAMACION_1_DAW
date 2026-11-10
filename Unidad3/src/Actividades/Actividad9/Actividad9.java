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