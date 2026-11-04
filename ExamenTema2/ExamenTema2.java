import java.util.Scanner;

public class ExamenTema2 {
    public static void main(String[] args) {
            // actividad1();
            // actividad2();
            actividad3();
            // imprimeTablero(true);
            // contarPositivos();
    }

    public static void actividad1(){
    /*Primero en este ejercicio lo que hago es declarar las variables que son 
    necesarias para poder calcular los distintos tipos de datos que me pide el enunciado*/
        Scanner sc = new Scanner(System.in);
        int numero_entradas=0;
        final double precio_entradas=8;
        final double precio_entradas_miercoles=5;
        final double precio_entradas_jueves=11;
        String dia_de_la_semana;
        String tarjeta_cineCampa;
        boolean tarjeta_CineCampa=false;
        int entrada_individual=0;
        int entrada_por_pareja=0;
        double descuento=0;
        double total=0;
        double a_pagar=0;

        /*Le pregunto al usuario por el numero de entradas
        por el dia de la semana y si tiene tarjeta del CineCampa 
        y en el siguiente mensaje es para dar paso a que se muestre el resultado
        dandode las gracias por su compra*/
        System.out.println("Ventas de entrada CineCampa");
        System.out.print("Numero de entradas: ");
        numero_entradas=sc.nextInt(); sc.nextLine();
        System.out.print("Dia de la semana: ");
        dia_de_la_semana=sc.next(); sc.nextLine();
        System.out.print("¿Tiene tarjeta CineCampa? (true/false): ");
        tarjeta_CineCampa=sc.nextBoolean(); sc.nextLine();
        System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
        System.out.println("");
        // System.out.println("");

        /*Aqui es donde empezamos a calcular los datos que han sido introducidos,
        y en este caso primero comprobamos cual a sido el dia que a introducido
        el usuario. En caso de que sea domingo se cobra 8 € por cada entrada.
        Si se ha introducido miercoles se le cobra 5 € por cada entrada
        Y en el caso de que sea jueves se cobran 11 € por cada dos entradas. 
        Y en caso de que no haya introducido bien el dia se le notifica*/
        switch (dia_de_la_semana) {
            case "Lunes":

            case "Martes":

            case "Viernes":
            
            case "Sabado":

            case "Domingo":

            case "lunes":

            case "martes":

            case "viernes":
            
            case "sabado":

            case "domingo":
                total=numero_entradas*precio_entradas;
                break;

            case "Miercoles":


            case "miercoles":
                total=numero_entradas*precio_entradas_miercoles;
                break;

            case "Jueves":


            case "jueves":
                entrada_por_pareja=numero_entradas/2;
                total=entrada_por_pareja*precio_entradas_jueves;
                break;
            default:
            System.out.println("El dia introducido no es correcto");
                break;
        }

        /*Aqui me encargo de comprobar de si el usuario tiene la tarjeta 
        de CineCampa o no, en caso de que si la tenga se le hace un descuento del 10% 
        y en caso de que no haya introducido bien la opcion se le notifica*/
        if (tarjeta_CineCampa == true) {
            descuento=(total*10)/100;
        }
        else if(tarjeta_CineCampa == false){
            descuento=0;
        }

        else{
            System.out.println("El la opcion que ha introducido no es correcto");
        }


        /*Aqui lo que he hecho es darle a la entrada individual el valor de numero de entradas
        y a pagar es el total menos el descuento */
        entrada_individual=numero_entradas;
        a_pagar=total-descuento;


        /*Aqui decido que si el dia de la semana que se ha introducido es el jueves
        muestro unos datos (que lo unico que cambia es si son entradas grupales o
        individuales) y en caso de que no sea jueves pues muestro los mismos datos 
        pero cambiando si las entradas son grupales o individuales, aqui podemos ver 
        que antes le he dado a entradas individuales el valor de numero de entradas, 
        pues es para que se muestren cuantas entradas son individuales */
        switch (dia_de_la_semana) {
            case "Jueves":

            case "jueves":
                System.out.println("Entradas grupales: "+entrada_por_pareja);
                System.out.println("Precio por entrada individual: "+ precio_entradas_jueves+" euros");
                System.out.println("Total: "+ total+" euros");
                System.out.println("Descuento: "+ descuento+" euros");
                System.out.println("A pagar: "+ a_pagar+" euros");
            break;

            case "miercoles":

            case "Miercoles":
                System.out.println("Entradas individuales: "+ entrada_individual);
                System.out.println("Precio por entrada individual: "+ precio_entradas_miercoles+" euros");
                System.out.println("Total: "+ total+" euros");
                System.out.println("Descuento: "+ descuento+" euros");
                System.out.println("A pagar: "+a_pagar+" euros");
            break;

            default:
                System.out.println("Entradas individuales: "+ entrada_individual);
                System.out.println("Precio por entrada individual: "+ precio_entradas+" euros");
                System.out.println("Total: "+ total+" euros");
                System.out.println("Descuento: "+ descuento+" euros");
                System.out.println("A pagar: "+a_pagar+" euros");
            break;
        }
    }

