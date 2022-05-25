package com.zead.actividadClaseAbstracta;

import java.util.Scanner;

public class Navisco extends DatosTrabajador {
    //constructor vacio
    public Navisco(){

    }
    Scanner sc = new Scanner(System.in);

    //este es el metodo propio de la clase
       public void salarioAnualN(){

           double salarioBase =5000;
           double salarioTotal=salarioBase*12;

           System.out.println("\n Salario que recibira el 2022: Q "+salarioTotal);


       }

    //este es el metodo que heredo
    @Override
    public void comision() {

        double comision;
        double venta1 =1800;
        double venta2= 8877;
        double venta3=3000;


        System.out.println("comisiones");
        System.out.println("Importe de la primera venta: "+venta1);
        System.out.println("Importe de la segunda venta: "+venta2);
        System.out.println("Importe de la tercera venta: "+venta3);


        comision = 0.1 * (venta1+venta2+venta3);


        System.out.println("La comision que recibira es: Q "+comision);


    }
}
