package Actividad3;
public class SucursalActividad3 {
        /*Atributos */

    private int Numero;
    private String Domicilio;
    private String Ciudad;


    /*Constructores */
    public SucursalActividad3() {}

    public SucursalActividad3(int numero, String domicilio, String ciudad) {
        this.Numero = numero;
        this.Domicilio = domicilio;
        this.Ciudad = ciudad;
    }

    public SucursalActividad3(SucursalActividad3 copiaSucursalActividad3) {
        this.Numero = copiaSucursalActividad3.getNumero();
        this.Domicilio = copiaSucursalActividad3.getDomicilio();
        this.Ciudad = copiaSucursalActividad3.getCiudad();
    }
    

    /*Metodos */
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }


    public String getDomicilio() {
        return Domicilio;
    }
    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }


    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    /*Mensajes para imprimir */
    public void imprimirSucursalAct3(){
        System.out.println("El numero de la sucursal es: "+Numero);
        System.out.println("La ciudad donde se encuentra la sucursal es: "+Ciudad);
        System.out.println("El domicilio es: "+Domicilio);
        System.out.println("");

    }
}
