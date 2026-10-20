import java.time.LocalDateTime;
import java.util.Scanner;
public class RelacionEjercicios {
    public static void main(String[] args) {
        // actividad1();
        // actividad2();
        // actividad3();
        actividad4();
        // actividad5();
        // actividad6();
        // actividad7();
        // actividad8();
        // actividad9(); 
        // actividad10_Par();
        // actividad10_Impar();
        // actividad_Ampliacion();

    
    //Llave main
    }

    public static void actividad1(){
    /*1. Escribe un programa que imprima buenos días, buenas tardes y buenas noches según la hora 
    actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. (usa LocalDateTime) */
            
        LocalDateTime hora=LocalDateTime.now();
        /*He puesto & en cada if pero en el ultimo que es el buenas noches he puesto el or porque alguna de 
        las dos se tiene que cumplir para que ponga el buenas noches, ya que si pongo & siempre me va a dar el buenos dias
        ya que se colapsa con los datos del buenos dias que pilla en esa franja horaria*/

        if (hora.getHour()>=6 && hora.getHour()<=12) {
            System.out.println("");
            System.out.println("Buenos dias");
            System.out.println("");
        }
        else if(hora.getHour()>=13 && hora.getHour()<=20){
            System.out.println("");
            System.out.println("Buenas tardes");
            System.out.println("");
        }


        else if (hora.getHour()>=21 || hora.getHour()<=5){
            System.out.println("");
            System.out.println("Buenas noches");
            System.out.println("");
        }
    }

    public static void actividad2(){
    /*2. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las 
    horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se 
    pagan a 16 euros la hora.  */
        Scanner sc = new Scanner(System.in);
        int horas_trabajadas=0;
        int horas_40=0;
        int horas_por_40=0;
        int horas_restantes=0;
        System.out.println("Introduce el número de horas trabajadas durante la semana:");
        horas_trabajadas=sc.nextInt(); sc.nextLine();

        /*Despues de haber pedido los datos necesarios, que son las horas trabajadas, calculamos si las horas trabajadas son mayor o igual a 1 
        y menor o igual a 40, pues le multiplicamos a esas horas por 12 y nos da el sueldo semanal*/
        if (horas_trabajadas>=1 && horas_trabajadas<=40) {
            horas_trabajadas=horas_trabajadas*12;
            System.out.println("El sueldo semanal que te corresponde es de: "+horas_trabajadas+" euros");
        }
        /*En caso de que las horas trabajadas sean mayor a 40 pasamos a calcular automaticamente 40 por 12, y despues 
        para calcular esas horas extra le restamos 40 a esas horas que nos ha dado el usuario y despues las multiplicamos por 16, una vez
        multiplicadas por 16 le sumamos a ese resultado lo que nos ha dado de la multiplicacion de 40 por 12*/
        else if (horas_trabajadas>40) {
            horas_40= 40;
            horas_restantes=(horas_trabajadas-horas_40)*16;
            horas_por_40= 40*12;
            horas_trabajadas=horas_restantes+horas_por_40;
            System.out.println("El sueldo semanal que te corresponde es de: "+horas_trabajadas+" euros");
        }
    }

