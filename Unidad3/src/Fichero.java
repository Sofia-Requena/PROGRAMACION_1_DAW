import java.io.File;

public class Fichero {
    public static void main(String[] args) {
        /*Esta linea sirve para saber desde donde o desde que directorio empieza a leer los archivos */
        // System.out.println("Directorio actual: " + new File(".").getAbsolutePath());
       
        try {
        File fichero = new File("./src/FicheroEjemplo.txt");

        if (fichero.exists()) {
            System.out.println();
            System.out.println("Nombre del archivo "+fichero.getName());
            System.out.println("Ruta "+fichero.getPath());
            System.out.println("Ruta absoluta "+fichero.getAbsolutePath());
            System.out.println("Se puede escribir "+fichero.canRead());
            System.out.println("Se puede leer "+fichero.canWrite());
            System.out.println("Tamaño "+fichero.length());

        }else{
                throw new Exception("No existe el archivo");
            }
            // fichero.close();
            } catch (Exception e) {
                System.out.println("No existe el archivo");
                // System.out.println(e.getMessage());
            }
        
    }

//No borrar llave
}
