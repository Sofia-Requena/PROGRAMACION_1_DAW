package Practicas.Practica2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Fichero2_Scanner {
            public static void main(String[] args) {

try{
            Scanner leer = new Scanner(new File("./src/Practicas/Practica2/FicheroEjemplo2.txt"));
            String linea;
            while(leer.hasNextLine()){
                linea=leer.nextLine();
                System.out.println(linea);
                Scanner sc = new Scanner(linea);//Procesar la línea leída
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