    public static void actividad3(){
    /*3. Escribe un programa que nos diga el signo del zodiaco a partir del día y el mes de nacimiento. 
    Ejemplo: día:15 mes: 8 → LEO */
        Scanner sc = new Scanner(System.in);
        int dia=0;
        int mes=0;

        System.out.println("Introduce un dia: ");
        dia=sc.nextInt(); sc.nextLine();
        System.out.println("Introduce un mes en numero: ");
        mes=sc.nextInt(); sc.nextLine();

        //Se calcula el rango de dias y meses para detectar si entra en el signo
        //En la primera comparativa, comparamos los dias de un mes, y en la siguiente comparamos los otros dias del otro mes.
        if (( (( dia>=20 && mes==1) &&  (dia<=31&&mes==1)) ||  ((dia>=1 && mes==2) &&  (dia<=18 && mes==2)) )) {
            System.out.println("Tu signo del zodiaco es: Acuario");
        }

        if (( (( dia>=19 && mes==2) &&  (dia<=28&&mes==2)) ||  ((dia>=1 && mes==3) &&  (dia<=20 && mes==3)) )) {
            System.out.println("Tu signo del zodiaco es: Piscis");
        }

        if (( (( dia>=21 && mes==3) &&  (dia<=31 && mes==3)) ||  ((dia>=1 && mes==4) &&  (dia<=19 && mes==4)) )) {
            System.out.println("Tu signo del zodiaco es: Aries");
        }

        if (( (( dia>=20 && mes==4) &&  (dia<=30 && mes==4)) ||  ((dia>=1 && mes==5) &&  (dia<=20 && mes==5)) )) {
            System.out.println("Tu signo del zodiaco es: Tauro");
        }

        if (( (( dia>=21 && mes==5) &&  (dia<=31 && mes==5)) ||  ((dia>=1 && mes==6) &&  (dia<=20 && mes==6)) )) {
            System.out.println("Tu signo del zodiaco es: Geminis");
        }

        if (( (( dia>=21 && mes==6) &&  (dia<=30 && mes==6)) ||  ((dia>=1 && mes==7) &&  (dia<=22 && mes==7)) )) {
            System.out.println("Tu signo del zodiaco es: Cancer");
        }

        if (( (( dia>=23 && mes==7) &&  (dia<=31 && mes==7)) ||  ((dia>=1 && mes==8) &&  (dia<=22 && mes==8)) )) {
            System.out.println("Tu signo del zodiaco es: Leo");
        }

        if (( (( dia>=23 && mes==8) &&  (dia<=31 && mes==8)) ||  ((dia>=1 && mes==9) &&  (dia<=22 && mes==9)) )) {
            System.out.println("Tu signo del zodiaco es: Virgo");
        }

        if (( (( dia>=23 && mes==9) &&  (dia<=30 && mes==9)) ||  ((dia>=1 && mes==10) &&  (dia<=22 && mes==10)) )) {
            System.out.println("Tu signo del zodiaco es: Libra");
        }

        if (( (( dia>=23 && mes==10) &&  (dia<=31 && mes==10)) ||  ((dia>=1 && mes==11) &&  (dia<=21 && mes==11)) )) {
            System.out.println("Tu signo del zodiaco es: Escorpio");
        }

        if (( (( dia>=22 && mes==11) &&  (dia<=30 && mes==11)) ||  ((dia>=1 && mes==12) &&  (dia<=21 && mes==12)) )) {
            System.out.println("Tu signo del zodiaco es: Sagitario");
        }

        if (( (( dia>=22 && mes==12) &&  (dia<=31 && mes==12)) ||  ((dia>=1 && mes==1) &&  (dia<=19 && mes==1)) )) {
            System.out.println("Tu signo del zodiaco es: Capricornio");
        }

        else if (( ((dia<=0) || (dia>=32)) || ((mes<=0) || (mes>=13)) )) {
            System.out.println("Los datos introducidos no son correctos");
        }
    }

