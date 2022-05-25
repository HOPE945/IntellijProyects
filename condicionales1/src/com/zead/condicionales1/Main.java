package com.zead.condicionales1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*if ("si esta condicion se cmple realiza esto" ){
            "bloque de sentencia"

            else { sino realiza esto}
           }    */
        Scanner sc = new Scanner(System.in);

        //estructura de control if
        /*int n1;
        int n2;
        System.out.println("Validar numero iguales");
        System.out.println("Ingrese el primer numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();
        if(n1 == n2){
            System.out.println("Los numero son iguales");
                    }
        else{
            System.out.println("Los numeros ingresados no son iguales");
        }*/

        //ejercicio 2
        /*int n3;
        System.out.println("Validar si un numero es Positivo o Negativo");
        System.out.println("Ingrese un numero");
        n3 = sc.nextInt();
        if(n3 > 0){
            System.out.println(n3 + "es POSITIVO");
        }
        else if (n3 == 0){
            System.out.println(n3 + "es NEUTRO");
        }
        else{
            System.out.println(n3 + "es NEGATIVO");
        }*/

        //ejercicio 3
        /*int n4;
        int n5;
        System.out.println("Validar cual es mayor");
        System.out.println("Ingrese el primer numero");
        n4 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n5 = sc.nextInt();

        if( n4 > n5 ){
            System.out.println("El primer numero es mayor al segundo");
        }
        else if (n4 == n5){
            System.out.println("Ambos numero son iguales");
        }
        else{
            System.out.println("El segundo numero es mayor al primero");
        }*/

        //ejemplo4
        int n6;
        System.out.println("Numero a letra");
        System.out.println("ingrese un numero del 0 al 10");
        n6 = sc.nextInt();
        if (n6 == 0){
            System.out.println("CERO");
        }
        else if (n6 == 1){
            System.out.println("UNO");
        }
        else if (n6 == 2){
            System.out.println("DOS");
        }
        else if (n6 == 3){
            System.out.println("TRES");
        }
        else if (n6 == 4){
            System.out.println("CUATRO");
        }
        else if (n6 == 5){
            System.out.println("CINCO");
        }
        else if (n6 == 6){
            System.out.println("SEIS");
        }
        else if (n6 == 7){
            System.out.println("SIETE");
        }
        else if (n6 == 8){
            System.out.println("OCHO");
        }
        else if (n6 == 9){
            System.out.println("NUEVE");
        }
        else if (n6 == 10){
            System.out.println("DIEZ");
        }
        else{
            System.out.println("NUMERO FUERA DE RANGO");
        }
    };
}
