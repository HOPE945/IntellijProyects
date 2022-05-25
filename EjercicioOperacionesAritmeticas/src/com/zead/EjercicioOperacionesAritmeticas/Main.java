package com.zead.EjercicioOperacionesAritmeticas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //estos son los objetos



        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("---Operacines aritmeticas---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Condicion");
        System.out.println("6. Swtch");
        System.out.println("7. For");
        System.out.println("8. While");
        System.out.println("9. Arreglos");
        System.out.println("10. Matrices");
        System.out.println("ELIGE ");
        op= sc.nextInt();

        while(op > 0 && op <=10){

            switch (op){
                case 1:
                    System.out.println("Eligio sumar");
                    System.out.println("Ingrese el primer numero");
                    operaciones.d1 =sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    operaciones.d2 =sc.nextInt();
                    System.out.println("El resultado de la suma es: ";
                    break;
            }

        }
    }
}
