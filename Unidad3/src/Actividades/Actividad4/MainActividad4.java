package Actividades.Actividad4;

import Actividades.Actividad4.Categoria;
import Actividades.Actividad4.Pertenece;
import Actividades.Actividad4.Pieza;
import Actividades.Actividad4.Proveedor;
import Actividades.Actividad4.Suministra;

public class MainActividad4 {
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
