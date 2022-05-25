package com.zead.menuparamitareaArrayList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int men = 0;

        System.out.println("Actividad ArrayList");

        while (!salir) {
            System.out.println("1. agregar un elemento");
            System.out.println("2. Buscar un elemento");
            System.out.println("3. Modificar un elemento");
            System.out.println("4. eliminar un elemento por posicion");
            System.out.println("5. Insertar en una posicion un elemento");
            System.out.println("6. Mostrar todos los elementos del ArrayList");
            System.out.println("0. Salir");
            System.out.println("ingrese el numero de la opcion que desee");
            men = sc.nextInt();

            //
            ArrayList<Integer> arrayNumeros = new ArrayList<>();
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

            int subm = 0;

            switch (men) {
                case 1:
                    do {
                        System.out.println("Elegiste agregar un elemento");
                        System.out.println("1. para agregar un elemento");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();

                        switch (subm) {
                            case 1:
                                //agregar elemento
                                for (int i = 0; i<10; i++) {
                                    arrayNumeros.add(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el elemento que quiere agregar: "+i)));
                                }
                        }

                    } while (subm != 0);
                    break; //

                case 2:
                    //Buscar un elemento
                    do {
                        System.out.println("Elegiste Buscar un elemento");
                        System.out.println("1. para Buscar un elemento");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();

                        switch (subm) {
                            case 1:
                                //contains me devuelve un boolean, entonces puede ser true o false
                                boolean busqueda = arrayNumeros.contains(3);
                                if (busqueda==true){
                                    arrayNumeros.add(Integer.valueOf(JOptionPane.showInputDialog("Este es el resultado de tu: "+busqueda)));
                                }else{
                                    JOptionPane.showMessageDialog(null, "Error", "Tu busqeda no produjo resulado", JOptionPane.ERROR_MESSAGE);
                                }

                                }

                    } while (subm != 0);
                    break; //
                case 3:
                    //Modificar un elemento
                do {
                    System.out.println("Elegiste modificar un elemento");
                    System.out.println("1. para modificar un elemento");
                    System.out.println("0. Salir");
                    subm = sc.nextInt();

                    switch (subm) {
                        case 1:
                            //modificar
                            double valorAnteriror, nuevoValor;
                            int indice;

                            System.out.println("valor que quiere modifiar; ");
                            valorAnteriror = sc.nextInt();
                            indice = arrayNumeros.indexOf(valorAnteriror);
                            if (indice !=-2){
                                System.out.println("Nuevo valor");
                                nuevoValor= sc.nextInt();
                                arrayNumeros.set(1,100);

                            }else{
                                System.out.println("Datos no encontrados");
                            }


                            }



                } while (subm != 0);
                break; //

                case 4:
                    //Eliminar un elemento por posicion
                    do {
                        System.out.println("Elegiste eliminar un elemento por posicion");
                        System.out.println("1. para eliminar un elemento por posicion");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();

                        switch (subm) {
                            case 1:
                                for (int i = 0; i<10; i++) {
                                    arrayNumeros.add(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el elemeto que quiere agregar: "+i)));
                                }

                        }

                    } while (subm != 0);
                    break; //

                case 5:
                    ///insertar en una posicion un elemento
                    do {
                        System.out.println("Elegiste insertar en una posicion un elemento");
                        System.out.println("1. para insertar en una posicion un elemento");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();


                        switch (subm) {
                            case 1:
                                arrayNumeros.add(4,100);
                                for (int i = 0; i<10; i++) {
                                    arrayNumeros.add(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el elemento y la posision "+i)));
                                }

                        }

                    } while (subm != 0);
                    break; //

                case 6:
                    do {

                        //mostrar todos los elementos del ArrayList
                        for (int i = 0; i<arrayNumeros.size(); i++){
                            System.out.println("La posicion es: "+i+" = "+arrayNumeros.get(i));
                        }

                        break;
                    }while (subm!=0);
                    break;

                // ultima linea
                case 0:
                    salir=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error", "Fuera de rango", JOptionPane.ERROR_MESSAGE);
                    break;
            }//es es el switch de menu


        }//este es el while de salir






    }
}
