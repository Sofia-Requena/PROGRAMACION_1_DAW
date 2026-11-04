package Actividades.Actividad4;

public class Pertenece {
    /* Atributos */
    private Categoria categoria;
    private Pieza pieza2;

    /* Constructor */ /* Sin parametros; Por parametros; Por copia */
    public Pertenece() {
    }
    
    public Pertenece(Categoria categoria, Pieza pieza2) {
        this.categoria = categoria;
        this.pieza2 = pieza2;
    }

    public Pertenece(Pertenece copiaPertenece){
        this.categoria = copiaPertenece.getCategoria();
        this.pieza2 = copiaPertenece.getPieza2();
    }


    /* Metodos */
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Pieza getPieza2() {
        return pieza2;
    }

    public void setPieza2(Pieza pieza2) {
        this.pieza2 = pieza2;
    }

    /*Mensajes para imprimir */
    public void imprimePertenece(){
        System.out.println("El codigo de categoria es: "+categoria.getCodigo());
        System.out.println("El nombre de la pieza es: "+pieza2.getNombre());
        System.out.println("");
    }
/*Categoria categoria, Pieza pieza2*/

//No borrar llave
}
