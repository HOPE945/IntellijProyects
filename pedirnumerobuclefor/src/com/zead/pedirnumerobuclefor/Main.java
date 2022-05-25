package com.zead.pedirnumerobuclefor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int dato;
        int suma = 0;
        for (int i = 0; i < 15; i++ ){
            System.out.println("Ingrese un numero en la posicion " +i);
           dato = sc.nextInt();
           suma = suma + dato; // suma = 0 + 1 en la primera vuelta
                                // suma = 1 + 1 en la segunda vuelta
                                // suma = 2 + 1 en la primera vuelta
        }
        System.out.println("La suma es:" + suma);

    }
}