    public static void actividad4(){
        /*4. Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas 
        que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un 
        número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media 
        sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se 
        califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la 
        recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso 
        contrario, se mantiene la nota media anterior. */
        double nota1=0;
        double nota2=0;
        double media=0;
        int resultado_apto_noApto=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera nota: ");
        nota1=sc.nextDouble(); sc.nextLine();
        System.out.println("Introduce la segunda nota: ");
        nota2=sc.nextDouble(); sc.nextLine();
        /*Primero he pedido el resultado de ambas notas, despues calculo la media y dependiendo de lo que me de la media, le pone aprobado o suspenso
        en caso de suspenso va a pedir la nota de recuperacion y en caso de que apruebe le pondra apto y si no le pone la nota 
        de la nota media calculada al inicio*/
        media=(nota1+nota2)/2;

        if (media>=5 && media<=10) {
            System.out.println("El alumno esta aprobado con la nota media de: "+media);
        }

        if (media>=0 && media<=4.9) {
            System.out.println("¿Cual ha sido el resultado de la recuperacion? apto (escribe el numero 1) o no apto (escribe el numero 2)");
            resultado_apto_noApto=sc.nextInt(); sc.nextLine();
            if (resultado_apto_noApto == 1) {
                System.out.println("El alumno esta aprobado con la nota de: 5");
            }

            if (resultado_apto_noApto == 2) {
                System.out.println("El alumno esta suspenso con la nota de: "+media);
            }

            if (resultado_apto_noApto != 1 &&  resultado_apto_noApto != 2) {
                System.out.println("El resultado introducido no es correcto");
            }
        }

        else if ((media<=0) || (media>10)) {
            System.out.println("La media introducida no es correcta");
        }
    }

    public static void actividad5(){
        /*5. Escribe un programa que muestre tu horario de clase. Si le pides un día de la semana (1 a 5) te 
        indicará las materias de ese día, si le indicas 6 devolverá el horario completo (hazle formato) y con 
        7 se cerrará el programa. */
        int dia_semana=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana para sacarte el horario: ");
        System.out.println("Si introduces 1-5 se mostrara el horario del dia en concreto");
        System.out.println("Si introduces 6 se mostrara todo el horario de la semana");
        System.out.println("Si introduces 7 se cerrara el programa");
        dia_semana=sc.nextInt(); sc.nextLine();
        System.out.println("");

        /*Aqui he decidido hacer el horario mediante switch ya que he visto que era mas rapido y sencillo a la hora de realizarlo */
        switch (dia_semana) {
            case 1:
            System.out.println("|================|");
            System.out.println("|      Lunes     |");
            System.out.println("|================|");
            System.out.println("|       ED       |");
            System.out.println("|================|");
            System.out.println("|       LM       |");
            System.out.println("|================|");
            System.out.println("|       BD       |");
            System.out.println("|================|");
            System.out.println("|     RECREO     |");
            System.out.println("|================|");
            System.out.println("|       SI       |");
            System.out.println("|================|");
            System.out.println("|       SI       |");
            System.out.println("|================|");
            System.out.println("|       PG       |");
            System.out.println("|================|");
            

                break;

            case 2:
            System.out.println("|================|");
            System.out.println("|     Martes     |");
            System.out.println("|================|");
            System.out.println("|       SI       |");
            System.out.println("|================|");
            System.out.println("|       DG       |");
            System.out.println("|================|");
            System.out.println("|       IP       |");
            System.out.println("|================|");
            System.out.println("|     RECREO     |");
            System.out.println("|================|");
            System.out.println("|       ST       |");
            System.out.println("|================|");
            System.out.println("|       PG       |");
            System.out.println("|================|");
            System.out.println("|       PG       |");
            System.out.println("|================|");
                
                break;

            case 3:
            System.out.println("|================|");
            System.out.println("|    Miercoles   |");
            System.out.println("|================|");
            System.out.println("|       PG       |");
            System.out.println("|================|");
            System.out.println("|       PG       |");
            System.out.println("|================|");
            System.out.println("|       IP       |");
            System.out.println("|================|");
            System.out.println("|     RECREO     |");
            System.out.println("|================|");
            System.out.println("|       BD       |");
            System.out.println("|================|");
            System.out.println("|       BD       |");
            System.out.println("|================|");
            System.out.println("|       PG       |");
            System.out.println("|================|");
                
                break;

            case 4:
            System.out.println("|================|");
            System.out.println("|     Jueves     |");
            System.out.println("|================|");
            System.out.println("|       LM       |");
            System.out.println("|================|");
            System.out.println("|       LM       |");
            System.out.println("|================|");
            System.out.println("|       BD       |");
            System.out.println("|================|");
            System.out.println("|     RECREO     |");
            System.out.println("|================|");
            System.out.println("|       BD       |");
            System.out.println("|================|");
            System.out.println("|       PG       |");
            System.out.println("|================|");
            System.out.println("|       PG       |");
            System.out.println("|================|");
                
                break;

            case 5:
            System.out.println("|================|");
            System.out.println("|     Viernes    |");
            System.out.println("|================|");
            System.out.println("|       SI       |");
            System.out.println("|================|");
            System.out.println("|       SI       |");
            System.out.println("|================|");
            System.out.println("|       BD       |");
            System.out.println("|================|");
            System.out.println("|     RECREO     |");
            System.out.println("|================|");
            System.out.println("|       ED       |");
            System.out.println("|================|");
            System.out.println("|       ED       |");
            System.out.println("|================|");
            System.out.println("|       IP       |");
            System.out.println("|================|");
                
                break;

            case 6:
            System.out.println("|================|================|================|================|================|"); 
            System.out.println("|      Lunes     |     Martes     |    Miercoles   |     Jueves     |     Viernes    | ");
            System.out.println("|================|================|================|================|================|");
            System.out.println("|       ED       |       SI       |       PG       |       LM       |       SI       |");
            System.out.println("|================|================|================|================|================|");
            System.out.println("|       LM       |       DG       |       PG       |       LM       |       SI       |");
            System.out.println("|================|================|================|================|================|");
            System.out.println("|       BD       |       IP       |       IP       |       BD       |       BD       |");
            System.out.println("|================|================|================|================|================|");
            System.out.println("|     RECREO     |     RECREO     |     RECREO     |     RECREO     |     RECREO     |");
            System.out.println("|================|================|================|================|================|");
            System.out.println("|       SI       |       ST       |       BD       |       BD       |       ED       |");
            System.out.println("|================|================|================|================|================|");
            System.out.println("|       SI       |       PG       |       BD       |       PG       |       ED       |");
            System.out.println("|================|================|================|================|================|");
            System.out.println("|       PG       |       PG       |       PG       |       PG       |       IP       |");
            System.out.println("|================|================|================|================|================|");
            System.out.println("");

                break;

            case 7:
                System.out.println("PROGRAMA CERRADO");
                break;

        
            default:
            System.out.println("El numero introducido no a sido reconocido");
                break;
        }
    }

