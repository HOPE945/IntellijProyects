package com.zead.sabersiespositoneg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //saber si es positivo o negativo
        Scanner sc = new Scanner(System.in);
        int num2;

        System.out.println("Conozca su un numero es positivo o negativo");
        System.out.println("si desae salir ingrese un 0");
        System.out.println("Escriba un numero");
        num2 = sc.nextInt();
        while (num2 != 0){
            if (num2 > 0) {
                System.out.println(num2 + " es POSITIVO ");
            }
            else {
                System.out.println(num2 + " es NEGATIVO");
            }
            System.out.print("Ingrese un numero: ");
            num2 = sc.nextInt();
        }
        System.out.println("Gracias por su visita");

    }
}
