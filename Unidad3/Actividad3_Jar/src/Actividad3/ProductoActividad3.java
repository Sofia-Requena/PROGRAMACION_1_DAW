package Actividad3;
public class ProductoActividad3 {
        /*Atributos */

    private int Codigo;
    private String Descripcion;
    private String Color;
    private String Costo;
    

    /*Constructores */
    public ProductoActividad3() {}
    
    public ProductoActividad3(int codigo, String descripcion, String color, String costo) {
        this.Codigo = codigo;
        this.Descripcion = descripcion;
        this.Color = color;
        this.Costo = costo;
    }

    public ProductoActividad3(ProductoActividad3 copiaProductoActividad3) {
        this.Codigo = copiaProductoActividad3.getCodigo();
        this.Descripcion = copiaProductoActividad3.getDescripcion();
        this.Color = copiaProductoActividad3.getColor();
        this.Costo = copiaProductoActividad3.getCosto();
    }

    /*Metodos */
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public String getCosto() {
        return Costo;
    }
    public void setCosto(String costo) {
        Costo = costo;
    }

    
    /*Mensajes para imprimir */
    public void imprimirProductoAct3(){
        System.out.println("El codigo del producto es: "+Codigo);
        System.out.println("La descripcion del producto es: "+Descripcion);
        System.out.println("El color del producto es: "+Color);
        System.out.println("El precio del producto es: "+Costo);
        System.out.println("");
    }
}
