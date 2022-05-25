package com.zead.EjercicioPOO;

import java.util.Scanner;

public class Matrices {
    //variables globales
    private Scanner sc;

    //constructor
    public Matrices() {

    }

    public void matriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de filas para la matriz " +
                "la matriz");
        int f = sc.nextInt();
        System.out.println("Numero de columnas para la matriz " +
                "la matriz");
        int c = sc.nextInt();
        int matriz[][] = new int[f][c];

        for (int i = 0; i < f; i++) {
            System.out.println("Esta ingresando datos fila y columna " + (i));
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int tf = 0;
        for (int i = 0; i < f; i++) {
            tf = 0;
            for (int j = 0; j < c; j++) {
                tf = tf + matriz[i][j];

            }
            System.out.println("suma de fila [" + (i) + "=" + tf+"]");
            //JOptionPane.showMessageDialog(null,"Suma de columnas"+(i+1)+" =" +tf);
        }

        int tc = 0;

        for (int j = 0; j < c; j++) {
            tc = 0;


            for (int i = 0; i < f; i++) {
                tc = tc + matriz[i][j];
            }
            System.out.println("suma de columnas [" + (j ) + "=" + tc+"]");


        }


    }
}
