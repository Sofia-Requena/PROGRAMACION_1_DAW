package RelacionEjerciciosUnidad3.RelacionActividad6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Juego {
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


   public void cartaAlta(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un palo por teclado (Oros, Copas, Espadas o Bastos): ");
    String palo_teclado=sc.next(); sc.nextLine();

    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    jugador1.setNombre("jugador1");
    jugador2.setNombre("jugador2");
    int min=1;
    int max=12;

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
