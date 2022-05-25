package com.zead.actividadClaseAbstracta;

import com.zead.actividadClaseAbstracta.DatosTrabajador;

public class Pozuelo extends DatosTrabajador {

    //constructor vacio
    public Pozuelo(){

    }
    public void salarioAnualP(){
        double salarioBase =4300;
        double salarioTotal=salarioBase*12;

        System.out.println("\n Salario que recibira el 2022: Q "+salarioTotal);

    }


    @Override
    public void comision() {
        double salarioBase=4300;
        double comision;
        double venta1 =2000;
        double venta2= 3777;
        double venta3=1200;
        double salarioTotal;

        System.out.println("comisiones");
        System.out.println("Importe de la primera venta: "+venta1);
        System.out.println("Importe de la segunda venta: "+venta2);
        System.out.println("Importe de la tercera venta: "+venta3);


        comision = 0.1 * (venta1+venta2+venta3);
        salarioTotal = salarioBase + comision;

        System.out.println("La comision que recibira es: Q "+comision);


    }
}
