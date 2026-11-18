package RelacionEjerciciosUnidad3.RelacionActividad7;

public class Monstruo {
    /*Atributos*/
    private String nombre;
    private int vida;
    private int ataque;

    /*Constructor*/
    public Monstruo() {
        nombre="Monstruo";
        vida=100;
        ataque=10;
    }
    
    public Monstruo(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
    
    public Monstruo(Monstruo copiaMonstruo) {
        this.nombre = copiaMonstruo.getNombre();
        this.vida = copiaMonstruo.getVida();
        this.ataque = copiaMonstruo.getAtaque();
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
        System.out.println("El nombre del Monstruo es: "+nombre);
        System.out.println("La vida del Monstruo es: "+vida);
        System.out.println("El daño en el ataque del Monstruo es: "+ataque);
    }

    public void recibirDaño(int anio){
        vida=vida-anio;
    }



}
