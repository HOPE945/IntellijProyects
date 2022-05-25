package com.zead.mostrarnumcuadrado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int num;
        int cuadrado;
        System.out.println("Conozca el cuadrado de diferentes numeros");
        System.out.println("Si desea salir ingrese un numero negativo");
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        while(num > 0){
            cuadrado = num * num;
            System.out.println("El cuadrado de " +num+ " es: " +cuadrado );
            System.out.println("Ingrese un numero");

            num = sc.nextInt();
        }
        System.out.println("Gracias por visitarnos");
    }
}
