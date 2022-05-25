package com.zead.tresnumerosordendos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ingrese tres numeros que se ordenaran ascendente
        Scanner sc = new Scanner(System.in); //objeto ipo scanner
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        System.out.println("Ingrese 3 numeros para que sean ordenados de mayor a menor");
        System.out.println("Pirmer numero ");
        n1 = sc.nextInt();
        System.out.println("Segundo numero ");
        n2 = sc.nextInt();
        System.out.println("Tercer numero ");
        n3 = sc.nextInt();

        System.out.println("Los numeros de mayor a menor son: ");

        if (n1>=n2 && n2>=n3){
            System.out.println(n1+" "+n2 +" "+n3);
        } else if (n1>=n3 && n3>=n2){
            System.out.println(+n1 +" "+n3 +" " +n2);
        } else if (n2>=n3 && n3>=n1){
                System.out.println(+n2 +" "+n3 +" " +n1);
        } else if (n3>=n1 && n1>=n2){
            System.out.println(+n3 +" "+n1 +" " +n2);
        } else {
            System.out.println(n3 +" " + n2 + " "+ n1);
        }







    }
}
