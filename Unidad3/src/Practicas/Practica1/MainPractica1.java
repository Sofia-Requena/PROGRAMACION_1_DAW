package Practicas.Practica1;

import Practicas.Practica1.Libro;
import Practicas.Practica1.Editorial;

public class MainPractica1 {
    
public static void main(String[] args) {
        Editorial editorial = new Editorial(11, "Santillana", 2002);
        editorial.imprimeEditorial();

        Libro principito = new Libro("ISBN", "El principito", 2000, 5, editorial);
        principito.imprimeLibro();
}

}
