package com.zead.EjercicioTablaGrados;

import java.util.Scanner;

public class SextoG implements TablaMulti {
    public SextoG() {

    }

    @Override
    public void tabla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabla del 1");
        for (int i = 1; i <= 20; i++) {
            System.out.println("Tabla de multiplicar del " + i);
            for (int j = 1; j <= 20; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }

    }

    @Override
    public int estudiantes(int estudiante) {

        return estudiante;
    }
}
