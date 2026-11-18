package RelacionEjerciciosUnidad3.RelacionActividad2;

public class MainRelacionEjercicio2 {
/*Construir una clase Racional que permita representar y manipular números racionales. Un 
número racional permite representar la relación a/b entre dos números enteros siendo a el 
numerador y b el denominador (distinto de cero). Se deben implementar los siguientes métodos para 
la clase Racional:  asignaNumerador(int x), asignaDenominador(int y), imprimirRacional(), 
las operaciones de suma, resta, producto y división y esIgual(Racional b).*/
    public static void main(String[] args) {
        /*Aqui lo que hacemos es crear dos objetos el primero se llama uno y el segundo se llama dos y cada uno de ellos tiene datos distintos*/
        Racional uno = new Racional(5, 3);
        Racional dos = new Racional(2, 5);
        /*Aqui lo que hacemos es llamar a las distintas funciones, que son sumar, restar, multiplicar y dividir y despues comprobamos
        si ambas fracciones son iguales, y se mostrara si si o si no*/
        uno.suma(dos);
        uno.resta(dos);
        uno.multiplicacion(dos);
        uno.division(dos);
        uno.esIgual(dos);
        uno.imprimirRacional();
        dos.imprimirRacional();
        System.out.println("");
    }
}
