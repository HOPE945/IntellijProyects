package com.zead.tarea1arregoforeach;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String [] n = new String[3];
        n[0]= "Conejo";
        n[1]= "Perro";
        n[2]= "Gato";
        for (String nom: n){
            System.out.println(nom);
        }

    }
}