    public static void actividad6(){
        /*6. Escribe un programa que genere la nómina (bien desglosada) de un empleado según las 
        siguientes condiciones: */
        Scanner sc = new Scanner(System.in);
        int cargo_empleado=0;
        int dias_viaje=0;
        int estado_civil=0;
        double sueldo_base=0;
        double dietas=0;
        double sueldo_bruto=0;
        double sueldo_neto=0;
        double retencion_IRPF=0;
        int retencion_irpf_soltero=25;
        int retencion_irpf_casado=20;
        /*Aqui podemos ver que al principio le pedimos los datos necesarios al usuario, despues pasamos a calcular con un switch dependiendo
        del cargo que tenga, tendra un sueldo u otro */
        System.out.println("Introduzca el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto)): ");
        cargo_empleado=sc.nextInt(); sc.nextLine();
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?: ");
        dias_viaje=sc.nextInt(); sc.nextLine();
        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estado_civil=sc.nextInt(); sc.nextLine();
        System.out.println("");

        switch (cargo_empleado) {
            case 1:
                sueldo_base=950;
                break;

            case 2:
                sueldo_base=1200;
                break;

            case 3:
                sueldo_base=1600;
                break;
        
            default:
            System.out.println("El cargo introducido no es correcto");
                break;
        }

        /*Una vez calculado el sueldo, pasamos a calcular las dietas multiplicando los dias que ha estado fuera por 30.
        Despues calculamos el sueldo bruto sumando las dietas con el sueldo base calculado anteriormente.*/
        dietas=dias_viaje*30;
        sueldo_bruto=sueldo_base+dietas;
        /*Aqui le asignamos al sueldo neto (ya que anteriormente no tenia ningun dato guardado) el valor del sueldo bruto
        ya que mas adelante se va a calcular la retencion del IRPF haciendo que se reduzca el sueldo neto dependiendo de 
        si eres casado o soltero, te quitara mas o menos*/
        sueldo_neto=sueldo_bruto;
        /*He decido meter en cada if el resultado para que las variables creadas del irpf_soltero o irpf_casado se muestre entre el parentesis*/

        if (estado_civil==1) {
            retencion_IRPF=((sueldo_bruto*25)/100);
            sueldo_neto=sueldo_neto-retencion_IRPF;

        System.out.println("------------------------------------------");
        System.out.printf("| %-27s %10.2f |\n", "Sueldo base", sueldo_base);
        System.out.printf("| %-27s %10.2f |\n", "Dietas (" + dias_viaje + " viajes)", dietas);
        System.out.println("------------------------------------------");
        System.out.printf("| %-27s %10.2f |\n", "Sueldo bruto", sueldo_bruto);
        System.out.printf("| %-27s %10.2f |\n", "Retención IRPF (" + retencion_irpf_soltero + "%)", retencion_IRPF);
        System.out.println("------------------------------------------");
        System.out.printf("| %-27s %10.2f |\n", "Sueldo neto", sueldo_neto);
        System.out.println("------------------------------------------");
        }

        if (estado_civil==2) {
            retencion_IRPF=((sueldo_bruto*20)/100);
            sueldo_neto=sueldo_neto-retencion_IRPF;

        System.out.println("------------------------------------------");
        System.out.printf("| %-27s %10.2f |\n", "Sueldo base", sueldo_base);
        System.out.printf("| %-27s %10.2f |\n", "Dietas (" + dias_viaje + " viajes)", dietas);
        System.out.println("------------------------------------------");
        System.out.printf("| %-27s %10.2f |\n", "Sueldo bruto", sueldo_bruto);
        System.out.printf("| %-27s %10.2f |\n", "Retención IRPF (" + retencion_irpf_casado + "%)", retencion_IRPF);
        System.out.println("------------------------------------------");
        System.out.printf("| %-27s %10.2f |\n", "Sueldo neto", sueldo_neto);
        System.out.println("------------------------------------------");
        }

    }

