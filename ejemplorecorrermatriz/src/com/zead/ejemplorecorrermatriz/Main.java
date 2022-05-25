package com.zead.ejemplorecorrermatriz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // primera forma     f          c
        int [][] edad  = {{2,3,8,5},{3,4,90}}; //declarando matriz lo que esta dentro aqui estoy
        String [][] frutas = new String [3][2]; //primero tengo que llenar las filas y despues empiezo las columnas
        frutas[0][0] = "Uva";
        frutas[0][1] = "Naranja";
        frutas[1][0] = "Limon";
        frutas[1][1] = "Fresa";
        frutas[2][0] = "Pera";
        frutas[2][1] = "Piña";

        for (int i = 0; i<3;i++);  //for para recorrer las filas

        for (int j= 0; j<2; j++);  //for para recorrer las columnas
        //System.out.println(""());



    }
}
