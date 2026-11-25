package Actividad3;
public class TrabajaActividad3 {
    /*Atributos */

    private String Dia;
    private String Horario;
    private EmpleadoActividad3 Empleado;
    private SucursalActividad3 Sucursal;

    /*Constructores */
    public TrabajaActividad3() {}

    public TrabajaActividad3(String dia, String horario, EmpleadoActividad3 empleado, SucursalActividad3 sucursal) {
        this.Dia = dia;
        this.Horario = horario;
        this.Empleado = empleado;
        this.Sucursal = sucursal;
    }

    public TrabajaActividad3(TrabajaActividad3 copiaTrabajaActividad3) {
        this.Dia = copiaTrabajaActividad3.getDia();
        this.Horario = copiaTrabajaActividad3.getHorario();
        this.Empleado = copiaTrabajaActividad3.getEmpleado();
        this.Sucursal = copiaTrabajaActividad3.getSucursal();
    }

    /*Metodos */
    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public EmpleadoActividad3 getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(EmpleadoActividad3 empleado) {
        Empleado = empleado;
    }

    public SucursalActividad3 getSucursal() {
        return Sucursal;
    }

    public void setSucursal(SucursalActividad3 sucursal) {
        Sucursal = sucursal;
    }

        /*Mensajes para imprimir */
    public void imprimirTrabajaAct3(){
        System.out.println("El dia que trabaja el empleado es: "+Dia);
        System.out.println("El Horario de trabajo del Empleado es: "+Horario);
        System.out.println("El DNI del Empleado es: "+Empleado.getDNI()+", y el nombre del empleado: "+Empleado.getNombre());
        System.out.println("El Numero que identifica la Sucursal es: "+Sucursal.getNumero()+", la sucursal se encuentra en la Ciudad: "+Sucursal.getCiudad());
        System.out.println("");
    }

    

}