    public static void actividad7(){
    /*7. Realiza un programa que introduzca números enteros hasta poner 0 y te diga cuántos positivos y 
    negativos has introducido, la media y cuántas veces se ha repetido el número 7 o -7. */
        Scanner sc = new Scanner(System.in);
        int positivo=0;
        int negativo=0;
        int media=0;
        int repetido_7_o_Menos_7=0;
        int numero=0;
        /*Aqui calculamos al menos una vez el numero intrducido, si resulta que el numero no es igual a 0, se sigue repitiendo la operacion
        en caso de que el numero sea mayor a 0 a la variable positivo se le suma 1, lo mismo sucede en caso de que sea el numero menor que 0
        y en caso de que el numero introducido sea igual a 7 o -7 se le suma tambien a la variable repetido_7_o_Menos_7. Y cuando ya el numero 
        introducido es igual a 0 pasamos a calcular la media de todos los datos recogidos anteriormente y los mostramos */
        do {
        System.out.println("Introduce un numero: ");
        numero=sc.nextInt(); sc.nextLine();
        System.out.println("");
        
        if (numero>0) {
            positivo=positivo+1;
        }

        if (numero<0) {
            negativo=negativo+1;
        }

        if (numero==7 || numero==-7) {
            repetido_7_o_Menos_7=repetido_7_o_Menos_7+1;
        }

        if (numero==0) {
        media=(positivo+negativo)/2;
        System.out.println("Los numero postivos has sido: "+positivo+" , los numero negativos introducidos son: "+negativo+" la media de ambos es: "+media);
        System.out.println("Las veces que se han repetido el numero 7 y -7 ha sido: "+repetido_7_o_Menos_7);
        }
        } while (numero!=0);
    }


