package Practicas.Practica3;

import java.io.File;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        try{
            Scanner leer = new Scanner(new File("./src/Practicas/Practica3/Practica3.txt"));
            String linea;

            while(leer.hasNextLine()){
                linea=leer.nextLine();
                System.out.println(linea);
                Scanner sc = new Scanner(linea);//Procesar la línea leída
                /*Los corchetes del delimitador es como un || es una condicion todo lo que haya dentro del corchete lo ignora*/
                sc.useDelimiter("[;\\s]+"); /*Filtro del delimitador, para que pueda leer aunque haya ; , . etc */
                int numero1=sc.nextInt();
                int numero2=sc.nextInt();
                int numero3=sc.nextInt();
                System.out.println(numero1+"-"+numero2+"-"+numero3);
            }
      leer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
