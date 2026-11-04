package Actividades.Actividad1;

public class CuentaCorriente {
    /*Atributos */

    private Persona5 persona;
    private int numero_cuenta;
    private double saldo;
    
    /*Constructor */ /*Sin parametros; Por parametros; Por copia */
    public CuentaCorriente() {
    }

    public CuentaCorriente(int numero_cuenta, double saldo, Persona5 persona) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.persona=persona;
    }

    public CuentaCorriente(CuentaCorriente copiaCuentaCorriente) {
        this.persona = copiaCuentaCorriente.getPersona();
        this.numero_cuenta = copiaCuentaCorriente.getNumero_cuenta();
        this.saldo = copiaCuentaCorriente.getSaldo();
    }

    
    /*Metodos*/

    public Persona5 getPersona() {
        return persona;
    }

    public void setPersona(Persona5 persona) {
        this.persona = persona;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*Mensajes para imprimir */
    /*Cuando queramos imprimir algo de una clase distinta a la que estamos trabajando, una vez enlazada o conectada a la clase que 
    estamos trabajando, para poder imprimirlo y que se vea con los valores que guardemos, tenemos que poner el nombre del atributo que le 
    hemos puesto y despues llamarla con .getCodigo() (por ejemplo) y en caso de que queramos darle ya un valor pues seria con .setCodigo() */
    public void imprimeCuentaCorriente(){
        System.out.println("Tu numero de cuenta es: "+numero_cuenta);
        System.out.println("Tu saldo es: "+saldo);
        System.out.println("La persona es: "+persona.getNombre());
        System.out.println("");
    }

    /*MAIN */




}
