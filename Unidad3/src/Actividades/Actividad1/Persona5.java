package Actividades.Actividad1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum estadoCivil{
    SOLTERO, CASADO, DIVORCIADO
}


public class Persona5 {
    /*Atributos */
    private String nombre;
    private String DNI;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String genero;
    private estadoCivil estado_civil;

    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public Persona5(){
    }

    public Persona5( String nombre, String DNI, String fecha, String direccion, String genero){
        /*Para poner la fecha de nacimiento */
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.nombre=nombre;
        this.DNI=DNI;
        this.fechaNacimiento=LocalDate.parse(fecha,fmt);
        this.direccion=direccion;
        this.genero=genero;
        // this.estado_civil=estadoCivil.SOLTERO;
        
    }

    public Persona5(Persona5 copiaPersona5){
        this.nombre = copiaPersona5.getNombre();
        this.DNI = copiaPersona5.getDNI();
        this.fechaNacimiento = copiaPersona5.getFechaNacimiento();
        this.direccion = copiaPersona5.getDireccion();
        this.genero = copiaPersona5.getGenero();
        this.estado_civil = copiaPersona5.getEstado_civil();
    }


    /*Metodos*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public estadoCivil getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(estadoCivil estado_civil) {
        this.estado_civil = estado_civil;
    }

    /*Mensajes para imprimir */
    public void imprimePersona(){
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu DNI es: "+DNI);
        System.out.println("La fecha es: "+fechaNacimiento);
        System.out.println("Tu calle es: "+direccion);
        System.out.println("Eres: "+genero);
        System.out.println("");
        
    }

/*MAIN */
    public static void main(String[] args) {
    }



}
