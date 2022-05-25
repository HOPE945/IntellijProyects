package com.zead.estructuradecontrolwhile;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //leer un numero y mostrar su estructura
        /*int w = 1;
        while (w < 5){
            System.out.println("Hola soy " + w);
            w++;
        }*/

        Scanner sc = new Scanner(System.in);
        int num;
        int cuadrado;
        System.out.println("Conozca el cuadrado de diferentes numeros");
        System.out.println("Si desea salir ingrese un numero negativo");
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        while(num > 0){
            cuadrado = num * num;
            System.out.println("El cuadrado de " +num+ " es: " +cuadrado );
            System.out.println("Ingrese un numero");

            num = sc.nextInt();
        }
        System.out.println("Gracias por visitarnos");
        //saber si un numero es negativo o positivo

        int num2;
        System.out.println("Conozca su un numero es positivo o negativo");
        System.out.println("si desae salir ingrese un 0");
        System.out.println("Escriba un numero");
        num2 = sc.nextInt();
        while (num2 != 0){
            if (num2 > 0) {
                System.out.println(num2 + " es POSITIVO ");
            }
            else {
                System.out.println(num2 + "es NEGATIVO");
            }
            System.out.println("Ingrese un numero");
            num2 = sc.nextInt();
            }
        System.out.println("Gracias por su visita");

        //leer un numero hasta que se introduzca 0


        /*

        int num3;

        System.out.println("Introduzca un numero");
        num3 = sc.nextInt();
        System.out.println("si desae salir ingrese un 0");
       if ( num3 % 2 ==0 ){
            System.out.println("el numero " +num3+  " es PAR");
        }
        else
        {
            System.out.println("el numero " +num3+ " es IMPAR");
        }*/


        }

    }

