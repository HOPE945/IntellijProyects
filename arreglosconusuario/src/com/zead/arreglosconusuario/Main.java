package com.zead.arreglosconusuario;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //el parseInt lo uso cuando este usando string y me genera error
        int dimension;
        System.out.println("es hora de ingresar los datos al arreglo");
        System.out.println("Arreglo de dimension");


        dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension que tedra el arregolo"));
        int[] arr = new int[dimension];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < dimension; i++){
            System.out.println("Ingrese el dato en la posicion ["+i+"]");
            arr[i] = sc.nextInt();
        }
    }
}
