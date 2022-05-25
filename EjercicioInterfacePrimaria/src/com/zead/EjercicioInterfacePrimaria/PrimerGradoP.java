package com.zead.EjercicioInterfacePrimaria;

import java.util.Scanner;

public class PrimerGradoP {
    public void MetodoMultiplicar() {
    }

    public static class PrimerGradoP implements MetodoMultiplicar {
        public PrimerGradoP() {

        }

        @Override
        public void tablaMultiplicar() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Tabla del 1");
            for (int i = 1; i < 10; i++) {
                System.out.println("1 X " + i + (1 * i));
            }
        }

        @Override
        public void cantidadAlumnos() {
            System.out.println("Cantidad de alumnos");
        }

    }
}
