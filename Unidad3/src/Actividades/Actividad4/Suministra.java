package Actividades.Actividad4;

import Actividades.Actividad2.Ciudad;

public class Suministra {
    /* Atributos */
    private int cantidad;
    private String fecha;
    private Proveedor proveedor;
    private Pieza pieza;

    /* Constructor */ /* Sin parametros; Por parametros; Por copia */
    public Suministra() {
    }
    
    public Suministra(int cantidad, String fecha, Proveedor proveedor, Pieza pieza) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.pieza = pieza;
    }

    public Suministra(Suministra copiaSuministra){
        this.cantidad = copiaSuministra.getCantidad();
        this.fecha = copiaSuministra.getFecha();
        this.proveedor = copiaSuministra.getProveedor();
        this.pieza = copiaSuministra.getPieza();
    }

    
    /* Metodos */

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    /*Mensajes para imprimir */
    public void imprimeSuministra(){
        System.out.println("La cantidad de suministro a sido de: "+cantidad);
        System.out.println("La fecha en la que ha sido sumistrado es: "+fecha);
        System.out.println("El codigo del proveedor es: "+proveedor.getCodigo());
        System.out.println("El nombre de la pieza es: "+pieza.getNombre());
        System.out.println("");
    }



//No borrar llave
}
