package com.zead.ejercicionotas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //promedio

        float nota = 0;

        Scanner sc = new Scanner(System.in);
//pedir una nota y decir si es bajo, medio alto.
        System.out.println("Ingrese una nota para saber si es bajo, medio o alto ");
       nota = sc.nextFloat();
        if (nota >=0 && nota <=4) {
            System.out.println("Bajo ");
        }
        else if (nota>=5 && nota<=8){
            System.out.println("Medio");
        }
        else if (nota>=9 && nota<=10){
            System.out.println("Alto");
        }
    }
}
