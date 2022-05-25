package com.zead.EjercicioPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Arreglos {
    //variables globales
    private Scanner sc;
    ArrayList<Integer> arrayNumerous = new ArrayList<>();

    //constructor
    public Arreglos(){

    }

    public void arrayL(){
        sc = new Scanner(System.in);
        int datoNuevo=0;

        System.out.println("Ingrese el elemento que desea agregar ");

        datoNuevo=sc.nextInt();
        System.out.println("El dato ["+datoNuevo+ "] fue agregado correctamente");


    }

}
