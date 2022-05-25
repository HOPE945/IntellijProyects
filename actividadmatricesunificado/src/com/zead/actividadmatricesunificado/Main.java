package com.zead.actividadmatricesunificado;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // write your code here
        //Actividad 2 ahd2
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int men =0;

        System.out.println("Ejercicios con matices");

        while(!salir){
            System.out.println("1. llena una matriz con tus datos");
            System.out.println("2. Matrices cuadradas con tus datos");
            System.out.println("0. Salir");
            System.out.println("ingrese el numero de la opcion que desee");
            men = sc.nextInt();

            int subm=0;

            switch (men){
                case 1:
                    do{
                        System.out.println("llena una matriz con tus datos");
                        System.out.println("1. llena las filas y columnas");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();

                        switch (subm){
                            case 1:
                                int nF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas que desea para la matriz"));
                                int nC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de culumnas que sea para la matriz"));
                                int matriz [][] = new int [nF][nC];

                                for (int i = 0; i < nF; i++ ){
                                    for (int j = 0; j < nC; j++){
                                        matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para " +
                                                "la posicion de la mtrizm["+(i) +"," + (j)+ "] de la matriz"));
                                    }
                                }
                                String resultado ="";
                                for (int i = 0; i < nF; i++) {
                                    for (int j = 0; j < nC; j++){
                                        resultado += matriz[i][j];
                                        resultado +="     ";
                                    }
                                    resultado += "\n";
                                }

                                int sumaF = 0;
                                for (int i=0; i<nF; i++){
                                    sumaF=0;
                                    for (int j=0; j<nC; j++){
                                        sumaF=sumaF+matriz[i][j];
                                    }

                                }
                                int sumaC = 0;
                                for (int j=0; j<nC; j++){
                                    sumaC=0;
                                    for (int i=0; i<nF; i++){
                                        sumaC=sumaC+matriz[i][j];
                                    }

                                }


                                JOptionPane.showMessageDialog(null, resultado+"suma de filas "
                                        +"= "+sumaF+ "             "+"suma de culunmas " +"= " +sumaC);


                                break;

                            case 2:



                    break;











    }
}
