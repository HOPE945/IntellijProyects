package com.zead.ejerciciodowhilemultiplicar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int dw = 0;


        do {
            System.out.println("escriba un numero entre 0 y 5");
            dw = sc.nextInt();
            System.out.println(dw +" multilpicado por 100" + " es "+ ( dw*100));
            System.out.println(dw +" multiplicado por 1000" + " es " + (dw*1000));
        }
        while (dw >-1 && dw <6);

    }
}
