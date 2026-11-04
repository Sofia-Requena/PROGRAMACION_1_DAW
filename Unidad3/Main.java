import utilidades.Matematicas; //Acceso al paquete
public class Main {
    public static void main(String[] args) {
        int x = Matematicas.sumar(5, 3);
        int y = Matematicas.multiplicar(4, 2);
        System.out.println("Suma: " + x);
        System.out.println("Multiplicación: " + y);
    }}