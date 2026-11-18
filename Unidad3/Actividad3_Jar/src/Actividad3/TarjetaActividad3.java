package Actividad3;
public class TarjetaActividad3 {
    /*Atributos */

    private int Numero;
    private int Codigo;
    private String Nombre;
    private String Fecha_Vencida;
    private ClienteActividad3 Cliente;


    /*Constructores */
    public TarjetaActividad3() {}

    public TarjetaActividad3(int numero, int codigo, String nombre, String fecha_Vencida, ClienteActividad3 cliente) {
        Numero = numero;
        Codigo = codigo;
        Nombre = nombre;
        Fecha_Vencida = fecha_Vencida;
        Cliente = cliente;
    }

    public TarjetaActividad3(TarjetaActividad3 copiaTarjetaActividad3) {
        this.Numero = copiaTarjetaActividad3.getNumero();
        this.Codigo = copiaTarjetaActividad3.getCodigo();
        this.Nombre = copiaTarjetaActividad3.getNombre();
        this.Fecha_Vencida = copiaTarjetaActividad3.getFecha_Vencida();
        this.Cliente = copiaTarjetaActividad3.getCliente();
    }

    /*Metodos */
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }


    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getFecha_Vencida() {
        return Fecha_Vencida;
    }
    public void setFecha_Vencida(String fecha_Vencida) {
        Fecha_Vencida = fecha_Vencida;
    }


    public ClienteActividad3 getCliente() {
        return Cliente;
    }
    public void setCliente(ClienteActividad3 cliente) {
        Cliente = cliente;
    }

    /*Mensajes para imprimir */
    public void imprimirTarjetaAct3(){
        System.out.println("El numero de Tarjeta es: "+Numero);
        System.out.println("El codigo de tarjeta es: "+Codigo);
        System.out.println("El nombre de la tarjeta es: "+Nombre);
        System.out.println("La fecha de cuando se vence la tarjeta es: "+Fecha_Vencida);
        System.out.println("El nombre del cliente es: "+Cliente.getNombre()+" y el DNI es: "+Cliente.getDNI());
        System.out.println("");
    }

}
