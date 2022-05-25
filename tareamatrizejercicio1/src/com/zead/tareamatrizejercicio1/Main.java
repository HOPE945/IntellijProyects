package com.zead.tareamatrizejercicio1;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

                        //esta es la primera fila
                        int nF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas que desea para la matriz"));
                        int nC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de culumnas que sea para la matriz"));
                        int matriz[][] = new int[nF][nC];

                        for (int i = 0; i < nF; i++) {
                            for (int j = 0; j < nC; j++) {
                                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para " +
                                        "la posicion de la mtrizm[" + (i) + "," + (j) + "] de la matriz"));
                            }
                        }
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


                        JOptionPane.showMessageDialog(null, resultado + "suma de filas "
                                + "= " + sumaF + "             " + "suma de culunmas " + "= " + sumaC);


                        // este es la ultima fila




    }
}
