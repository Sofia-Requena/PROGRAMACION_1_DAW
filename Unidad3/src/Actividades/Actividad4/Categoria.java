package Actividades.Actividad4;

public class Categoria {
    /*Atributos */

    private int codigo;
    private String nombre;

    
    /*Constructor */

    public Categoria() {}


    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Categoria(Categoria copiaCategoria) {
        this.codigo = copiaCategoria.getCodigo();
        this.nombre = copiaCategoria.getNombre();
    }



    /*Metodos */
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

    /*Mensajes para imprimir */
    public void imprimeCategoria(){
        System.out.println("El codigo es: "+codigo);
        System.out.println("El nombre de la categoria es: "+nombre);
        System.out.println("");
    }


    /*MAIN*/
    public static void main(String[] args) {
        
    }
}
