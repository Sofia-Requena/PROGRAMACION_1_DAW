package Practicas.Practica5;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ProcesarJSON {
    public static void main(String[] args) {
        try {

            // Lectura del contenido del fichero JSON
            Object ob = new JSONParser().parse(new FileReader("./src/Practicas/Practica5/JSONFile.json"));
            // Convertir objeto a JSON y procesarlo
            JSONObject js = (JSONObject) ob;
            String firstName = (String) js.get("firstName");
            String lastName = (String) js.get("lastName");
            System.out.println("First name is: " + firstName);
            System.out.println("Last name is: " + lastName);
            JSONArray arr = (JSONArray) js.get("phoneNumbers");
            for (Object item : arr) {
                JSONObject data = (JSONObject) item;
                String post_id = (String) data.get("phone-number");
                System.out.println(post_id);
            }
        } catch (org.json.simple.parser.ParseException | IOException e) {
            System.out.println("Error en lectura JSON");
        }
    }
}
