package com.zead.actividadGrupo4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //hice calcular el area de un cuadrado
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese la base");
        double b= sc.nextDouble();
        System.out.println("Ingrese la altura");
        double h= sc.nextDouble();
        double p= b*2 + h*2;
        System.out.println("El perimetro es: "+p);
        double a=b*h;
        System.out.println("El area es: "+a);



    }
}
