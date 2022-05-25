package com.zead.EjercicioPOO;

import java.util.Scanner;

public class Condicionales {

    //variables globales

    private Scanner sc;
    public int cond1;
    public int cond2;
    int resultado;

    // constructor

    public Condicionales(){

    }

    public int contIf(){
        int resultado;
        resultado = (int) (this.cond1+this.cond2);
        return resultado;
       }


       public void switchC(){
        sc =new Scanner(System.in);
        int dia;
           System.out.println("Dias con mas procesiones en la Zona 1, de Guatemala. ");
           System.out.println("Ingrese un numero entre 1 y 4");
           dia = sc.nextInt();

               switch (dia){
                   case 1:
                       System.out.println("Jueves santo ");
                       break;

                   case 2:
                       System.out.println("Viernes santo ");
                       break;

                   case 3:
                       System.out.println("Sabado de gloria");
                       break;

                   case 4:
                       System.out.println("Domingo de resurreccion");
                       break;

                   default:
                       System.out.println("su busqueda no produjo resuldo");
                       break;

           }



       }




       }









