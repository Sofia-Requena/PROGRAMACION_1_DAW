package Actividades.Actividad4;

public class Pieza {
    /*Atributos */
    private String nombre;
    private String color;
    private double precio;
    private Categoria categoria;


    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public Pieza() {}


    public Pieza(String nombre, String color, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Pieza(Pieza copiaPieza) {
        this.nombre = copiaPieza.getNombre();
        this.color = copiaPieza.getColor();
        this.precio = copiaPieza.getPrecio();
    }

    

    /*Metodos */
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

        /*Mensajes para imprimir */
    public void imprimePieza(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La pieza es de color: "+color);
        System.out.println("El precio es: "+precio);
        System.out.println("El codigo de categoria es: "+categoria.getCodigo());
        System.out.println("");
    }

    /*MAIN */
    public static void main(String[] args) {
        
    }
}
