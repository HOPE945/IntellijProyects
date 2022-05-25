package com.zead.EjercicioTablaGrados;

import java.util.Scanner;

public class PrimerG implements TablaMulti{
    public PrimerG(){

    }

    @Override
    public void tabla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabla del 1");
        for (int i = 1; i <= 2; i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j = 1; j<=10; j++){
                System.out.println(i+ " X " + j + " = "+i*j);
            }
        }

    }

    @Override
    public int estudiantes(int estudiante) {

        return estudiante;

    }
}
