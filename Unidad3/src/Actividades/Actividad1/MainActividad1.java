package Actividades.Actividad1;

public class MainActividad1 {
/*Actividad: Crea las clase CuentaCorriente que tiene como atributos 
una Persona (nombre, DNI, fechaNacimiento, dirección, género, estado civil), 
el número de cuenta y su saldo. En ambas clases crea sus correspondientes constructores 
y funciones necesarias para mostrar información y modificar los valores de atributos. 
Haz uso de ambas clases en otro fichero que tendrá el main.  */

/*Esta actividad se encuentra en la pagina 17. Esta actividad habia que hacer los atributos, los constructores, los metodos 
de cada uno de las distintas clases. Y despues se unian en este MAIN */

    public static void main(String[] args) {
        /*Llamar ambos objetos y enlazarlos */
        Persona5 sofia = new Persona5("Sofia", "12345678S", "28/10/2026", "C/ Direccion", "Mujer","Soltera");
        sofia.imprimePersona();

        /*Como puedo hacer para que me salga el nombre en cuenta corriente que he creado en persona5?: Hay que crear esa persona (en este caso) 
        ya sea por constructor por parametros o mediante persona.setNombre("Sofia"); y despues le damos a imprimir dependiendo de lo que queramos pues se muestra
        una cosa u otra.*/
        CuentaCorriente cuentaPersona = new CuentaCorriente( 1234567891, 1000000.50, sofia);
        cuentaPersona.imprimeCuentaCorriente();

    }
}
