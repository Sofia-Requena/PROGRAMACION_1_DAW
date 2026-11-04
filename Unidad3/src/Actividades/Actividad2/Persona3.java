package Actividades.Actividad2;

public class Persona3 {
    /* Atributos */
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero; //No me funciona cuando meto los datos en el constructor por parametros, cuando es char
    private Fecha fecha_nacimiento;
    private Ciudad ciudad_nacimiento;
    private Ciudad ciudad_residencia;

    /* Constructor */ /* Sin parametros; Por parametros; Por copia */
    public Persona3() {
    }

    public Persona3(String cedula, String nombre, String apellido, String genero, Fecha fecha_nacimiento, Ciudad ciudad_nacimiento, Ciudad ciudad_residencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.ciudad_nacimiento = ciudad_nacimiento;
        this.ciudad_residencia = ciudad_residencia;
    }

    public Persona3(Persona3 copiaPersona3) {
        this.cedula = copiaPersona3.getCedula();
        this.nombre = copiaPersona3.getNombre();
        this.apellido = copiaPersona3.getApellido();
        this.genero = copiaPersona3.getGenero();
    }

    /* Metodos */
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Ciudad getCiudad_nacimiento() {
        return ciudad_nacimiento;
    }

    public void setCiudad_nacimiento(Ciudad ciudad_nacimiento) {
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    public Ciudad getCiudad_residencia() {
        return ciudad_residencia;
    }

    public void setCiudad_residencia(Ciudad ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }

    /*Mensajes para imprimir */
    public void imprimePersona3(){
        System.out.println("Tu cedula: "+cedula);
        System.out.println("Tu Nombre es: "+nombre);
        System.out.println("Tu apellido es: "+apellido);
        System.out.println("Eres: "+genero);
        System.out.println("La fecha de nacimiento es: "+fecha_nacimiento.getDia()+"/"+fecha_nacimiento.getMes()+"/"+fecha_nacimiento.getAnio());
        System.out.println("Tu ciudad de nacimiento es: "+ciudad_nacimiento.getNombre());
        System.out.println("Tu ciudad de residencia es: "+ciudad_residencia.getNombre());
        System.out.println("");
    }

    /* MAIN */
    public static void main(String[] args) {
    }

}