    public static void actividad8(){
    /*8. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer 
    término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos 
    anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El 
    número n>=1 se debe introducir por teclado. Es decir, para n=1 tenemos la secuencia 0,1, para n=2 
    tenemos 0,1,1(1+0), para n=3 tenemos 0,1,1,2(1+1),...*/
        Scanner sc = new Scanner(System.in);
        int numero=0;
        int numero1=0;
        int numero2=1;
        int resultado=0;
        int contador=2;
        /*Se pone el contador a 2 ya que si lo ponemos a 0 o 1 no calcula bien la cuenta, es decir, con el contador a 0 si introducimos por ejemplo el numero 3 
        escribe 1 2 3 5 y si ponemos el contador a 1 pondria 1 2 3 y lo correcto es 1 2, en cambio si ponemos el contador a 2 escribe 1 2 que es la operacion correcta */
        System.out.println("Introduce un numero: ");
        numero=sc.nextInt(); sc.nextLine();
        System.out.println("");
        System.out.print("0 1 ");

        /*Aqui al menos entramos una vez y calculamos que resultado va a ser la suma del numero 1 y el numero 2, despues de esa suma mostramos en pantalla 
        lo que se ha guardado en suma, despues al numero 1 le damos el valor de numero 2 y al numero 2 le damos el valor de resultado, le sumamos al contador, 
        y hasta que no sea el contador igual al numero introducido, seguimos calculando.
        */
        do {
            
            resultado=numero1+numero2;
            System.out.print(resultado+" ");
            numero1=numero2;
            numero2=resultado;
            contador=contador+1;            
        } while (contador<=numero);
    }


    public static void actividad9(){
    /*9. A partir del siguiente pseudocódigo, genera la función Java y el programa que muestra los 
    números primos entre 1 y 100. */

    /*Empezamos creando un bucle for para poder mostrar del 1 al 100 los numero 
    que sean primos. Creamos la variable n el cual le damos el valor de muestraPrimo, al booleano primo 
    le asignamos por defecto verdadero,para que cuando mas adelante comprobemos si n es primo o no, cuando 
    se tenga que volver a realizar el bucle, n tambien incremente. Comprobamos si n es menor o igual a 1 en 
    ese caso decirmos que primo es falso, si no hacemos un bucle en el que creamos la variable i y le asignamos 
    el valor de 2, y mientras i sea menor o igual a la raiz cuadrada de n se comprobará si n es primo o no y 
    despues se sale. Si es primo se muestra por pantalla los numeros primos.
    */
        for(int muestraPrimo=1; muestraPrimo<=100; muestraPrimo++){
            int n=muestraPrimo;
            boolean Primo=true;
            if (n<=1) {
                Primo=false;
            }

            else{
                for( int i=2; i<=Math.sqrt(n); i++){
                    if (n % i==0) {
                        Primo=false;
                        break;
                    }
                }
            }

            if (Primo==true) {
                System.out.println("Es primo: "+n );
            
            }

        }
    }


    public static void actividad10_Par(){
    /*10. Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un 
    número indicado por teclado. Genera dos funciones, una para que devuelva el número de pares y 
    otra para el número de impares. Ejemplo de salida: El 406783 contiene 4 dígitos pares y 2 dígitos 
    impares. */
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    int numero=0;
    int numero_par=0;
    numero=sc.nextInt(); sc.nextLine();
    /*Mientras el numero sea distinto a 0 se comprobara si el numero con el MOD 2 es == 0 se le suma la cuenta de pares, 
    y se divide para quitar el numero final ya que al poner un numero entero cuando se divide entre 10 el decimal no se cuenta y se queda el numero sin el numero final*/
    while (numero != 0) {
        if (numero % 2==1) {
            numero=numero/10;
        }

        if (numero % 2==0) {
            numero_par=numero_par+1;
            numero=numero/10;
        }
        
        if (numero==0) {
            System.out.println("Los numeros pares que hay en tu numero son: "+numero_par);
        }
    }


    

    }

