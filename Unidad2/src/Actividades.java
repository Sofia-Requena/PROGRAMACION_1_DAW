import java.util.Scanner;

public class Actividades {
    //final
    final static double PI=3.14159;
    public static void main(String[] args) {
        //Aqui llamamos a las funciones para imprimirlas.
        
        // actividad1_pag9();
        // actividad2_pag12();
        // actividad3_pag14();
        // actividad4_elseIf_pag14();
        // actividad4_switch_pag14();
        // actividad5_pag14();
        // actividad6_pag16();
        // actividad7_pag16();
        // actividad7_inversa_pag16();
        // actividad8_pag16();
        // actividad9_pag17();
        // actividad10_pag17();
        // actividad11_pag17();
        // actividad12_pag18();
        // actividad13_pag18();
        // actividad14_pag19();
        // actividad15_pag24_area_cilindro( 2, 3);
        // actividad15_pag24_volumen_cilindro( 2,3 );
        // num_par_divisible_2y3();
        
        //Actividades recursivas

            // digitosNumero(5);

            // System.out.println (digitosSumaN(5));
            // System.out.println(digitosSumaN_Recursiva(5));

            // System.out.println(potencia_A_elevado_B(2, 2));
            // System.out.println(potencia_A_elevado_B_recursiva(2, 2));

            // System.out.println(convertirABinario(135));

        


    }
    

    public static void imprimir(String cadena, int variable) {
        System.out.println(cadena+variable);
    }
    public static int suma(int a, int b) {
        return a+b;
    }

