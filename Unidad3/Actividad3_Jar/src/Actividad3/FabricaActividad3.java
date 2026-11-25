package Actividad3;
public class FabricaActividad3 {
    /*Atributos */

    private int CUIT;
    private String Pais;
    private String Gerente;
    private String Nombre;
    private int Cantidad_empleados;
    private ProductoActividad3 Producto;

    /*Constructores */
    public FabricaActividad3() {}

    public FabricaActividad3(int cUIT, String pais, String gerente, String nombre, int cantidad_empleados, ProductoActividad3 producto) {
        this.CUIT = cUIT;
        this.Pais = pais;
        this.Gerente = gerente;
        this.Nombre = nombre;
        this.Cantidad_empleados = cantidad_empleados;
        this.Producto = producto;
    }

    public FabricaActividad3(FabricaActividad3 copFabricaActividad3){
        this.CUIT = copFabricaActividad3.getCUIT();
        this.Pais = copFabricaActividad3.getPais();
        this.Gerente = copFabricaActividad3.getGerente();
        this.Nombre = copFabricaActividad3.getNombre();
        this.Cantidad_empleados = copFabricaActividad3.getCantidad_empleados();
        this.Producto = copFabricaActividad3.getProducto();
    }

    /*Metodos */
    public int getCUIT() {
        return CUIT;
    }
    public void setCUIT(int cUIT) {
        CUIT = cUIT;
    }


    public String getPais() {
        return Pais;
    }
    public void setPais(String pais) {
        Pais = pais;
    }


    public String getGerente() {
        return Gerente;
    }
    public void setGerente(String gerente) {
        Gerente = gerente;
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public int getCantidad_empleados() {
        return Cantidad_empleados;
    }
    public void setCantidad_empleados(int cantidad_empleados) {
        Cantidad_empleados = cantidad_empleados;
    }

    public ProductoActividad3 getProducto() {
        return Producto;
    }

    public void setProducto(ProductoActividad3 producto) {
        Producto = producto;
    }


    /*Mensajes para imprimir */
    public void imprimirFabricaAct3(){
        System.out.println("El CUIT de la fabrica es: "+CUIT);
        System.out.println("El nombre de la fabirca es: "+Nombre);
        System.out.println("El pais donde se encuentra la fabrica es: "+Pais);
        System.out.println("El gerente que lleva la fabrica es: "+Gerente);
        System.out.println("La cantidad de empleados que estan trabajando en la fabrica es: "+Cantidad_empleados);
        System.out.println("El codigo del producto es: "+Producto.getCodigo()); /*Aqui llamamos al atributo Codigo de la clase Producto*/
        System.out.println("");
    }


}