    public static void actividad10_Impar(){
    /*10. Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un 
    número indicado por teclado. Genera dos funciones, una para que devuelva el número de pares y 
    otra para el número de impares. Ejemplo de salida: El 406783 contiene 4 dígitos pares y 2 dígitos 
    impares. */
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    int numero=0;
    int numero_impar=0;
    numero=sc.nextInt(); sc.nextLine();

    while (numero != 0) {
        if (numero % 2==1) {
            numero_impar=numero_impar+1;
            numero=numero/10;
        }

        if (numero % 2==0) {
            numero=numero/10;
        }
        
        if (numero==0) {
            System.out.println("Los numeros impares que hay en tu numero son: "+numero_impar);
        }
    }



    }

    public static void actividad_Ampliacion(){
        /* Ampliacion: Escribe el ejercicio 8 pero con una función recursiva.*/

        /*Primero declaramos las variables que vamos a utilizar, despues el numero1 y el numero2 
            empiezan con los valores 0 y 1, ya que son los dos primeros terminos de Fibonacci. El contador lo inicializamos a 
            2 porque vamos a mostrar directamente los dos primeros terminos, que son 0 y 1, y a partir de ahi empezamos a calcular 
            los siguientes. Despues pedimos un numero por teclado, que nos indica hasta donde queremos calcular la serie de Fibonacci. 
            Mostramos por pantalla los dos primeros terminos, 0 y 1, ya que siempre son los mismos. Por ultimo, llamamos a la funcion fibonacciRecursivo, 
            pasandole numero1, numero2, contador y numero. Estos parametros permiten que la funcion sepa cuales son los dos numeros anteriores, 
            cuantas veces hemos calculado un nuevo termino y hasta donde tenemos que llegar.
            */
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numero1 = 0;
        int numero2 = 1;
        int contador = 2;

        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        System.out.print("0 1 ");

        fibonacciRecursivo(numero1, numero2, contador, numero);
}

    public static int fibonacciRecursivo(int numero1, int numero2, int contador, int numero) {
        /* Primero comprobamos si el contador es mayor que el numero
        introducido por teclado. Esta comprobacion es el CASO BASE de nuestra funcion recursiva,
        ya que cuando se cumple significa que hemos calculado todos los terminos que necesitabamos 
        y tenemos que detenernos. Para detener la funcion utilizamos return, que en este caso no devuelve ningun 
        valor,sino que termina la llamada actual.Si el contador todavia no es mayor que el numero introducido,
        seguimos ejecutando las instrucciones de la funcion. Despues calculamos el siguiente termino de Fibonacci,sumando los dos numeros anteriores 
        que estan guardados en numero1 y numero2. Guardamos la suma en resultado y la mostramos por pantalla. Por ultimo, volvemos a 
        llamar a la misma funcion, ya que necesitamos seguir calculando los siguientes terminos de Fibonacci. En esta nueva llamada pasamos 
        en la posicion de numero1 el numero2 ya que el segundo numero pasa a ser el primero. En el segundo lugar de numero2 pasamos resultado, 
        porque ahora el resultado de la suma es nuestro segundo numero. A contador le sumamos 1 para poder llevar la cuenta de los terminos que 
        hemos calculado. Y en la posicion de numero que es el numero introducido por teclado no cambia,porque sigue siendo el limite 
        hasta donde queremos calcular. 
        */
        if (contador > numero) {
            return numero2;
        }
        
        int resultado = numero1 + numero2;
        System.out.print(resultado + " ");
        return fibonacciRecursivo(numero2, resultado, contador+1, numero);

    }






//No cerrar llave (es de la clase RelacionEjercicios)
}
