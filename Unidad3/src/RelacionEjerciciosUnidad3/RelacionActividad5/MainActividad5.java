package RelacionEjerciciosUnidad3.RelacionActividad5;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MainActividad5 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            // Leer el fichero JSON
            Object obj = parser.parse(new FileReader("./Ejemplos_Resultados_Clase/heroes.json"));
            // Convertir el contenido en un array JSON
            JSONArray heroes = (JSONArray) obj;
            System.out.println("SUPERHEROE"+"| "+"PUBLISHER"+"| "+"ALTER EGO"+"| "+"FIRST APPEARANCE"+"| "+"CHARACTER");
            System.out.println("-----------------------------------------------");
            // Recorrer los héroes del fichero (ahora es un array)
            for (Object elemento : heroes) {
                JSONObject heroe = (JSONObject) elemento;
                //Vamos a ller datos del héroe
                String superhero = (String) heroe.get("superhero");
                String publisher = (String) heroe.get("publisher");
                String alter_ego = (String) heroe.get("alter_ego");
                String first_appearance = (String) heroe.get("first_appearance");
                String characters = (String) heroe.get("characters");
                // Mostrar únicamente los héroes de Marvel
                if (superhero.startsWith("G")) {
                    System.out.println(superhero+"| "+publisher+"| "+alter_ego+"| "+first_appearance+"| "+characters); 
                }
            }
            System.out.println("-----------------------------------------------");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}
