import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {
    //  Ejercicios Uso de funciones definidas.
    //    //Actividad 1- pag:9. Realiza un programa que genera 2 números y nos diga el cociente, 
    //    // la media, la potencia y la raíz cuadrada. Usa tipos adecuados

    //     int min=1;
    //     int max=10;
    //     double num1=((int)(Math.random()*(max-min+1))+min);
    //     double num2=((int)(Math.random()*(max-min+1))+min);
    //     double potencia = Math.pow(num1,num2);
    //     double raiz = Math.sqrt(num1);
    //     double raiz2 = Math.sqrt(num2);
    //     System.out.println("El primer numero es: "+num1);
    //     System.out.println("El segundo numero es: "+num2);
    //     System.out.println("El cociente de los dos numeros es: "+(num1/num2));
    //     System.out.println("La media de los dos numeros es: "+(num1+num2)/2);
    //     System.out.println("La potencia del numero 2 elevado al numero 1: "+potencia);
    //     System.out.println("La raiz cuadrada del primer numero es: "+raiz );
    //     System.out.println("La raiz cuadrada del segundo numero es: "+raiz2 );

    // //Actividad 2: ¿Cómo sabemos si un número es divisible por 2 y por 3? Pag: 12
    //     int numero=9;

    //     if (numero % 2==0) {
    //         if (numero % 3==0) {
    //         System.out.println("El numero "+numero+" es divisible por 2 y por 3");
    //      }
    //     }

    //     else{
    //         System.out.println("El numero "+numero+" no es divisible ni entre 2 ni entre 3");
    //     }


    //Ejercicios Condicionales:
    // //Actividad 3: Pag:14 ; Haz el programa JAVA del siguiente diagrama de flujo
    // Scanner sc = new Scanner(System.in);
    // //Declaro la variables de a, b y c
    // double a;
    // a=sc.nextInt(); sc.nextLine();
    // double b;
    // b=sc.nextInt(); sc.nextLine();
    // double c;
    // c=sc.nextInt(); sc.nextLine();
    // double variable;
    // variable= Math.pow(b, 2)-4*(a*c);

    // //Variables de las soluciones
    // double x1;
    // double x2;
    // // Primer si no
    // if (variable<0) {
    //     System.out.println("No hay soluciones");
    // }
    // else if (variable==0) {
    //     x1= (-b)/(2*a);
    //     System.out.println("La unica solucion es: "+x1);
    // // Segundo si no
    // }
    // else{
    //     x1= (((-b)+Math.sqrt(variable))/(2*a));
    //     x2= (((-b)-Math.sqrt(variable))/(2*a));
    //     System.out.println("La primera solucion es: "+x1);
    //     System.out.println("La segunda solucion es: "+x2);
    // }


    //Actividad 4: Pag:14 ; Haz un programa que nos pide una nota y nos indica la calificación 
    // (sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta). Usa if-else y switch
        //Hecho con if else
    //  Scanner sc = new Scanner(System.in);
    // // //Declaro la variables de nota
    //     double nota;
    //     System.out.println("INTRODUCE LA NOTA: ");
    //     nota=Double.parseDouble(sc.nextLine());

    //     if (nota>=0 && nota<=4.9 ) {
    //         System.out.println("Suspenso");
    //     } else if (nota>=5 && nota<=5.9) {
    //         System.out.println("Aprobado");
    //     }
    //     else if (nota>=6 && nota<=6.9 ) {
    //         System.out.println("Bien");
    //     }

    //     else if (nota>=7 && nota<=8.9) {
    //         System.out.println("Notable");
    //     }

    //     else if (nota>=9 && nota<=10) {
    //         System.out.println("Sobresaliente");
    //     }
        
        
    //     else {
    //         System.out.println("La nota introducida no es correcta");
    //     }

    //Hecho con Switch
   
//         Scanner sc = new Scanner(System.in);
//         System.out.println("INTRODUCE LA NOTA: ");
//         int nota=sc.nextInt(); sc.nextLine();

//     switch (nota) {
//         case 0:
//         case 1:
//         case 2:
//         case 3:
//         case 4:
//             System.out.println("Suspenso");
//             break;
//         case 5:
//             System.out.println("Aprobado");
//             break;
//         case 6:
//         System.out.println("Bien");
//             break;
//         case 7:
//         case 8:
//         System.out.println("Notable");
//             break;
//         case 9:
//         case 10:
//         System.out.println("Sobresaliente");
//             break;
//     default:
//         System.out.println("La nota introducida no es valida");
//   }


    //Actividad 5: Pag:14 ; Haz un programa que solicita el día, mes y año y comprueba si es válido. 
    //Para el año hay que ver si el 29 es válido por ser bisiesto. Un año es bisiesto si: (anio % 
    //4 == 0 && anio % 100 != 0) || (anio % 400 == 0)
  
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Introduce un dia: ");
        // int dia=sc.nextInt(); sc.nextLine();
        // boolean dia_correcto=false;
        // System.out.println("Introduce un mes: ");
        // int mes=sc.nextInt(); sc.nextLine();
        // boolean mes_correcto=false;
        // System.out.println("Introduce un año: ");
        // int year=sc.nextInt(); sc.nextLine();

        // if (dia <= 0 || dia>31) {
        //     System.out.println("El dia introducido es incorrecto");
        // }

        // else if (dia == 29 && mes==2) {
        //     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //         System.out.println("El 29 de febrero "+year+" es un año bisiesto");
        //     }
        // }

        // if ( mes<= 0 || mes>12) {
        //     System.out.println("El mes introducido es incorrecto");
        // }
       
        // if (dia >= 1 && dia<=31) {
        //     System.out.println("El dia introducido es correcto");
        //     dia_correcto=true;
        // }

        // if (mes >= 1 && mes<=12){
        //     System.out.println("El mes introducido es correcto");
        //     mes_correcto=true;
        //     System.out.println("El año introducido es correcto");
        // }

        // if (dia_correcto==true && mes_correcto==true) {
        //     System.out.println("El dia, Mes y año introducido es correcto");            
        // }

        //Ejercicios de Bucles:
        //Actividad 6: Pag:16 ; Desarrolla un programa que muestre los números 
        // entre 50 y 200 que son múltiplos de 2 y 3.

        // System.out.println("Los multiplos de 2 y 3 son: ");
        // for(int multiplo2_3=50; multiplo2_3>=50 && multiplo2_3<=200; multiplo2_3++){
        //     if (multiplo2_3%2==0 && multiplo2_3%3==0) {
        //         System.out.println(multiplo2_3);
        //     }
            
        //     }

        //Actividad 7: Pag:16 ;Desarrolla un programa que calcule el factorial del 
        // número introducido. Ej: 4!= 4*3*2*1.
        //Hacia delante
        // Scanner sc = new Scanner(System.in);
        // int contador=1;
        // System.out.println("Introduce un numero: ");
        // int numero=sc.nextInt(); sc.nextLine();
        // int factorial=numero;
        // while (contador<numero) {
        //     factorial=factorial*contador;
        //     contador=contador+1;   
        // }
        // System.out.println("Tu resultado factorial es: "+factorial);

        //Hacia atras
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Introduce un numero: ");
        // int numero=sc.nextInt();
        // int producto=1;
        // for(int i=numero; i>=1;1--){
        //     producto=producto*i;
        // }
        // System.out.println("Tu resultado factorial de : "+numero " es: "+producto);


        //Actividad 8: Pag:16 ; Desarrolla un programa que muestre la edad 
        // máxima y mínima de un grupo de alumnos que se introduzca hasta escribir -1.
    

    }
}
