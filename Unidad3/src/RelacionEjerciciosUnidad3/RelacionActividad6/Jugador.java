package RelacionEjerciciosUnidad3.RelacionActividad6;

public class Jugador {
    /*Atributos*/
    private String Nombre = "";
    private String Apellido = "";
    private String DNI = "";
    private int Edad = 0;
    private Carta Carta;

    /*Constructores */

    public Jugador(){}
    
    public Jugador(String nombre, String apellido, String dNI, int edad, Carta carta) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.DNI = dNI;
        this.Edad = edad;
        this.Carta = carta;
    }

    public Jugador(Jugador copiaJugador) {
        this.Nombre = copiaJugador.getNombre();
        this.Apellido = copiaJugador.getApellido();
        this.DNI = copiaJugador.getDNI();
        this.Edad = copiaJugador.getEdad();
        this.Carta = copiaJugador.getCarta();
    }

    /*Metodos*/
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }

    public Carta getCarta() {
        return Carta;
    }
    public void setCarta(Carta carta) {
        Carta = carta;
    }


    /*Mensajes para imprimir*/

    public void imprimeJugador(){
        System.out.println("El nombre del jugador es: "+Nombre);
        System.out.println("El apellido del jugador es: "+Apellido);
        System.out.println("El DNI del jugador es: "+DNI);
        System.out.println("El edad del jugador es: "+Edad);
        System.out.println("La carta de muestra es: "+Carta.getPalo());
    }



}
