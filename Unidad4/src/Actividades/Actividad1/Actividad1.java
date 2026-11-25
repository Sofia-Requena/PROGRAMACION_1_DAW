package Actividades.Actividad1;

public class Actividad1 {
    /*Realiza una función que busca un número en un array e indica dónde está o devuelve -1 */
    public static void main(String[] args) {
        System.out.print(actividad1(13)); 

    }

    public static int actividad1(int numeroDevuelve){
        int [] vector={2,6,8,12,14};
        int encontrado=-1;

        for(int i=0; i<vector.length; i++){
            if (vector[i]==numeroDevuelve) {
                System.out.println("Tu numero esta en la posicion: "+i);
            }
        }
        return encontrado;
    }

    /*opcion2 */
    public static int actividad1_2(int numeroDevuelve){
        int [] vector={2,6,8,12,14};
        int encontrado=-1;


        for(int i=0; i<vector.length; i++){
            if (vector[i]==numeroDevuelve) {
                System.out.println("Tu numero esta en la posicion: "+i);
            }
        }
        return encontrado;
    }


}