    public static int actividad2_humano(int numero_usuario){

        Scanner sc = new Scanner(System.in);
        numero_usuario = 0;
        int piedra = 1;
        int papel = 2;
        int tijera = 3;

        System.out.println("Selecciona uno de estos numeros dependiendo de la opcion que quieras elegir: ");
        System.out.println("1 PIEDRA");
        System.out.println("2 PAPEL ");
        System.out.println("3 TIJERA ");
        System.out.println("-1 Se acaba el juego ");
        numero_usuario = sc.nextInt();
        sc.nextLine();
        return numero_usuario;
    }

    public static int actividad2_maquina(int aleatorio){
        int numero_maquina = 0;
        int piedra = 1;
        int papel = 2;
        int tijera = 3;
        int max=3;
        int min=1;
        aleatorio=((int)(Math.random()*(max-min+1))+min);
        return aleatorio;
    }

    public static void actividad2(){
        /*En este ejercicio se pide que se hagan dos funciones y un procedimiento,
        el cual las dos funciones una pertenece una a que calcule la maquina y la otra 
        que calcule lo del humano. Y esta funcion es para mostrar el resultado.
        
        Primero en este procedimiento lo que hago es crear la variable contador para que 
        cuando llegue a 5 se termine el juego (ya que son las veces que el usuario a perdido)*/
    int contador=0;

    /*Aqui lo que hago es que mientras el contador sea menor que 5, se va a estar pidiendo 
    ambas funciones (la funcion del humano y la de la maquina) y se va a estar comprobando
    cual de los dos gana, pierde o en caso de que sea igual empaten. 
    
    Primero lo que hago es comprobar tambien si se ha introducido -1 (en ese caso el juego termina)
    y en el caso de que se introduzca un numero no valido, se le avisa al usuario*/
    while (contador<5) {
        int numero_usuario1=actividad2_humano(0);
        System.out.println("");

        if (numero_usuario1==-1) {
            System.out.println("EL JUEGO SE HA TERMINADO");
            return;
        }

        if (numero_usuario1<1 || numero_usuario1>3) {
            System.out.println("El numero introducido no es correcto");
            System.out.println("");
        }

        /*Aqui es cuando se empieza a comprobar si el usuario ha ganado, perdido o empatado con
        la maquina, en caso de que la maquina empate se muestra en pantalla que ha perdido el usuario
        y cuantas partidas lleva ganadas la maquina (que se muestra por el contador) y el contador
        va incrementando cuando el usuario pierde. */
        else {
            int numero_maquina2=actividad2_maquina(0);
            System.out.println("La maquina ha elegido: "+numero_maquina2);

            if (numero_usuario1==numero_maquina2) {
                System.out.println("Has empatado con la maquina");
                System.out.println("");
            }

            else if ((numero_usuario1==1 && numero_maquina2==3) || (numero_usuario1==2 && numero_maquina2==1) || (numero_usuario1==3 && numero_maquina2==2)) {
                System.out.println("Has ganado esta partida");
                System.out.println("");
            }

            else {
                System.out.println("Has perdido esta partida");
                contador=contador+1;
                System.out.println("Partidas de la maquina ganadas: "+contador);
                System.out.println("");

            }
        }
    }

    /*Una vez que el contador haya llegado a 5 se muestra dos mensajes, el primero notificando
    que ha perdido contra la maquina 5 veces y el segundo dice el juego se ha terminado, para 
    que se muestre lo mismo que si se introduce -1 al principio. */
    System.out.println("");
    System.out.println("La maquina ha ganado 5 veces");
    System.out.println("EL JUEGO SE HA TERMINADO");
}

