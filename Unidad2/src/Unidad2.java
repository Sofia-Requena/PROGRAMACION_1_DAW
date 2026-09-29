import java.time.LocalDateTime;
import java.util.Scanner;

import utilidades.Matematicas;

/**
 * @author Sofia Requena Gonzalez
 * @version 1.0
 * Unidad2: fundamentos de la programación.
 */

public class Unidad2 {
/**
 * Funcion main, que es el punto de entrada del programa. Para ejecutar codigo en java. 
 * @param args es un argumento.
 */
    public static void main(String[] args) {

    //CLASE 1:
        
    //     /*varias pruebas de 
    //     numeros enteros y reales */
    //     int numerador= (1+2+3+1);
    //     double denominador=3;
    //     System.out.println((1+2+3+1)/3);
    //     System.out.println((1+2+3+1)/3.0);
    //     System.out.println(numerador/denominador);

    //     int a = 'a';
    //     System.out.println(a);
    //     a = 'b';

    //     int []b={4,0,-1};
    //     System.out.println(b);
    //     System.out.println(b[2]);

    //     a = 'c';

    //     final int VALOR=5; //Es una variable constante cuando se pone "final", y no se puede cambiar su valor.
    //     //Declarar varias variables en una sola línea.
    //     int c=1,d=2,e=3;

    //CLASE 2:

    //Ejemplo de introducción un valor por teclado.

    // Scanner sc = new Scanner(System.in);
    // int numero;
    // //Ejemplo de pedir un numero y mostrarlo por pantalla.
    // System.out.println("Introduce un número entero: ");
    // numero=sc.nextInt(); 
    // sc.nextLine(); //Para que pase a la siguiente línea y se ejecute.
    // String nombre = sc.next(); //Solo va a leer un caracter, no va a leer todo lo que se escriba en la línea.
    // System.out.println("El número introducido es: "+numero+" y tu nombre es "+nombre);

    // System.out.println("Introduce tu apellido: ");
    // String apellido = sc.nextLine(); //Para que llegue al final y lea todo lo que se ha escrito en la línea.
    // System.out.println("El apellido introducido es: "+apellido);

    // LocalDateTime hoy = LocalDateTime.now();
    // System.out.println("Hoy es: " + hoy.getDayOfWeek());   // nombre del día
    // System.out.println("El día es: " + hoy.getDayOfMonth());
    // System.out.println("El mes es: " + hoy.getMonth());    
    // // nombre del mes
    // System.out.println("El año es: " + hoy.getYear());
    // System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

    //     System.out.println(Math.pow(2, 5)); //Elevar un número a otro.

    //     int max=15;
    //     int min=1;
    //     double aleatorio=((int)(Math.random()*(max-min+1))+min);
    //     System.out.println("Número aleatorio entre 1 y 15: "+aleatorio);

    //CLASE 3: Utilizar las funciones sumar y multiplicar de la clase Matematicas.
    // int numero1=3;
    // int numero2=5;
    // System.out.println("La suma es: "+Matematicas.sumar(numero1, numero2));
    // System.out.println("La multiplicacion es: "+Matematicas.multiplicar(numero1, numero2));
    // System.out.println("El resto de la division 5/2 es: "+(5%2));
    // int variable=2;
    // System.out.println("La variable vale: "+variable);
    // variable++; //Es lo mismo que variable=variable+1;
    // System.out.println("La variable vale: "+variable);
    // int valor1=2;
    // int valor2=2;
    // valor1+=valor2;//valor1=valor1+valor2;
    // System.out.println(valor1);

    //Condiciones if else
        int numero=3;
        int numero2=5;

        if(numero>numero2){
            System.out.println("Numero > Numero2");
        } 
        System.out.println("POR AQUI VOY");

        }
    
    }