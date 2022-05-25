package com.zead.ejercicioAl;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        byte men = 0;

        System.out.println("Actividad ArrayLis");

        while (!salir) {
            men = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menu\n"
                            + "ELIJA UNA OPCION\n"
                            + "1. Agregar un elemento\n"
                            + "2. Buscar un elemento\n"
                            + "3. Modificar un elemento\n"
                            + "4. Eliminar un elemento\n"
                            + "5. Insertar en un aposision un elemento\n"
                            + "6. Mostrar todos los elementos\n"
                            + "0. Salir"
            ));


            switch (men) {

                case 1:
                    //declarando toda
                    JOptionPane.showMessageDialog(null, "Agregar un elemento al ArrayList");
                    ArrayList<Integer> arrayNumeros = new ArrayList<>();


                    if (men==1){
                        //agregar un elemento
                        arrayNumeros.add(1);
                        arrayNumeros.add(2);
                        arrayNumeros.add(3);
                        arrayNumeros.add(4);
                        arrayNumeros.add(5);
                        arrayNumeros.add(6);
                        arrayNumeros.add(7);
                        arrayNumeros.add(8);
                        arrayNumeros.add(9);
                        arrayNumeros.add(10);

                        for (int i = 0; i<10; i++) {
                            arrayNumeros.add(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el elemeto que quiere agregar: "+i)));

                        }
                    }
                    else if (men==2){
                        //Buscar un elemento
                        JOptionPane.showMessageDialog(null, "Buscar un elemento del ArrayList");
                    }
                    else if(men==3) {
                        //Modificar un elemento
                        JOptionPane.showMessageDialog(null, "Modificar un elemento del ArrayList");
                    }
                    else if (men==4){
                        //Eliminar un elemento por posicion
                        JOptionPane.showMessageDialog(null, "Eliminar un elemento del ArrayList");
                    }
                    else if (men==5){
                        //insertar en una posicion un elemento
                        JOptionPane.showMessageDialog(null, "Insertar un elemento por posicion al ArrayList");
                        arrayNumeros.add(11,111);
                        arrayNumeros.add(0, 888);

                    }
                    else if (men ==6){
                        //mostrar todos los elementos del ArrayList
                        JOptionPane.showMessageDialog(null, "Mostrar todos del elementos del ArrayList");
                       JOptionPane.showMessageDialog(null,arrayNumeros.get(0));
                    }else{

                    }

                    break;//esta es mi tarea
                case 0:
                    salir=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error", "Fuera de rango", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        }
    }
}
