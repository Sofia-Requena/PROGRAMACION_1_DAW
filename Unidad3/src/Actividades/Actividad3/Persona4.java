package Actividades.Actividad3;

import Actividades.Actividad2.Fecha;

public class Persona4 {
    /*Atributos */
    private String docId;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String genero;
    private Vehiculo vehiculo;

    /*Constructor */ /*Sin parametros; Por parametros; Por copia */

    public Persona4() {}

    public Persona4(String docId, String nombre, String apellido, String fechaNac, String genero, Vehiculo vehiculo) {
            this.docId = docId;
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNac = fechaNac;
            this.genero = genero;
            this.vehiculo = vehiculo;
        }
        
    public Persona4(Persona4 copiaPersona4) {
            this.docId = copiaPersona4.getDocId();
            this.nombre = copiaPersona4.getNombre();
            this.apellido = copiaPersona4.getApellido() ;
            this.fechaNac = copiaPersona4.getFechaNac();
            this.genero = copiaPersona4.getGenero();
            this.vehiculo = copiaPersona4.getVehiculo();
        }


    /*Metodos */
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


        /*Mensajes para imprimir */
    public void imprimePersona4(){
        System.out.println("Tu documento de Identificacion: "+docId);
        System.out.println("Tu Nombre es: "+nombre);
        System.out.println("Tu apellido es: "+apellido);
        System.out.println("La fecha nacimiento es: "+fechaNac);
        System.out.println("Eres: "+genero);
        System.out.println("Tu marca de coche es: "+vehiculo.getMarca());
        System.out.println("");
    }

    /*MAIN */
    public static void main(String[] args) {
    }



}
