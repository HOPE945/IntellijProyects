package com.zead.sumaFyCmatrizActividad3;

import javax.swing.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantas filas queiere que sea " +
                "la matriz");
        int f = sc.nextInt();
        System.out.println("De cuantas columnas quiere que sea " +
                "la matriz");
        int c = sc.nextInt();
        int matriz[][]=new int [f][c];

        for (int i=0; i<f;i++){
            System.out.println("Ingrese las filas "+(i+1));
            for (int j=0; j<c;j++){
                matriz[i][j]=sc.nextInt();
            }
        }
        int tf=0;
        for (int i=0; i<f;i++){
            tf=0;
            for (int j=0; j<c;j++){
                tf=tf+matriz[i][j];

            }
            System.out.println("suma de fila "+(i+1)+"="+tf);
            //JOptionPane.showMessageDialog(null,"Suma de columnas"+(i+1)+" =" +tf);
        }

        int tc=0;

        for (int j=0; j<c;j++){
            tc=0;


                for (int i=0; i<f; i++){
                    tc=tc+matriz[i][j]; }
            System.out.println("suma de columnas "+(j+1)+"="+tc);

                /*
                String resultado = "";
                                for (int i = 0; i < nF; i++) {
                                    for (int j = 0; j < nC; j++) {
                                        resultado += matriz[i][j];
                                        resultado += "     ";
                                    }
                                    resultado += "\n";
                                }


                                int sumaF = 0;
                                for (int i = 0; i < nF; i++) {
                                    for (int j = 0; j < nC; j++) {
                                        sumaF = sumaF + matriz[i][j];
                                    }

                                }
                                int sumaC = 0;
                                for (int j = 0; j < nC; j++) {
                                    for (int i = 0; i < nF; i++) {
                                        sumaC = sumaC + matriz[i][j];
                                    }

                                }







                 */








                //JOptionPane.showMessageDialog(null,"Suma de columna"+(j+1)+" =" +tc);
        }

    }
}
