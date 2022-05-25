package com.zead.ejercicioanio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int anio;
        int mes;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Para saber cuantos meses hay en la cantidad de años que desee.");
        System.out.println("Ingrese el numero de años");
        anio = teclado.nextInt();

        mes=anio*12;
        System.out.println("En "+anio+ " años son: " + mes +" meses.");


    }
}
