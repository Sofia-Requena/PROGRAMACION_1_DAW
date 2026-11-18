package RelacionEjerciciosUnidad3.RelacionActividad7;

public class Heroe {
    /*Atributos*/
    private String nombre;
    private int vida;
    private int ataque;

    /*Constructor*/
    public Heroe() {
        nombre="Monstruo";
        vida=100;
        ataque=20;
    }
    
    public Heroe(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
    
    public Heroe(Heroe copiaHeroe) {
        this.nombre = copiaHeroe.getNombre();
        this.vida = copiaHeroe.getVida();
        this.ataque = copiaHeroe.getAtaque();
    }

    /*Metodos */

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }


    /*Mensajes para imprimir*/
    public void mostrarInfo(){
        System.out.println("El nombre del Heroe es: "+nombre);
        System.out.println("La vida del Heroe es: "+vida);
        System.out.println("El daño en el ataque del Heroe es: "+ataque);
    }

    public void recibirDaño(int anio){
        vida=vida-anio;
    }
}
