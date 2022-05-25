package com.zead.ejerciciotryCatchgrupo5;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
       try {
           int [] num = new int[5];
           num[0]=1;
           num[1]=2;
           num[2]=3;
           num[3]=4;
           num[4]=5;
           System.out.println(num[4]);

       }catch(Exception e){
           System.out.println("Poscion fuera de rango"+e.getMessage());
           //System.out.println("Posicion fuera de rango"+e);
       }





    }
}
