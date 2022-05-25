package com.zead.pedir10sueldosfor;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int t = 10;
        int s = 0; //contador
        int sueldo=0;


        System.out.println("Encontrando sueldos mayores a 5k");

        for ( int i=1; i<=10; i++){
            System.out.println("Ingrese el el sueldo " + i);
            sueldo = sc.nextInt();
            t= t+sueldo;

            if (sueldo>5000){
                s++;
            }
        }
        System.out.println("Los sueldos mayores a 5000 suman: " + s);
        System.out.println("Cantidad de sueldos ingresados suman: " + t);





        {






        }

    }
}
