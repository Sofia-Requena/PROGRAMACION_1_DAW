package Actividades.Actividad4;

public class Proveedor {
    /*Atributos */
    private int codigo;
    private String direccion;
    private String ciudad;
    private String provincia;


    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public Proveedor() {}


    public Proveedor(int codigo, String direccion, String ciudad, String provincia) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public Proveedor(Proveedor copiaProveedor) {
        this.codigo = copiaProveedor.getCodigo();
        this.direccion = copiaProveedor.getDireccion();
        this.ciudad = copiaProveedor.getCiudad();
        this.provincia = copiaProveedor.getProvincia();
    }

    

    /*Metodos */
    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getProvincia() {
        return provincia;
    }


    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /*Mensajes para imprimir */
    public void imprimeProveedor(){
        System.out.println("El codigo es: "+codigo);
        System.out.println("La direccion es: "+direccion);
        System.out.println("La ciudad es: "+ciudad);
        System.out.println("La provincia es: "+provincia);
        System.out.println("");
    }

    /*MAIN */
    public static void main(String[] args) {
        
    }


}
