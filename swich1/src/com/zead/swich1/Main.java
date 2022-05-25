package com.zead.swich1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //estructura de control
        //default es similar a else
        int dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dias de la semana");
        System.out.println("Ingresar un dia de la semana");
        dia = sc.nextInt();

        //declaracion del switch
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dato fuera de rango");
                break;
        }

    }
}
