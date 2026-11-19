package RelacionEjerciciosUnidad3.RelacionActividad6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Juego {
/*Ejercicio tipo examen. Juego de la carta más alta. El proyecto tiene dos clases principales: 
Carta y Jugador. Para Jugador se guardarán los atributos que estimes oportunos y la Carta que le haya tocado. 
Para Carta tendrá como atributos el valor y como enum el palo (Oros, Copas, Espadas o Bastos) 
Las clases están completas y tendrán una función para mostrar sus atributos (ej. imprimeJugador() e imprimeCarta()).
Para utilizar ambas clases, la clase Juego tiene como atributos ganadas1 y ganadas2 y en main se en 
cargará de: 
    • Crear un objeto juego que inicializa ganadas1 y ganadas2 a 0. Después ejecuta su función 
    cartaAlta() que hará:
    ◦ Asignar una carta aleatoria a cada jugador. Cada carta se genera con un valor aleatorio 
    entre 1 y 12.
    ◦ Mostrar las cartas de cada jugador y comprobar quién ha ganado. Gana la carta mayor.
    ◦ El juego se acaba cuando uno de los jugadores ha ganado 3 veces
    ◦ Al terminar guardará en un fichero el resultado de ganadas1 y ganadas2 a modo de histórico de partidas.(Recuerda usar append).
    Opcional: Incorpora alguna lógica para el palo en caso de empate. Por ejemplo, solicita un palo de muestra */
    
    /*Atributos*/
    private int ganadas1;
    private int ganadas2;

    /*Constructores */
    public Juego(){ 
        ganadas1=0;
        ganadas2=0;
    }

    public Juego(int ganadas1, int ganadas2) {
        this.ganadas1 = ganadas1;
        this.ganadas2 = ganadas2;
    }

    public Juego(Juego copiaJuego) {
        this.ganadas1 = copiaJuego.getGanadas1();
        this.ganadas2 = copiaJuego.getGanadas2();
    }

   /*Metodos */
   public int getGanadas1() {
        return ganadas1;
    }

    public void setGanadas1(int ganadas1) {
        this.ganadas1 = ganadas1;
    }

    public int getGanadas2() {
        return ganadas2;
    }

    public void setGanadas2(int ganadas2) {
        this.ganadas2 = ganadas2;
    }

/*Mensajes para imprimir*/
   public void cartaAlta(){
    /*Aqui lo que hacemos es pedimos por teclado que introduzcan un tipo de palo*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un palo por teclado (Oros, Copas, Espadas o Bastos): ");
    String palo_teclado=sc.next(); sc.nextLine();

    /*Aqui creamos dos jugadores y le damos los datos de nombre de cada uno. Tambien creamos las variables min y max para que 
    nos de un numero al azar entre 1 y 12*/
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    jugador1.setNombre("jugador1");
    jugador2.setNombre("jugador2");
    int min=1;
    int max=12;

    /*Aqui comprobamos que mientras que ninguno de los dos hayan ganado 3 veces, se le ira asignando un valor distinto
    cuando alguno de los dos gane 3 veces se imprimira cuantas veces ha ganado cada uno*/
    while (ganadas1!=3 && ganadas2!=3) {
        int aleatorio =((int)(Math.random()*(max-min+1))+min);
        Carta carta1 = new Carta(aleatorio, "Espadas");
        aleatorio =((int)(Math.random()*(max-min+1))+min);
        Carta carta2 = new Carta(aleatorio, "Oros");
        
        jugador1.setCarta(carta1);
        System.out.println("El Valor de la carta1: "+jugador1.getCarta().getValor()+ " El Palo de la carta1: "+jugador1.getCarta().getPalo());
        jugador2.setCarta(carta2);
        System.out.println("El Valor de la carta2: "+jugador2.getCarta().getValor()+ " El Palo de la carta2: "+jugador2.getCarta().getPalo());

        if (jugador1.getCarta().getValor()>jugador2.getCarta().getValor()) {
            System.out.println("Ha ganado la carta1");
            ganadas1=ganadas1+1;
            System.out.println("");
        }

        else if (jugador1.getCarta().getValor()<jugador2.getCarta().getValor()) {
            System.out.println("Ha ganado la carta2");
            ganadas2=ganadas2+1;
            System.out.println("");
        }

        else if (jugador1.getCarta().getValor()==jugador2.getCarta().getValor()) {
            System.out.println("La carta1 y la carta2 han quedado empate");
            if (carta1.getPalo().equalsIgnoreCase(palo_teclado)) {
                System.out.println("Ha ganado la carta1");
                ganadas1=ganadas1+1;
                System.out.println("");
            }

            else if (carta2.getPalo().equalsIgnoreCase(palo_teclado)) {
                System.out.println("Ha ganado la carta2");
                ganadas2=ganadas2+1;
                System.out.println("");
            }
        }
    }

        System.out.println("El jugador 1 ha ganado "+ganadas1+" veces");
        System.out.println("El jugador 2 ha ganado "+ganadas2+" veces");
        System.out.println("");
    String contenido = "El jugador 1 ha ganado "+ganadas1+" veces";
    String contenido2 = "El jugador 2 ha ganado "+ganadas2+" veces";
    
    /*Aqui lo que hacemos es darle una ruta para crear un archivo, el cual se encargara de guardar los datos de
    las partidas ganadas finales*/
        try {
            FileWriter archivo = new FileWriter("./src/RelacionEjerciciosUnidad3/RelacionActividad6/Resultados.txt",true); 
            BufferedWriter escritor = new BufferedWriter(archivo); 
            escritor.write(contenido);  // Escribimos la cadena en el archivo
            escritor.newLine();         // Añadimos una nueva línea
            escritor.write(contenido2);  
            escritor.newLine(); 
            escritor.newLine(); 
            escritor.close();           // Cerramos el BufferedWriter
            System.out.println("¡Archivo escrito con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }


   }


   /*Main */
   public static void main(String[] args) {
    Juego juego = new Juego();
    juego.cartaAlta();

   }

/*No borrar llave*/
}
