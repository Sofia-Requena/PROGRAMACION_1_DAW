package Actividades.Actividad4;

import Actividades.Actividad4.Categoria;
import Actividades.Actividad4.Pertenece;
import Actividades.Actividad4.Pieza;
import Actividades.Actividad4.Proveedor;
import Actividades.Actividad4.Suministra;

public class MainActividad4 {
/*Actividad: Crea las clases en JAVA con sus correspondientes constructores y 
funciones necesarias para mostrar información y modificar los atributos del siguiente diagrama E-R */

/*Esta actividad se encuentra en la pagina 20. Esta actividad habia que hacer los atributos, los constructores, los metodos 
de cada uno de las distintas clases. Y despues se unian en este MAIN */

public static void main(String[] args) {
        Proveedor proveedor = new Proveedor(12, "direccion proveedor", "Avila", "Avila");
        proveedor.imprimeProveedor();

        Pieza pieza = new Pieza("Pieza", "Gris", 15.20);
        pieza.imprimePieza();

        Categoria categoria = new Categoria(29, "Categoria");
        categoria.imprimeCategoria();

        Suministra suministra_proveedor_pieza = new Suministra(3, "22/12/2026", proveedor, pieza);
        suministra_proveedor_pieza.imprimeSuministra();

        Pertenece pertenece_pieza_categoria = new Pertenece(categoria, pieza);
        pertenece_pieza_categoria.imprimePertenece();

}

//No borrar llave
}
