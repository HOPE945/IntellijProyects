package com.zead.mostrarparoimpar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingrese dos numeros para saber si son par o impar");
        num1 = sc.nextInt();
        if (num1 %2==0){
            System.out.println("Numero " + num1 + " par ");
        } else{
            System.out.println("Numero " + num1 + " impar ");
        }
        num2 = sc.nextInt();
        if (num2 %2==0){
            System.out.println("Numero " + num2 + " par");
        } else{
            System.out.println("Numero " + num2 + " impar");
        }
    }
}
