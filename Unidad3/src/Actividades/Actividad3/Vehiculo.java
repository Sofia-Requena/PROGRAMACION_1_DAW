package Actividades.Actividad3;

public class Vehiculo {
    /*Atributos */
    private String marca;
    private String referencia;
    private int modelo;
    private String placa;
    private String color;
    private int valor;


    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public Vehiculo() {}

    public Vehiculo(String marca, String referencia, int modelo, String placa, String color, int valor) {
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.valor = valor;
    }

    public Vehiculo(Vehiculo copiaVehiculo) {
        this.marca = copiaVehiculo.getMarca();
        this.referencia = copiaVehiculo.getReferencia();
        this.modelo = copiaVehiculo.getModelo();
        this.placa = copiaVehiculo.getPlaca();
        this.color = copiaVehiculo.getColor();
        this.valor = copiaVehiculo.getValor();
    }


    /*Metodos */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    /*Mensajes para imprimir */
    public void imprimeVehiculo(){
        System.out.println("Tu marca es: "+marca);
        System.out.println("La referencia es: "+referencia);
        System.out.println("Tu modelo es: "+modelo);
        System.out.println("Tu placa es: "+placa);
        System.out.println("Tu coche es de color: "+color);
        System.out.println("El valor es: "+valor);
        System.out.println("");
    }


    /*MAIN */
    public static void main(String[] args) {
        
    }


}
