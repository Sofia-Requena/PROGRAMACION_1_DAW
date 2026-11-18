package RelacionEjerciciosUnidad3.RelacionActividad6;

public class Carta {
    /*Atributos */
    private int valor = 0;
    private String palo=" ";




    /*Constructores*/
    public Carta(){}

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Carta(Carta copiaCarta){
        this.valor = copiaCarta.getValor();
        this.palo = copiaCarta.getPalo();
    }

    /*Metodos */
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }

    /*Mensajes para imprimir*/

    public void imprimeCarta(){
        if (valor == 0) {
            System.out.println("El palo de la carta es: "+palo);
        }

        if (palo == null) {
            System.out.println("El valor de la carta es: "+valor);
        }
        
        if ((valor>0 && valor<12) && (palo!=null)) {
            System.out.println("El valor de la carta es: "+valor);
            System.out.println("El palo de la carta es: "+palo);
        }

    }

}
