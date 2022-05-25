package com.zead.ejemploforeach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] n =new String[6];
        n[0] = "Karla";
        n[1] = "Perla";
        n[2] = "luis";
        n[3] = "Kissa";
        n[4] = "Carlos";
        n[5] = "Daniel";

        for (String nom: n){
            System.out.println(nom);
        }
    }
}
