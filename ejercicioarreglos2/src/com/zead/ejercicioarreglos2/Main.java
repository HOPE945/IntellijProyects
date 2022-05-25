package com.zead.ejercicioarreglos2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int suma = 0;

        int [] s = new int[5]; // 5 es el numero de arreglos
        s[0] = 1;
        s[1] = 1;
        s[2] = 1;
        s[3] = 1;
        s[4] = 1;
        for (int i = 0; i<5; i++){
            suma = suma + s[i];
        }
        System.out.println("suma");

    }
}
