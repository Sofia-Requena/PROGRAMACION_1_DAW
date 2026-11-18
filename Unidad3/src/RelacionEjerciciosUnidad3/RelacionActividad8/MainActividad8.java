package RelacionEjerciciosUnidad3.RelacionActividad8;

import java.io.File;
import java.util.Scanner;

public class MainActividad8 {
    /*Utilizando un fichero CSV que contiene datos de personas separados por ‘;’, vamos a crear 
    objetos Persona que extraigan la información del fichero. El fichero contiene por cada fila la 
    siguiente información: nombre;edad;teléfono;población
    Se pide crear la clase Persona completa y una clase en cuyo main se crea la persona vacía y que 
    vaya recibiendo los datos del fichero CSV y vaya mostrando los datos de la persona antes de pasar a 
    la siguiente línea. Puedes inventarte los valores de las personas pero al menos el fichero tiene que 
    tener dos líneas.*/
    public static void main(String[] args) {
        PersonaActividad8 persona = new PersonaActividad8();

        try{
            Scanner leer = new Scanner(new File("./src/RelacionEjerciciosUnidad3/RelacionActividad8/DatosPersonas.txt"));
            String linea;

            while(leer.hasNextLine()){
                linea=leer.nextLine();
                
                Scanner sc = new Scanner(linea);
                sc.useDelimiter("[;\\s\\n]+"); 
                String nombre1=sc.next();
                persona.setNombre(nombre1);
                int edad1=sc.nextInt();
                persona.setEdad(edad1);
                String numero_telefono1=sc.next();
                persona.setNumero_telefono(numero_telefono1);
                String poblacion1=sc.next();
                persona.setPoblacion(poblacion1);
                System.out.println(nombre1+"-"+edad1+"-"+numero_telefono1+"-"+poblacion1);
                persona.imprimirPersonaActividad8();
                System.out.println("");
            }
            leer.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

/*No borrar llave*/
}
