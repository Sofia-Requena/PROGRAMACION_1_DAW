package Actividades.Actividad2;

public class Fecha {
    /*Atributos */
    private int dia;
    private int mes;
    private int anio;

    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public Fecha(){}

    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public Fecha(Fecha copiaFecha){
        this.dia = copiaFecha.getDia();
        this.mes = copiaFecha.getMes();
        this.anio = copiaFecha.getAnio();
    }


    /*Metodos*/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

        /*Mensajes para imprimir */
    public void imprimeFecha(){
        System.out.println("Estamos a dia: "+dia);
        System.out.println("Del Mes: "+mes);
        System.out.println("Del año: "+anio);
        System.out.println("");
    }

/*MAIN */
    public static void main(String[] args) {  
    }

    
}