    public static void actividad3(){
    /*En este ejercicio primero he declarado las variables necesarias para calcular lo
    que se pide. Despues le pido al usuario que introduzca un numero, y la variable que he 
    creado (para calcular el numero menor de todos los que se vayan a introducir ) le he dado 
    el valor inicial del primer numero introducido, para que mas adelante se compruebe si es 
    el menor o no de todos los que se introduzcan. */
        Scanner sc = new Scanner(System.in);
        int positivo=0;
        int negativo=0;
        int impares=0;
        int impares_suma=0;
        int impares_negativos=0;
        int impar_menor=0;
        int par_menor=0;
        int numero_par_mayor=0;
        int numero_menor_de_todos=0;
        int numero=0;
        System.out.println("Introduce un numero: ");
        numero=sc.nextInt(); sc.nextLine();
        System.out.println("");
        numero_menor_de_todos=numero;

        /*Aqui comprobamos si el primer numero introducido es positivo, si es impar o es par
        o si el numero es igual que 0 el numero menor de todos le damos el valor de numero, ya que 
        el programa se acaba en el momento que se introduzca 0, y para comprobar
        este primer numero, si es negativo todos los valores deben estar a 0 ya que no se han introducido
        ningun valor valido. */
        if (numero>0) {
            positivo=positivo+1;
        }
        
        if (numero<0) {
            negativo=negativo+1;
        }


            if (numero!=0) {
                if (numero % 2==1) {

                    if (numero>0) {
                        impares=numero;
                        impares_suma=impares_suma+impares;
                    }

                if (numero % 2==-1) {
                        if (numero<0) {
                            impares_negativos=numero;
                        }
                
            }

                    if (numero>impar_menor) {
                        impar_menor=numero;
                    }
                }
            }

        if (numero==0) {
            System.out.println("No se ha introducido ningun numero");
            return;
        }

        if ( numero>0 || numero<0) {
            numero_menor_de_todos=numero;
        }

        /*En caso de que en el primer numero no se haya introducido 0, se 
        sigue calculando los valores que hemos calculado al principio y los datos van 
        incrementando.*/
        while (numero!=0){
        System.out.println("Introduce un numero: ");
        numero=sc.nextInt(); sc.nextLine();
        System.out.println("");
        
            if (numero>0) {
                positivo=positivo+1;
            }

            if (numero<0) {
                negativo=negativo+1;
            }
/*No entiendo porque no se restan los numeros negativos con los positivos impares */
            if (numero!=0) {
                if (numero % 2==1) {

                    if (numero>0) {
                        impares=numero;
                        impares_suma=impares_suma+impares;
                    }

                if (numero % 2==-1) {
                        if (numero<0) {
                            impares_negativos=numero;
                        }
                
            }

                    if (numero>impar_menor) {
                        impar_menor=numero;
                    }
                }
            }



            if (numero % 2==0) {
                if (numero>numero_par_mayor) {
                    numero_par_mayor=numero;
                }

                if (numero>par_menor) {
                    par_menor=numero;
                }
            }

            if (numero>0 || numero<0) {
                if (numero<numero_menor_de_todos) {
                    numero_menor_de_todos=numero;
                }
            }
        }
        /*Cuando se introduzca 0, se mostraran todos los datos que se piden en el ejercicio.*/
        if (numero==0) {        
            System.out.println("La cantidad de numeros introducidos son: "+(positivo+negativo));
            System.out.println("La suma de los numeros impares son: "+impares_suma);
            System.out.println("El mayor de los pares es: "+numero_par_mayor);
            System.out.println("Y el numero menor que ha sido introducido ha sido: "+numero_menor_de_todos);
        }

        /*En caso de que se introduzcan numeros impares y ninguno par el 0 que aparece en impares no es por el 
        0 introducido es porque a la variable le he dado al principio ese valor */
    }

        public static boolean imprimeTablero(boolean valor){
        /*En esta funcion logica lo que hago es que dependiendo de si la funcion es verdadera o 
        falsa, se muestra una tabla u otra. */
       if (valor == true) {
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("|   |   | X |   |   |   |   |");
        System.out.println("|   |   | O | X |   |   |   |");
        System.out.println("|   | X | O | O |   |   |   |");
        System.out.println("| X | O | X | O | X |   |   |");        
        System.out.println("-----------------------------");
        System.out.println("  0   1   2   3   4   5   6");
       }

       if (valor==false) {
        System.out.println("| X | O | X |");
        System.out.println("-------------");
        System.out.println("|   | O |   |");
        System.out.println("-------------");
        System.out.println("|   | X |   |");
        System.out.println("-------------");
        System.out.println("  0   1   2");
       }
       return valor;
    }

public static class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public static void contarPositivos() {
    Scanner sc = new Scanner(System.in);
    int numero=0;

    /*Primero lo que hago es pedir al usuario que introduzca numeros
    hasta que introduzca un 0. Mientras el numero sea positivo
    se le suma uno al contador*/

    try {
        do {
            System.out.print("Introduce un numero (0 para salir): ");
            numero=sc.nextInt(); sc.nextLine();

            if (numero<0) {
                throw new NumeroNegativoException("El programa ha finalizado porque has introducido un numero negativo");
            }

        } while (numero!=0);

        System.out.println("Se ha terminado porque has introducido 0");

    } catch (NumeroNegativoException e) {
        System.out.println(e.getMessage());
    }
}
}

