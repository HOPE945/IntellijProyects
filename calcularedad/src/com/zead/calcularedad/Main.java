package com.zead.calcularedad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //actual-año de nacimiento
       String nombre;
        int edad =  0;
        int actual = 2022;


        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Usted es: " + nombre+"Su edad es: " + edad + " años, " + "nacio en el año: " +(actual-edad));






    }
}
