package RelacionEjerciciosUnidad3.RelacionActividad2;

import java.util.Scanner;

public class Racional {
    /*Atributos*/
    private int numerador  = 0;
    private int denominador = 0;
    private int suma = 0;
    private int restar = 0;
    private int multiplicar = 0;
    private int dividir = 0;


    
    /*Constructores*/
    public Racional() {}

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racional(Racional copiaRacional) {
        this.numerador = copiaRacional.DevuelveNumerador();
        this.denominador = copiaRacional.DevuelveDenominador();
    }

    /*Metodos*/
    
    /*Aqui lo que hacemos es crear los metodos del numerador y deniminador y le damos de x a numerador y de y a denominador*/
    public int DevuelveNumerador() { /*Get*/
        return numerador;
    }
    public void AsignaNumerador(int x) { /*Set*/
        this.numerador = x;
    }
    public int DevuelveDenominador() { /*Get*/
        return denominador;
    }
    public void AsignaDenominador(int y) { /*Set*/
        if (y != 0) {
            this.denominador = y;
        }
    }

    /*Funciones de suma, resta, multiplicacion y division */
    public int mcm(int absoluto_A, int absoluto_B){
            absoluto_A = Math.abs(absoluto_A);
            absoluto_B = Math.abs(absoluto_B);
            int mayor= Math.max(absoluto_A, absoluto_B);
            int mcm= mayor;

            while ((mcm % absoluto_A!=0) || (mcm % absoluto_B!=0)) {
                mcm=mcm+mayor;
            }
            return mcm;
    }

    /*Mensajes para imprimir*/
    public void suma(Racional b){
        /*Aqui calculamos primero la suma de las dos fracciones y despues se muestra el resultado*/
        int Denominador=mcm(this.denominador, b.DevuelveDenominador());
        int Numerador=(((Denominador/this.denominador)*this.numerador)+((Denominador/b.denominador)*b.DevuelveNumerador()));
        System.out.println("La suma de las dos fracciones son: "+Numerador+"/"+Denominador);

    }

    public void resta(Racional b){
        /*Aqui calculamos primero la resta de las dos fracciones y despues se muestra el resultado*/
        int Denominador=mcm(this.denominador, b.DevuelveDenominador());
        int Numerador=(((Denominador/this.denominador)*this.numerador)-((Denominador/b.denominador)*b.DevuelveNumerador()));
        System.out.println("La resta de las dos fracciones son: "+Numerador+"/"+Denominador);
    }

    public void multiplicacion(Racional b){
        /*Aqui calculamos primero la multiplicacion de las dos fracciones y despues se muestra el resultado*/
        int Denominador=((denominador*b.DevuelveDenominador()));
        int Numerador=(numerador*b.DevuelveNumerador());
        System.out.println("La multiplicacion de las dos fracciones son: "+Numerador+"/"+Denominador);
    }

    public void division(Racional b){
        /*Aqui calculamos primero la division de las dos fracciones y despues se muestra el resultado*/
        int Denominador=((denominador*b.DevuelveNumerador()));
        int Numerador=(numerador*b.DevuelveDenominador());
        System.out.println("La division de las dos fracciones son: "+Numerador+"/"+Denominador);
    }

    public void esIgual(Racional b){
        if (numerador==b.DevuelveNumerador() && denominador==b.DevuelveDenominador()) {
            System.out.println("Son iguales ambas fracciones");
        }
        else{
            System.out.println("No son iguales");
        }
    }

     public void imprimirRacional(){
        System.out.println(numerador+"/"+denominador);
     }


/*No borrar llave */
}
