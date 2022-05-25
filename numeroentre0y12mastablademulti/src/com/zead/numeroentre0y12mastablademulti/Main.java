package com.zead.numeroentre0y12mastablademulti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //pedir un numero entre 0 y 12 y mostrar tabla de ese nume
        Scanner sc = new Scanner(System.in);

        int multi;


            System.out.println("Tabla de multiplicar");
            System.out.print("Ingrese un numero entre 0 y 12: ");
            multi= sc.nextInt();
            if (multi >=0 && multi<=12){
                for (int i = 0; i <=12; i++) {
                    System.out.println( multi + " x " + i + " =" + multi*i);
                }
            } else{
                System.out.println("Rango invalido");
            }




    }
    }
