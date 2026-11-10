package Actividades.Actividad11;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Actividad11 {
/*Realiza el programa que saca el negativo de una imagen según el color RGB (255 - rojo, 255 - verde y 255 - azul) */
/*Esta es la actividad donde se saca el negativo de cada color en una imagen, es la actividad de la pag 36*/
    public static void main(String[] args) {
        // Rutas de entrada y salida
        String rutaEntrada = "./Imagenes_portada/New_York_Navidad.png";
        String rutaSalida = "./New_York_Color_Negativo.png";

        try {
            // Leer imagen JPEG
            BufferedImage imagenColor = ImageIO.read(new File(rutaEntrada));
            if (imagenColor == null) {
                System.out.println("No se pudo leer la imagen. Verifica la ruta y el archivo.");
                return;
            }
            // Crear una imagen en escala de grises
            BufferedImage imagenGris = new BufferedImage(
                imagenColor.getWidth(),
                imagenColor.getHeight(),
                BufferedImage.TYPE_3BYTE_BGR
            );
            // Convertir pixel por pixel a escala de grises
            for (int y = 0; y < imagenColor.getHeight(); y++) {
                for (int x = 0; x < imagenColor.getWidth(); x++) {
                    Color color = new Color(imagenColor.getRGB(x, y));
                    int nuevoColor = new Color((255-color.getRed()), (255-color.getGreen()), (255-color.getBlue())).getRGB();
                    imagenGris.setRGB(x, y, nuevoColor);
                }
            }
            // Guardar como PNG
            boolean resultado = ImageIO.write(imagenGris, "png", new File(rutaSalida));
            if (resultado) {
                System.out.println("Conversión completada: imagen en escala de grises guardada como " + rutaSalida);
            } else {
                System.out.println("No fue posible guardar la imagen.");
            }
        } catch (IOException e) {
            System.err.println("Error al leer o escribir la imagen: " + e.getMessage());
        }
    }
}