    public static void actividad1_pag9(){
    //  Ejercicios Uso de funciones definidas.
    //    //Actividad 1- pag:9. Realiza un programa que genera 2 números y nos diga el cociente, 
    //    // la media, la potencia y la raíz cuadrada. Usa tipos adecuados

        int min=1;
        int max=10;
        double num1=((int)(Math.random()*(max-min+1))+min);
        double num2=((int)(Math.random()*(max-min+1))+min);
        double potencia = Math.pow(num1,num2);
        double raiz = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);
        System.out.println("El primer numero es: "+num1);
        System.out.println("El segundo numero es: "+num2);
        System.out.println("El cociente de los dos numeros es: "+(num1/num2));
        System.out.println("La media de los dos numeros es: "+(num1+num2)/2);
        System.out.println("La potencia del numero 2 elevado al numero 1: "+potencia);
        System.out.println("La raiz cuadrada del primer numero es: "+raiz );
        System.out.println("La raiz cuadrada del segundo numero es: "+raiz2 );

    }

        public static void actividad2_pag12(){
        // //Actividad 2: ¿Cómo sabemos si un número es divisible por 2 y por 3? Pag: 12
        int numero=9;

        if (numero % 2==0) {
            if (numero % 3==0) {
            System.out.println("El numero "+numero+" es divisible por 2 y por 3");
         }
        }

        else{
            System.out.println("El numero "+numero+" no es divisible ni entre 2 ni entre 3");
        }

    }
    

        public static void actividad3_pag14(){
        //Ejercicios Condicionales:
        // //Actividad 3: Pag:14 ; Haz el programa JAVA del siguiente diagrama de flujo
        Scanner sc = new Scanner(System.in);
        //Declaro la variables de a, b y c
        double a;
        a=sc.nextInt(); sc.nextLine();
        double b;
        b=sc.nextInt(); sc.nextLine();
        double c;
        c=sc.nextInt(); sc.nextLine();
        double variable;
        variable= Math.pow(b, 2)-4*(a*c);

        //Variables de las soluciones
        double x1;
        double x2;
        // Primer si no
        if (variable<0) {
            System.out.println("No hay soluciones");
        }
        else if (variable==0) {
            x1= (-b)/(2*a);
            System.out.println("La unica solucion es: "+x1);
        // Segundo si no
        }
        else{
            x1= (((-b)+Math.sqrt(variable))/(2*a));
            x2= (((-b)-Math.sqrt(variable))/(2*a));
            System.out.println("La primera solucion es: "+x1);
            System.out.println("La segunda solucion es: "+x2);
        }
    }

        public static void actividad4_elseIf_pag14(){
        //Actividad 4: Pag:14 ; Haz un programa que nos pide una nota y nos indica la calificación 
        // (sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta). Usa if-else y switch
            //Hecho con if else
         Scanner sc = new Scanner(System.in);
        // //Declaro la variables de nota
            double nota;
            System.out.println("INTRODUCE LA NOTA: ");
            nota=Double.parseDouble(sc.nextLine());

            if (nota>=0 && nota<=4.9 ) {
                System.out.println("Suspenso");
            } else if (nota>=5 && nota<=5.9) {
                System.out.println("Aprobado");
            }
            else if (nota>=6 && nota<=6.9 ) {
                System.out.println("Bien");
            }

            else if (nota>=7 && nota<=8.9) {
                System.out.println("Notable");
            }

            else if (nota>=9 && nota<=10) {
                System.out.println("Sobresaliente");
            }
            
            
            else {
                System.out.println("La nota introducida no es correcta");
            }
        }


        public static void actividad4_switch_pag14(){
         //Actividad 4: Pag:14 ; Haz un programa que nos pide una nota y nos indica la calificación 
        // (sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta). Usa if-else y switch

        //Hecho con Switch
   
                Scanner sc = new Scanner(System.in);
                System.out.println("INTRODUCE LA NOTA: ");
                int nota=sc.nextInt(); sc.nextLine();

            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Suspenso");
                    break;
                case 5:
                    System.out.println("Aprobado");
                    break;
                case 6:
                System.out.println("Bien");
                    break;
                case 7:
                case 8:
                System.out.println("Notable");
                    break;
                case 9:
                case 10:
                System.out.println("Sobresaliente");
                    break;
            default:
                System.out.println("La nota introducida no es valida");
          }
        }

        public static void actividad5_pag14(){
        // Actividad 5: Pag:14 ; Haz un programa que solicita el día, mes y año y comprueba si es válido. 
        // Para el año hay que ver si el 29 es válido por ser bisiesto. Un año es bisiesto si: (anio % 
        // 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un dia: ");
            int dia=sc.nextInt(); sc.nextLine();
            boolean dia_correcto=false;
            System.out.println("Introduce un mes: ");
            int mes=sc.nextInt(); sc.nextLine();
            boolean mes_correcto=false;
            System.out.println("Introduce un año: ");
            int year=sc.nextInt(); sc.nextLine();

            if (dia <= 0 || dia>31) {
                System.out.println("El dia introducido es incorrecto");
            }

            else if (dia == 29 && mes==2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("El 29 de febrero "+year+" es un año bisiesto");
                }
            }

            if ( mes<= 0 || mes>12) {
                System.out.println("El mes introducido es incorrecto");
            }
        
            if (dia >= 1 && dia<=31) {
                System.out.println("El dia introducido es correcto");
                dia_correcto=true;
            }

            if (mes >= 1 && mes<=12){
                System.out.println("El mes introducido es correcto");
                mes_correcto=true;
                System.out.println("El año introducido es correcto");
            }

            if (dia_correcto==true && mes_correcto==true) {
                System.out.println("El dia, Mes y año introducido es correcto");            
            }


            }

            public static void actividad6_pag16(){
            // Ejercicios de Bucles:
            // Actividad 6: Pag:16 ; Desarrolla un programa que muestre los números 
            // entre 50 y 200 que son múltiplos de 2 y 3.

                System.out.println("Los multiplos de 2 y 3 son: ");
                for(int multiplo2_3=50; multiplo2_3>=50 && multiplo2_3<=200; multiplo2_3++){
                    if (multiplo2_3%2==0 && multiplo2_3%3==0) {
                        System.out.println(multiplo2_3);
                    }
                    
                    }
            }

            public static void actividad7_pag16(){
            //Actividad 7: Pag:16 ;Desarrolla un programa que calcule el factorial del 
            // número introducido. Ej: 4!= 4*3*2*1.
            //Hacia delante
                Scanner sc = new Scanner(System.in);
                int contador=1;
                System.out.println("Introduce un numero: ");
                int numero=sc.nextInt(); sc.nextLine();
                int factorial=numero;
                while (contador<numero) {
                    factorial=factorial*contador;
                    contador=contador+1;   
                }
                System.out.println("Tu resultado factorial es: "+factorial);
            }

            public static void actividad7_inversa_pag16(){
            //Actividad 7: Pag:16 ;Desarrolla un programa que calcule el factorial del 
            // número introducido. Ej: 4!= 4*3*2*1.
            //Hacia atras
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce un numero: ");
                int numero=sc.nextInt();
                int producto=1;
                for(int i=numero; i>=1;i--){
                    producto=producto*i;
                }
                System.out.println("Tu resultado factorial de : "+numero+" es: "+producto);

            }

            public static void actividad8_pag16(){
            //Actividad 8: Pag:16 ; Desarrolla un programa que muestre la edad 
            // máxima y mínima de un grupo de alumnos que se introduzca hasta escribir -1.
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce una edad: ");
                int edad=sc.nextInt(); sc.nextLine();
                int edad_max=0;
                int edad_min=0;
                int contador=0;
                do {

                    if (contador==0) {
                        edad_max=edad;
                        edad_min=edad;
                        contador=contador+1;
                    }

                    if (edad<edad_min && (edad !=1)) {
                        edad_min=edad;
                    }

                    if ((edad>edad_max)){
                        edad_max=edad;
                    }
                System.out.println("Introduce una edad: ");
                edad=sc.nextInt(); sc.nextLine();

                } while (edad!=-1);
                System.out.println("La edad maxima introducida es: "+edad_max+" y la edad minima introducida es: "+edad_min);


            }

            public static void actividad9_pag17(){
            //Actividad 9: Pag:17 ; Continúa el programa anterior para que calcule la suma, 
            // media, número de alumnos y cuántos son mayores de edad
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce una edad: ");
                int edad=sc.nextInt(); sc.nextLine();
                int edad_max=0;
                int edad_min=0;
                int contador=0;
                int suma_edades=0;
                int mayor_edad=0;
                int media=0;
                do {

                    if (contador==0) {
                        edad_max=edad;
                        edad_min=edad;
                        contador=contador+1;
                    }

                    if (edad<edad_min && (edad !=1)) {
                        edad_min=edad;
                        contador=contador+1;
                    }

                    if ((edad>edad_max)){
                        edad_max=edad;
                        contador=contador+1;
                    }

                    if (edad>17) {
                    mayor_edad=mayor_edad+1;
                    }

                suma_edades=suma_edades+edad;

                System.out.println("Introduce una edad: ");
                edad=sc.nextInt(); sc.nextLine();
                
                } while (edad!=-1);
                media=suma_edades/contador;
                System.out.println("La edad maxima introducida es: "+edad_max+" y la edad minima introducida es: "+edad_min);
                System.out.println("La suma de la edades de alumnos: "+suma_edades+" la media de las edades: "+media+" y los que son mayor de edad son: "+mayor_edad);
                
            }

            public static void actividad10_pag17(){
            // Ejercicio 10 Pag: 17; Desarrolla un programa que trate de adivinar un número 
            // entre 1 y 100 generado aleatorio, que vaya indicando si 
            // has introducido un número mayor o menor al correcto y 
            // el número de intentos.
                Scanner sc = new Scanner(System.in);
                int aleatorio=0;
                int intentos=1;
                int min=1;
                int max=100;
                System.out.println("Introduce una numero: ");
                int num_introducido=sc.nextInt(); sc.nextLine();
                aleatorio=((int)(Math.random()*(max-min+1))+min);
                
                do {
                    
                    System.out.println("Introduce una numero: ");
                    num_introducido=sc.nextInt(); sc.nextLine();
                    intentos=intentos+1;
                    if (num_introducido>aleatorio) {
                        System.out.println("El numero introducido es mayor al correcto");
                    }

                    else if (num_introducido<aleatorio) {
                        System.out.println("El numero introducido es menor al correcto");
                    }

                    if (num_introducido==aleatorio) {
                        System.out.println("Has introducido el numero correcto en "+intentos+" intentos");
                    }

                } while (num_introducido!=aleatorio);

            }

            public static void actividad11_pag17(){
            // Ejercicio 11 Pag: 17; Desarrolla un programa que simule una calculadora 
            // según la opción introducida y que pida los operandos 
            // hasta que introduces -1.
                Scanner sc = new Scanner(System.in);
                double dato1=0;
                double dato2=0;
                double suma=0;
                double resta=0;
                double multiplicacion=0;
                double division=0;
                int numero_calcular=0;
                
                do {
                    dato1=0;
                    dato2=0;
                    suma=0;
                    resta=0;
                    multiplicacion=0;
                    division=0;
                    numero_calcular=0;
                System.out.println("Selecciona uno de estos numeros dependiendo de que calculo quieras realizar: ");
                System.out.println("1 SUMA ");
                System.out.println("2 RESTA ");
                System.out.println("3 MULTIPLICACION ");
                System.out.println("4 DIVISION");
                System.out.println("-1 Apagar calculadora ");
                numero_calcular=sc.nextInt(); sc.nextLine();


                if (numero_calcular==1) {
                System.out.println("Introduce el primer dato: ");
                dato1=sc.nextInt(); sc.nextLine();
                System.out.println("Introduce el segundo dato: ");
                dato2=sc.nextInt(); sc.nextLine();

                    suma=dato1+dato2;
                    System.out.println("El resultado de la suma de los datos "+dato1+" y "+dato2+" es: "+suma);
                    System.out.println(" ");
                    
                }

                if (numero_calcular==2) {
                System.out.println("Introduce el primer dato: ");
                dato1=sc.nextInt(); sc.nextLine();
                System.out.println("Introduce el segundo dato: ");
                dato2=sc.nextInt(); sc.nextLine();

                    resta=dato1-dato2;
                    System.out.println("El resultado de la resta de los datos "+dato1+" y "+dato2+" es: "+resta);
                    System.out.println(" ");
                }

                if (numero_calcular==3) {
                System.out.println("Introduce el primer dato: ");
                dato1=sc.nextInt(); sc.nextLine();
                System.out.println("Introduce el segundo dato: ");
                dato2=sc.nextInt(); sc.nextLine();

                    multiplicacion=dato1*dato2;
                    System.out.println("El resultado de la multiplicacion de los datos "+dato1+" y "+dato2+" es: "+multiplicacion);
                    System.out.println(" ");
                }

                if (numero_calcular==4) {
                System.out.println("Introduce el primer dato: ");
                dato1=sc.nextInt(); sc.nextLine();
                System.out.println("Introduce el segundo dato: ");
                dato2=sc.nextInt(); sc.nextLine();

                    division=dato1/dato2;
                    System.out.println("El resultado de la division de los datos "+dato1+" y "+dato2+" es: "+division);
                    System.out.println(" ");
                }

                if (numero_calcular==-1) {
                    System.out.println(" ");
                    System.out.println("CALCULADORA APAGADA");
                }

                } while (numero_calcular!=-1);

            }

            public static void actividad12_pag18(){
             // Ejercicio 12 Pag: 18; Algoritmo MCD ejercicio 7 de la pagina 18.
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el primer numero: ");
                int a=sc.nextInt(); sc.nextLine();
                System.out.println("Introduce el segundo numero: ");
                int b=sc.nextInt(); sc.nextLine();
                int absoluto_A = Math.abs(a);
                int absoluto_B = Math.abs(b);
                int resto=0;


                while (absoluto_B!=0) {
                    resto= absoluto_A%absoluto_B;
                    absoluto_A=absoluto_B;
                    absoluto_B=resto;
                }

                System.out.println("El MCD es: "+a);

            }

            public static void actividad13_pag18(){
            // Ejercicio 13 Pag: 18; Algoritmo MCM ejercicio 7 de la pagina 18.
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el primer numero: ");
                int a=sc.nextInt(); sc.nextLine();
                System.out.println("Introduce el segundo numero: ");
                int b=sc.nextInt(); sc.nextLine();
                int absoluto_A = Math.abs(a);
                int absoluto_B = Math.abs(b);
                int mayor= Math.max(absoluto_A, absoluto_B);
                int mcm= mayor;


                while ((mcm % absoluto_A!=0) || (mcm % absoluto_B!=0)) {
                    mcm=mcm+mayor;
                }

                System.out.println("El MCM es: "+mcm);

            }

            public static void actividad14_pag19(){
            // Ejercicio 14 Pag: 19; Desarrolla el programa que muestra las tablas de multiplicar del 1 al 10
                for(int i=1; i<=10; i++){
                    System.out.print("Tabla del " + i);
                    for(int j=1; j<=10; j++){
                        System.out.println(i+ "*" + j + "=" + (i*j));
                    
                    }
                    System.out.println();
                    
                }
            }

            public static void actividad15_pag24_volumen_cilindro(double radio, double altura){
            // Crea un procedimiento para calcular el área y volumen de un cilindro (2*PI*(altura+radio), PI*radio2*altura)
                System.out.println(PI*radio*radio*altura);
            }

            public static void actividad15_pag24_area_cilindro(double radio, double altura){
            // Crea un procedimiento para calcular el área y volumen de un cilindro (2*PI*(altura+radio), PI*radio2*altura)
                System.out.println(2*PI*(altura+radio));

            }

            /*este es el ejercicio 16 de la pagina 24, para imprimir el resultado utilizamos num_par_divisible_2y3(). Los 3 publics son es_par, es_divisible_entre_2y3; y num_par_divisible_2y3 */
                public static boolean es_par(int numero){
                    boolean es_par;
                    if (numero%2==0) {
                        return true;
                    }
                    else{
                        return false;
                    }
                    
                }
                
                public static boolean es_divisible_entre_2y3(int divisible2y3){
                    boolean divisible;
                    if (divisible2y3 % 2==0 && divisible2y3 % 3==0 ) {
                        divisible=true;   
                    }
                    else{
                        divisible=false; 
                    }

                    return divisible;
                }

                public static void num_par_divisible_2y3(){
                    for(int i=1; i<=20; i++){
                    if (es_par(i) && es_divisible_entre_2y3(i)) {
                        System.out.print(i+", ");
                        }
                    }
                }

                public static int digitosNumero (int n){
                    //Caso base
                    if (n>0 && n<=9) {
                        return 1;
                    }
                    else {//Caso recursivo
                        return 1+digitosNumero (n/10);
                    }
                }

                public static int digitosSumaN(int n){
                    //Caso iterativo
                    int suma=0;
                    for(int i=1;i<=n;i++){
                        suma=suma+i;
                    }
                    return suma;
                }

                public static int digitosSumaN_Recursiva(int n){
                    //Caso base
                    if(n==1){ return 1;}
                    //Caso recursivo    
                    else{  return n+digitosSumaN_Recursiva(n-1);}
                }

                public static int potencia_A_elevado_B(int a, int b){
                    /*Función que calcula ab usando recursividad. Recordad que 
                    ab=a*ab-1 */
                    //Caso iterativo
                    int potencia=1;
                    for(int i=1; i<=b; i++){
                        potencia=potencia*a;
                    }
                    return potencia;
                }

                public static int potencia_A_elevado_B_recursiva(int a, int b){
                    /*Función que calcula ab usando recursividad. Recordad que 
                    ab=a*ab-1 */
                    //Caso base
                    int potencia=1;
                    if (b==1){
                        return a; 
                    }
                    else {
                        return a*potencia_A_elevado_B_recursiva(a, b-1);
                    }
                }

                private static String convertirABinario(int num) {
                    if (num == 0) {
                        return "";
                    } else {
                        return convertirABinario (num / 2) + (num % 2);
                    }

                    ///Para pasar el 135 a binario es de la siguiente manera:
                    /// Pongo el numero en el que se va a dividir, despues pongo lo que 
                    /// da la division y dependiendo de lo que de el modulo (puede ser 1 o 0)
                    /// se le añade a la cadena +1 (o +0 dependiendo de lo que de el MOD) pero 
                    /// se añade cuando ya no tenemos mas numero que dividir (que es cuando numero es = 0).
                    ///
                    /// num=135 -->  convertirABinario(67) +1; 
                    /// num=67 -->  convertirABinario(33) +1; 
                    /// num=33 -->  convertirABinario(16) +1; 
                    /// num=16 -->  convertirABinario(8) +0; 
                    /// num=8 -->  convertirABinario(4) +0; 
                    /// num=4 -->  convertirABinario(2) +0; 
                    /// num=2 -->  convertirABinario(1) +0; 
                    /// num=1 -->  convertirABinario(0) +1; 

                }


//no borrar llave
}
        


