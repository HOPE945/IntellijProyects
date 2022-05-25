package com.zead.ejemplo2matrizcuadrada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int [][] num = new int [6][6];




        for (int i=0; i<num.length; i++){
            for (int j = 0; j < num[i].length; j++) {
                System.out.print("Ingrese dato en la posicion " + i + " "+j);
                num[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 6; i++ ){
            for (int j = 0; j<6; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
