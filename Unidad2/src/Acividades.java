public class Acividades {
    public static void main(String[] args) {
       //Actividad 1- pag:9. Realiza un programa que genera 2 números y nos diga el cociente, 
       // la media, la potencia y la raíz cuadrada. Usa tipos adecuados

        int min=1;
        int max=10;
        double num1=((int)(Math.random()*(max-min+1))+min);
        double num2=((int)(Math.random()*(max-min+1))+min);
        double potencia = Math.pow(num1,num2);
        double raiz = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);
        System.out.println("El primer numero es: "+num1);
        System.out.println("El segundo numero es: "+num2);
        System.out.println("El cociente de los dos numeros es: "+(num1/num2));
        System.out.println("La media de los dos numeros es: "+(num1+num2)/2);
        System.out.println("La potencia del numero 2 elevado al numero 1: "+potencia);
        System.out.println("La raiz cuadrada del primer numero es: "+raiz );
        System.out.println("La raiz cuadrada del segundo numero es: "+raiz2 );


    }
}
