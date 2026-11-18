package RelacionEjerciciosUnidad3.RelacionActividad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class MainRelacionEjercicio4 {
/* Crea una aplicación que pida la ruta de dos ficheros de texto y de una ruta de destino (solo la ruta 
del directorio). Debes copiar el contenido de los dos ficheros en uno, además, este tendrá el nombre 
de los dos ficheros separados por un guion bajo y se guardará en la ruta de destino que le hayamos 
indicado. Por ejemplo, si tengo un fichero A.txt con «ABC» como contenido, un fichero B.txt con «DEF» y 
una ruta de destino D:\, el resultado sera un fichero llamado A_B.txt en la ruta D:\ con el contenido 
«ABCDEF».*/
    public static void main(String[] args) {
    Ejercicio4();
    }

    public static void Ejercicio4(){
        try {
        /*Aqui lo que hacemos primero es declarar las variables. Despues pedimos que introduzcan por teclado la ruta de 
        donde se encuentra el primer fichero, despues donde se encuentra la del segundo fichero y por ultimo pedimos la ruta de donde se va a 
        crear el fichero el cual contiene la informacion de los dos primeros ficheros*/

            String ruta;
            String ruta2;
            String rutaDestino;
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la ruta del primer fichero: ");/*./src/RelacionEjerciciosUnidad3/RelacionActividad4/A.txt */
            ruta = sc.nextLine();

            System.out.print("Introduce la ruta del segundo fichero: ");/*./src/RelacionEjerciciosUnidad3/RelacionActividad4/B.txt */
            ruta2 = sc.nextLine();

            System.out.print("Introduce la ruta de destino: ");/*./src/RelacionEjerciciosUnidad3/RelacionActividad4/*/
            rutaDestino = sc.nextLine();

            /*Aqui creamos el atributo fichero en el cual le indicamos a cada uno la ruta que se ha introducido por teclado, en el cual
            es donde se encuentra el fichero que de cada ruta*/
            File fichero = new File(ruta);
            File fichero2 = new File(ruta2);

            /*Aqui comprobamos si ambos fichero existen, en caso de que no salta un mensaje */
            
            if (!fichero.exists() || !fichero.isFile()) {
                System.out.println("El Primer fichero no existe");
                return; 
            }
            if (!fichero2.exists() || !fichero2.isFile()) {
                System.out.println("El Segundo fichero no existe");
                return;
            }

            File destino = new File(rutaDestino);
            if (!destino.exists() || !destino.isDirectory()) {
                System.out.println("La ruta de destino no es válida");
                return;
            }

            /*Aqui creamos dos variables para guardar el nombre de cada fichero, abajo lo que hacemos es crear dos variables
            para que cuando guardemos el nombre de cada variable, sea todo aquello que sea antes del .txt. Por lo que creamos otras
            variables en el cual aqui si se guardaran el nombre de cada fichero pero sin extension.*/
            String nombre = fichero.getName();
            String nombre2 = fichero2.getName();

            int posicionPunto = nombre.lastIndexOf('.');
            int posicionPunto2 = nombre2.lastIndexOf('.');

            String nombreSinExtension;
            String extension;

            String nombreSinExtension2;
            String extension2;

            /*Aqui comprobamos si el nombre de cada fichero tiene un punto. Si lo tiene, separamos el nombre de la extension
            y guardamos cada parte en una variable distinta. Si no tiene un punto, guardamos el nombre completo
            y dejamos la extension vacia.*/
            if (posicionPunto > 0) {
                nombreSinExtension = nombre.substring(0, posicionPunto);
                extension = nombre.substring(posicionPunto);
            } else {
                nombreSinExtension = nombre;
                extension = "";
            }

            if (posicionPunto2 > 0) {
                nombreSinExtension2 = nombre2.substring(0, posicionPunto2);
                extension2 = nombre2.substring(posicionPunto2);
            } else {
                nombreSinExtension2 = nombre2;
                extension2 = "";
            }
            
            /*Aqui lo que hacemos es crear una nueva variable en el cual juntamos el nombre 
            del primer fichero junto con el segundo que son separados por un guion bajo y le añadimos el .txt
            Por lo que con la copia creamos un fichero que no existe con el nombre de los ficheros anteriores y en la ruta del destino
            que se ha pedido anteriormente.*/
            String nuevoNombre = nombreSinExtension + "_"+nombreSinExtension2+".txt";
            File copia = new File(destino, nuevoNombre);

            /*Leemos y escribimos lo que esta escrito en cada fichero, y lo copiamos en el fichero nuevo que se crea.*/
            Scanner lector = new Scanner(fichero);
            Scanner lector2 = new Scanner(fichero2);
            PrintWriter escritor = new PrintWriter(copia);

            /*Aqui decimos que mientras haya algo escrito en el fichero, se lee la linea, para poder de esta manera
            copiarla en el nuevo fichero ya que comprobamos si hay algo escrito en los distintos ficheros*/
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                escritor.println(linea);
            }

            while (lector2.hasNextLine()) {
                String linea2 = lector2.nextLine();
                escritor.println(linea2);
            }

            /*Aqui cerramos la lectura y escritura que habiamos abierto anteriormente*/
            lector.close();
            escritor.close();
            lector2.close();
            System.out.println("Copia creada: " + copia.getName());

        } catch (FileNotFoundException e) {
            System.out.println("Error al copiar el fichero.");
        }
    }
}
