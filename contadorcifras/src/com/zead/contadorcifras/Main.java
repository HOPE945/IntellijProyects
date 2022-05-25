package com.zead.contadorcifras;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //contador de cifras
        int num1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entre 0 a 9999");
        num1 = sc.nextInt();
        if (num1>=0 && num1<=9){
            System.out.println("El numero " + num1 + " tiene una cifra");
        }
        else if (num1>=10 && num1<=99){
            System.out.println("El numero " + num1 + " tiene dos cifras");
        }
        else if (num1>=100 && num1<=999){
            System.out.println("El numero "+ num1 + " tiene tres cifras");
        }
        else{
            System.out.println("Ingreso un numero incorrecto");
        }


        }
}