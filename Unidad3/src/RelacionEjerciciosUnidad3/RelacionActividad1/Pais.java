package RelacionEjerciciosUnidad3.RelacionActividad1;

import Actividades.Actividad1.CuentaCorriente;

public class Pais {
    /*Atributos*/
    private String nombre;
    private int poblacion;
    private int PIB;


    
    /*Constructores*/
    public Pais() {
        this.nombre="Italia";
    }

    public Pais(String nombre, int poblacion, int pIB) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        PIB = pIB;
    }
    
    public Pais(Pais copiaPais) {
        this.nombre = copiaPais.getNombre();
        this.poblacion = copiaPais.getPoblacion();
        this.PIB = copiaPais.getPIB();
    }


    /*Metodos*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getPIB() {
        return PIB;
    }
    public void setPIB(int pIB) {
        PIB = pIB;
    }

    /*Mensajes para imprimir*/
    public void imprimePIB_Percapita(){
        System.out.println("El nombre del pais es: "+nombre);
        System.out.println("La poblacion que tiene el pais: "+poblacion);
        System.out.println("El PIB del Pais sin calcular: "+PIB);
        System.out.println("El PIB del Pais calculado: "+((PIB*100000)/poblacion));
        System.out.println("");
    }

    /*Mensaje para imprimir del constructor sin parametros */
    public void constructorSinParametros(){
        System.out.println("El nombre del pais es: "+nombre);
        System.out.println("");
    }


}
