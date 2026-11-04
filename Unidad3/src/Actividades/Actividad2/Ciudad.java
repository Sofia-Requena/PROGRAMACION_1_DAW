package Actividades.Actividad2;

public class Ciudad {
    /*Atributos */
    private int codigo;
    private String nombre;
    private int indicativo;

    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public Ciudad(){}

    public Ciudad(int codigo, String nombre, int indicativo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.indicativo=indicativo;
    }

    public Ciudad(Ciudad copiaCiudad){
        this.codigo = copiaCiudad.getCodigo();
        this.nombre = copiaCiudad.getNombre();
        this.indicativo = copiaCiudad.getIndicativo();
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

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    /*Mensajes para imprimir */
    public void imprimeCiudad(){
        System.out.println("Tu codigo es: "+codigo);
        System.out.println("Tu ciudad es: "+nombre);
        System.out.println("El indicativo es: "+indicativo);
        System.out.println("");
    }


/*MAIN */
    public static void main(String[] args) {
        

    }

}
