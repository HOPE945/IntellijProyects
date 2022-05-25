package com.zead.EjercicioInterfacePrimaria;

public class SextoGradoP {
    public static class TercerGradoP implements MetodoMultiplicar {
        public TercerGradoP(){

        }

        @Override
        public void tablaMultiplicar() {

        }

        @Override
        public void cantidadAlumnos() {

        }
    }

    public static interface MetodoMultiplicar {
        public void tablaMultiplicar();
        public void cantidadAlumnos();

    }
}
