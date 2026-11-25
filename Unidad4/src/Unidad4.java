public class Unidad4 {
    public static void main(String[] args) {
        // int [] vectorNumeros = {0,0,0,0,0};

        // for(int i=0; i<vectorNumeros.length; i++){
        //     //Recorremos el vector
        //     System.out.print(vectorNumeros[i]+", ");
        // }
        // System.out.println();
        // System.out.print("VECTOR RESULTADO: ");

        // for(int i=0; i<vectorNumeros.length; i++){
        //     //Asigna a cada posicion un valor
        //     int random = (int)(Math.random()*(4+1))+1;
        //     vectorNumeros[i]=random;
        //     System.out.print(vectorNumeros[i]+", ");
            
        // }
        // System.out.println();
        // System.out.println(vectorNumeros[0]);

        // Persona p1 = new Persona("David", 33);
        // Persona p2 = new Persona("Maria", 25);

        // /*Vector persona */
        // Persona [] persona = {p1,p2};
        
        /*Uso de un vector como un parametro de una funcion*/
        // int [] vectorNumeros = {4,7,3,9};
        // int[] resultado=null;
        // resultado=multiplica2(vectorNumeros);

        /*Sacar resultado*/
        // System.out.print("Resultado: ");
        // for(int i=0; i<resultado.length; i++){
        //     System.out.print(resultado[i]+", ");
        // }
        // System.out.println();

        /*Sacar resultado*/
        // multiplica2bis(vectorNumeros);
        // System.out.print("Resultado: ");
        // for(int i=0; i<resultado.length; i++){
        //     System.out.print(resultado[i]+", ");
        // }
        // System.out.println();

        String[][] comidas = {
            {"Avena", "Cereal", "Huevo", "Yogur", "Fruta", "Pan tostado con aguacate", "Hotcakes"},
            {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones","Espagueti"},
            {"Frijoles", "Quesadillas", "Estofado", "Picadillo", "Lasaña", "Ensalada", "Pizza"}
        };
        String[] b = comidas[1];
        System.out.println(comidas[1][2]);
        System.out.println(b[2]);




    }

    /*Funciones */

    // public static int[] multiplica2(int[] vector){
    //     int[] salida = {0,0,0,0};
    //     for(int i=0; i<vector.length; i++){
    //         salida[i]=2*vector[i];
    //     }
    //     return salida;
    // }

    // public static void multiplica2bis(int[] vector){
    //     for(int i=0; i<vector.length; i++){
    //         vector[i]=2*vector[i];
    //     }
    // }

/*No borrar llave*/
}
