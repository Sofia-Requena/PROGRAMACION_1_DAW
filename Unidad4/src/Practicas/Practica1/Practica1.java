package Practicas.Practica1;

public class Practica1 {
    public static void main(String[] args) {
        int [] practica={4,5,1,8,5};
        int [] copia={0,0,0,0,0};

        for(int i=0; i<practica.length; i++){
            copia[i]=practica[i];
            System.out.print(" "+copia[i]);
        }
        

    }
}
