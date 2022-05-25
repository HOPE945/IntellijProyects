package com.zead.EjercicioPOO;

import java.util.Scanner;

public class EstructurasControl {
    // variables globales
    private Scanner sc;
    public int ini;
    public int fin;


    //constructor esta vacio
    public EstructurasControl(){

    }

    public void ciclFor(){
        sc=new Scanner(System.in);
        System.out.println("Generador de numeros");
        System.out.println("Escriba el numero con el que quiere iniciar ");
        ini=sc.nextInt();
        System.out.println("Escriba el numero con el que desea que finalice ");
        fin = sc.nextInt();
        for (int i = ini; i<=fin; i++){
            System.out.println(" "+i);
        }

    }
}
