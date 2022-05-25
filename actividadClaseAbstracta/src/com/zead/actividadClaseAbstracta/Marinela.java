package com.zead.actividadClaseAbstracta;

import com.zead.actividadClaseAbstracta.DatosTrabajador;

public class Marinela extends DatosTrabajador {

    //constructor vacio
    public Marinela(){

    }

    public void salarioAnualM(){
        double salarioBase =3000;
        double salarioTotal=salarioBase*12;

        System.out.println("\n Salario que recibira el 2022: Q "+salarioTotal);

    }

    @Override
    public void comision() {

        double comision;
        double venta1 = 2000;
        double venta2 = 1877;
        double venta3 = 2000;


        System.out.println("comisiones");
        System.out.println("Importe de la primera venta: " + venta1);
        System.out.println("Importe de la segunda venta: " + venta2);
        System.out.println("Importe de la tercera venta: " + venta3);


        comision = 0.2 * (venta1 + venta2 + venta3);


        System.out.println("La comision que recibira es: Q " + comision);

    }
}
