package com.zead.EjercicioPOO;

import java.util.Scanner;

public class EstructurasControl2 {
    // variables globales
    private Scanner sc;
    int num2;



    //constructor esta vacio
    public EstructurasControl2(){

    }
        public void ciclWhile(){
        sc =new Scanner(System.in);

            System.out.println("Conozca si es positivo o negativo ");
            System.out.println("Escriba el numero ");
            num2 = sc.nextInt();
            while(num2 !=0){
                if (num2 >0){
                    System.out.println(num2+" es positivo ");
                }else{
                    System.out.println(num2+" es negativo ");
                }
                System.out.println("escriba un numero");
                num2 = sc.nextInt();
                System.out.println("Gracias por su visita");
            }

        }




    }



