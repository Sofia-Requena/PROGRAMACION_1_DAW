package Practicas.Practica1;


public class Editorial {
    /*Atributos */
    private int codigo;
    private String nombre;
    private int anio;

    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public Editorial() {
    }

    public Editorial(int codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public Editorial(Editorial copiaEditorial) {
        this.codigo = copiaEditorial.getCodigo();
        this.nombre = copiaEditorial.getNombre();
        this.anio = copiaEditorial.getAnio();
    }


    /*Metodos*/
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

        /*Mensajes para imprimir */
    public void imprimeEditorial(){
        System.out.println("El codigo es: "+codigo);
        System.out.println("El nombre de la editorial es: "+nombre);
        System.out.println("El año de la editorial es: "+anio);
        System.out.println("");
    }


}
