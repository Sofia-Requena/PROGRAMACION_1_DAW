package Actividad3;
public class VendeActividad3 {
    /*Atributos */

    private int PrecioVenta;
    private SucursalActividad3 Sucursal;
    private ProductoActividad3 Producto;



    /*Constructores */
    public VendeActividad3() {}

    public VendeActividad3(int precioVenta, SucursalActividad3 sucursal, ProductoActividad3 producto) {
        PrecioVenta = precioVenta;
        Sucursal = sucursal;
        Producto = producto;
    }

    public VendeActividad3(VendeActividad3 copiaVendeActividad3) {
        this.PrecioVenta = copiaVendeActividad3.getPrecioVenta();
        this.Sucursal = copiaVendeActividad3.getSucursal();
        this.Producto = copiaVendeActividad3.getProducto();
    }

    /*Metodos */
    public int getPrecioVenta() {
        return PrecioVenta;
    }
    public void setPrecioVenta(int precioVenta) {
        PrecioVenta = precioVenta;
    }
    public SucursalActividad3 getSucursal() {
        return Sucursal;
    }
    public void setSucursal(SucursalActividad3 sucursal) {
        Sucursal = sucursal;
    }
    public ProductoActividad3 getProducto() {
        return Producto;
    }
    public void setProducto(ProductoActividad3 producto) {
        Producto = producto;
    }

    public void imprimirVendeAct3(){
        System.out.println("El precio de venta del producto a al sucursal es: "+PrecioVenta+" euros");
        System.out.println("El codigo del Producto es: "+Producto.getCodigo());
        System.out.println("El numero de la Sucursal es: "+Sucursal.getNumero());
        System.out.println("");
    }


    /*Mensajes para imprimir */
}
