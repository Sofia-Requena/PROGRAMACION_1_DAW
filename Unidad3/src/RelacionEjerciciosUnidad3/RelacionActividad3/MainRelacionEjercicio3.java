package RelacionEjerciciosUnidad3.RelacionActividad3;

import Actividad3.ClienteActividad3;
import Actividad3.EmpleadoActividad3;
import Actividad3.FabricaActividad3;
import Actividad3.ProductoActividad3;
import Actividad3.SucursalActividad3;
import Actividad3.TarjetaActividad3;
import Actividad3.TrabajaActividad3;
import Actividad3.VendeActividad3;
import Actividades.Actividad2.Fecha;

public class MainRelacionEjercicio3 {
/*Crea el proyecto que tenga las clases equivalentes a las entidades del diagrama E-R, estas clases 
estarán completas con sus métodos y un método que imprime sus valores. De este proyecto 
generarás el package jar para incluirlo en un nuevo proyecto. Este proyecto va a incluir las clases 
que salen de las relaciones N:N y el fichero Prueba.java en cuyo main harás uso de las funciones 
creadas. 
 */

    public static void main(String[] args) {
        /*Aqui creamos distintos objetos e imprimimos sus datos*/
        SucursalActividad3 sucursalAlmeria = new SucursalActividad3(10, "Calle Almeria", "Almeria");
        // sucursalAlmeria.imprimirSucursalAct3();

        ClienteActividad3 cliente = new ClienteActividad3(1234,"29/06/2008","12345678D","Sofía","Almeria",sucursalAlmeria);
        // cliente.imprimirClienteAct3();

        TarjetaActividad3 tarjeta = new TarjetaActividad3(131456, 22122026, "Black Card", "07/01/2027", cliente);
        // tarjeta.imprimirTarjetaAct3();

        /*En el domicilio  se escribe primero la Calle, Numero y Ciudad*/
        EmpleadoActividad3 empleado = new EmpleadoActividad3("Legajo", "00011122E", "telfono fijo: 985674130, Telefono: 098567413", "Pepe", "Calle, 21, Almeria");
        // empleado.imprimirEmpleadoAct3();

        TrabajaActividad3 trabaja = new TrabajaActividad3("31", "8:00-14:30", empleado, sucursalAlmeria);
        // trabaja.imprimirTrabajaAct3();
        
        ProductoActividad3 producto = new ProductoActividad3(4567, "Este producto es unico e inigualable", "Negro", "12 euros");
        // producto.imprimirProductoAct3();

        VendeActividad3 vende = new VendeActividad3(14, sucursalAlmeria, producto);
        // vende.imprimirVendeAct3();

        FabricaActividad3 fabrica = new FabricaActividad3(34, "España", "Sofia", "Fabrica SYRA", 100000, producto);
        // fabrica.imprimirFabricaAct3();
    }
}
