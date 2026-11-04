package Actividades.Actividad2;
import Actividades.Actividad2.Ciudad;
import Actividades.Actividad2.Fecha;
import Actividades.Actividad2.Persona3;

public class MainActividad2 {
public static void main(String[] args) {
        /*Llamar ambos objetos y enlazarlos */
        Fecha fecha = new Fecha(29, 6, 2008);
        fecha.imprimeFecha();

        /*Como puedo hacer para que me salga el nombre en cuenta corriente que he creado en persona5?: Hay que crear esa persona (en este caso) 
        ya sea por constructor por parametros o mediante persona.setNombre("Sofia"); y despues le damos a imprimir dependiendo de lo que queramos pues se muestra
        una cosa u otra.*/
        Ciudad ciudad1 = new Ciudad(1, "Almeria", 00012);
        ciudad1.imprimeCiudad();

        Ciudad ciudad2 = new Ciudad(1, "Salamanca", 00012);
        ciudad1.imprimeCiudad();

        Persona3 persona3 = new Persona3("12345678S", "Sofia", "Requena Gonzalez", "F", fecha, ciudad1, ciudad2);
        persona3.imprimePersona3();
}

}
