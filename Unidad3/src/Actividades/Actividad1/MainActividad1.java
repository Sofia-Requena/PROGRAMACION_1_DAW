package Actividades.Actividad1;

public class MainActividad1 {
    public static void main(String[] args) {
        /*Llamar ambos objetos y enlazarlos */
        Persona5 sofia = new Persona5("Sofia", "12345678S", "28/10/2026", "C/ Direccion", "Mujer");
        // sofia.imprimePersona();

        /*Como puedo hacer para que me salga el nombre en cuenta corriente que he creado en persona5?: Hay que crear esa persona (en este caso) 
        ya sea por constructor por parametros o mediante persona.setNombre("Sofia"); y despues le damos a imprimir dependiendo de lo que queramos pues se muestra
        una cosa u otra.*/
        CuentaCorriente cuentaPersona = new CuentaCorriente( 1234567891, 1000000.50, sofia);
        cuentaPersona.imprimeCuentaCorriente();

    }
}
