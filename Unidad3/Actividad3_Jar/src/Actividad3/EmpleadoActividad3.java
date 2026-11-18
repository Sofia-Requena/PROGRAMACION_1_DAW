package Actividad3;
public class EmpleadoActividad3 {
    /*Atributos */

    private String Legajo; /*Que es legajo? */
    private String DNI;
    private String Telefonos;
    private String Nombre;
    private String Domicilio;


    /*Constructores */
    public EmpleadoActividad3() {}
    
    public EmpleadoActividad3(String legajo, String dNI, String telefonos, String nombre, String domicilio) {
        Legajo = legajo;
        DNI = dNI;
        Telefonos = telefonos;
        Nombre = nombre;
        Domicilio = domicilio;
    }

    public EmpleadoActividad3(EmpleadoActividad3 copiaEmpleadoActividad3) {
        this.Legajo = copiaEmpleadoActividad3.getLegajo();
        this.DNI = copiaEmpleadoActividad3.getDNI();
        this.Telefonos = copiaEmpleadoActividad3.getTelefonos();
        this.Nombre = copiaEmpleadoActividad3.getNombre();
        this.Domicilio = copiaEmpleadoActividad3.getDomicilio();
    }

    /*Metodos */
    public String getLegajo() {
        return Legajo;
    }
    public void setLegajo(String legajo) {
        Legajo = legajo;
    }


    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }


    public String getTelefonos() {
        return Telefonos;
    }
    public void setTelefonos(String telefonos) {
        Telefonos = telefonos;
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    
    public String getDomicilio() {
        return Domicilio;
    }
    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }


    /*Mensajes para imprimir */
    public void imprimirEmpleadoAct3(){
        System.out.println("El legajo del Empleado es: "+Legajo);
        System.out.println("El DNI del Empleado es: "+DNI);
        System.out.println("Los telefonos que hay del empleado son: "+Telefonos);
        System.out.println("El nombre del Empleado es: "+Nombre);
        System.out.println("La Calle, Numero y Ciudad donde vive el Empleado es: "+Domicilio);
        System.out.println("");
    }

}