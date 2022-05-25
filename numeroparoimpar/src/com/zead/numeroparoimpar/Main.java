package com.zead.numeroparoimpar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int num3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduzca un numero");
        num3 = sc.nextInt();
        System.out.println("si desae salir ingrese un 0");
        if ( num3 % 2 ==0 ){
            System.out.println("el numero " +num3+  " es PAR");
        }
        else
        {
            System.out.println("el numero " +num3+ " es IMPAR");
        }

    }
}
