package com.zead.ejemplo1dowhile;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* int dw = 10;
        do{
            System.out.println("Hola soy dw" + dw);
            dw++;
        }
        while (dw <9);
        */
        Scanner sc = new Scanner(System.in);
        int dw1;
        int dw2;
        int dw3;

        do {
            System.out.println("Multipliccion de numeros");
            System.out.println("Ingrese un numero");
            dw1 = sc.nextInt();


            if (dw1 >= 0 && dw1<=5){
                dw2 = dw1*100;
                dw3 =dw1*1000;
                System.out.println("El numero por cien" + dw1 + dw2);
                System.out.println("El numero por mil" + dw1 + dw3);
            } else {
                System.out.println("Bye");
            }
            }while (dw1 >-1 && dw1 <6);
        }

    }
