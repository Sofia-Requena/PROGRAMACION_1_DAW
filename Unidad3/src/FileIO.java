import java.io.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageIO;

public class FileIO{
public static void main(String [] args){
//    throws FileNotFoundException, IOException{
 
//    FileInputStream in = new FileInputStream("./Imagenes_portada/New_York_Navidad.png");
//    FileOutputStream out = new FileOutputStream("./salida.png");
 
//    int n=0,c;
//    System.out.print ("\nCopiando ...");
//    while( (c = in.read()) != -1){
//       out.write(c);
//       n++;
//    }
//    in.close();
//    out.close();
//    System.out.print ("\nSe han copiado "+n+" Bytes\n");
// }

        // Rutas de entrada y salida
        String rutaEntrada = "./Imagenes_portada/New_York_Navidad.png";
        String rutaSalida = "./New_York_Navidad.jpg";
        try {
            // Leer la imagen JPEG
            BufferedImage imagen = ImageIO.read(new File(rutaEntrada));
            if (imagen == null) {
                System.out.println("No se pudo leer la imagen. Verifica el formato y la ruta.");
                return;
            }
            // Guardar como PNG
            boolean resultado = ImageIO.write(imagen, "jpg", new File(rutaSalida));
            if (resultado) {
                System.out.println("Conversión completada. Imagen guardada como " + rutaSalida);
            } else {
                System.out.println("No fue posible escribir la imagen en formato PNG.");
            }
        } catch (IOException e) {
            System.err.println("Error al procesar la imagen: " + e.getMessage());
        }
    }

}
