package RelacionEjerciciosUnidad3.RelacionActividad1;

public class MainRelacionEjercicio1 {
/*Crea una clase llamada País que tenga los parámetros (nombre, población, PIB), con los 
constructores, los correspondientes getter y setters y un método que devuelva el PIB per cápita, 
calculado como el PIB*100000 dividido por la población. En main haz uso de estas funciones. */
    public static void main(String[] args) {
        /*Aqui lo primero que hacemos es crear un objeto que lo he llamado españa (sin ñ para evitar errores) 
        he cogido el constructor por parametros, y despues he imprimido esos datos*/
        Pais espana = new Pais("España", 10, 2);
        espana.imprimePIB_Percapita();

        /*Aqui he creado el objeto de pais llamado italia y le he asignado el constructor sin parametros*/
        Pais italia = new Pais();
        italia.constructorSinParametros();
    }
}
