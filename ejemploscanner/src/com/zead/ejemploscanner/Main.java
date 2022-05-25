package com.zead.ejemploscanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //un objeto es la instancia de una clase
        //crear nuestro objeto de la clase scanner
        //identificar la clase de la cual creremos el objjeto
        //realizar la instancia=crear el objeto referente a la clase
        //ojo esta es la estructura para crear un objeto basico Scanner teclado = new Scanner(System.in);
       int n1;
       int n2;
       int suma;
       int resta;

        Scanner teclado = new Scanner(System.in);
        //suma y resta de un objeto
        System.out.println("Operaciones basicas");
        System.out.println("Ingrese el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = teclado.nextInt();

        //realizar la operacion
        suma = n1 + n2;
        resta = n1 - n2;+
        //mostrando el resultado
        System.out.println("El resultado de la suma es:"+suma);
        System.out.println("El resultafo de la resta es:"+resta);
    }
}
