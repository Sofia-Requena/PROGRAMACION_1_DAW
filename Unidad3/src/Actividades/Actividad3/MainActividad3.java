package Actividades.Actividad3;

import Actividades.Actividad3.Persona4;
import Actividades.Actividad3.Vehiculo;

public class MainActividad3 {
public static void main(String[] args) {

        Vehiculo mercedes = new Vehiculo("Mercedes", "referencia", 2 ,"0000 DNS","Negro", 10000);
        mercedes.imprimeVehiculo();

        Persona4 persona4 = new Persona4("12345678S", "sofia", "requena gonzalez", "29/06/2008", "Mujer", mercedes);
        persona4.imprimePersona4();
}

//No borrar llave
}
