package Practicas.Practica1;

public class Libro {
    /*Atributos */
    private String isbn;
    private String titulo;
    private int anio;
    private int precio;
    private Editorial editorial;

    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public Libro() {
    }

    public Libro(String isbn, String titulo, int anio, int precio, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.precio = precio;
        this.editorial = editorial;
    }

    public Libro(Libro copiaLibro) {
        this.isbn = copiaLibro.getIsbn();
        this.titulo = copiaLibro.getTitulo();
        this.anio = copiaLibro.getAnio();
        this.precio = copiaLibro.getPrecio();
        this.editorial = copiaLibro.getEditorial();

    }

    /*Metodos*/
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    /*Mensajes para imprimir */
    public void imprimeLibro(){
        System.out.println("El ISBN del libro es: "+isbn);
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El año del libro es: "+anio);
        System.out.println("El precio del libro es: "+precio);
        System.out.println("El nombre de la editorial es: "+editorial.getNombre());
        System.out.println("");
    }

    /*String isbn, String titulo, int anio, int precio, Editorial editorial */

}
