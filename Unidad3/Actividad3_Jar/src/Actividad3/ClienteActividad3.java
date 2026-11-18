package Actividad3;
public class ClienteActividad3 {
    /*Atributos */

    private int Codigo;
    private String Fecha_nacimiento;
    private String DNI;
    private String Nombre;
    private String Ciudad;
    private SucursalActividad3 Sucursal;

    /*Constructores */
    public ClienteActividad3() {}

    public ClienteActividad3(int codigo, String fecha_nacimiento, String dNI, String nombre, String ciudad,SucursalActividad3 sucursal) {
        Codigo = codigo;
        Fecha_nacimiento = fecha_nacimiento;
        DNI = dNI;
        Nombre = nombre;
        Ciudad = ciudad;
        Sucursal = sucursal;
    }

    public ClienteActividad3(ClienteActividad3 copiaClienteActividad3) {
        this.Codigo = copiaClienteActividad3.getCodigo();
        this.Fecha_nacimiento = copiaClienteActividad3.getFecha_nacimiento();
        this.DNI = copiaClienteActividad3.getDNI();
        this.Nombre = copiaClienteActividad3.getNombre();
        this.Ciudad = copiaClienteActividad3.getCiudad();
        this.Sucursal = copiaClienteActividad3.getSucursal();
    }

    /*Metodos */
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public SucursalActividad3 getSucursal() {
        return Sucursal;
    }
    public void setSucursal(SucursalActividad3 sucursal) {
        Sucursal = sucursal;
    }


    /*Mensajes para imprimir */
    public void imprimirClienteAct3(){
        System.out.println("El codigo que tiene el cliente es: "+Codigo);
        System.out.println("La fecha de nacimiento del cliente es: "+Fecha_nacimiento);
        System.out.println("El DNI del cliente es: "+DNI);
        System.out.println("El nombre del cliente es: "+Nombre);
        System.out.println("La ciudad donde vive el cliente es: "+Ciudad);
        System.out.println("En la ciudad donde se encutra la sucursal es en: "+Sucursal.getCiudad());
        System.out.println("");

    }

}
