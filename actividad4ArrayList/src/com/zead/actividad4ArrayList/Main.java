package com.zead.actividad4ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> arrayNumeros = new ArrayList<>();
        boolean salir=false;
        byte option=0;
        do{
            option=Byte.parseByte(JOptionPane.showInputDialog(
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



            switch (option){
                //agregar un elemento
                case 1:
                    int datoNuevo=0;
                    arrayNumeros.add(7);
                    arrayNumeros.add(97);
                    arrayNumeros.add(77);
                    arrayNumeros.add(40);
                    arrayNumeros.add(76);
                    arrayNumeros.add(73);
                    arrayNumeros.add(80);
                    arrayNumeros.add(88);
                    arrayNumeros.add(2);
                    arrayNumeros.add(32);
                    arrayNumeros.add(127);

                            datoNuevo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento que agregara"));
                            arrayNumeros.add(datoNuevo);
                            JOptionPane.showMessageDialog(null, "Dat ingresado correctamente: "+datoNuevo);

                    break;
                case 2:
                    //Buscar un elemento
                    int buscar=0;
                    buscar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento que desea buscar"));
                    arrayNumeros.contains(buscar);
                    if (arrayNumeros.contains(buscar)){
                        JOptionPane.showMessageDialog(null,"Elemento "+ buscar+" Encontrado");
                    }else{
                        JOptionPane.showMessageDialog(null,"No se encontro el elemento "+buscar);
                    }

                    break;
                case 3:
                    //modificar un elemento
                    int modificar=0;
                    int nuevoDato=0;
                    modificar=Integer.parseInt(JOptionPane.showInputDialog("Elija el elemento a modificar"));
                    int posicion=arrayNumeros.indexOf(modificar);


                    nuevoDato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo dato"));
                    arrayNumeros.set(posicion,nuevoDato);


                    break;
                case 4:
                    //elieminar un elemento
                    int elimina=0;//objeto

                    elimina=Integer.parseInt(JOptionPane.showInputDialog("Elija el elemento a eliminar"));
                    int posicio=arrayNumeros.indexOf(elimina);
                    arrayNumeros.remove(posicio);
                    JOptionPane.showMessageDialog(null, "Elemento eliminado correctamente");

                    break;
                case 5:
                    //insertar en una posociion un elemento
                    JOptionPane.showMessageDialog(null, "Insertar un elemento por posicion al ArrayList");
                    int pos = 0;
                    pos=Integer.parseInt(JOptionPane.showInputDialog("Elija la posicion"));
                    int nueDat=0;
                    nueDat=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo dao"));
                    arrayNumeros.add(nueDat);

                    break;
                case 6:
                    //mostrar todos los elementos


                    JOptionPane.showMessageDialog(null, "Mostrar todos del elementos del ArrayList");


                    for (Integer numero: arrayNumeros){
                        JOptionPane.showMessageDialog(null, arrayNumeros);
                    }


                    break;
                case 0:
                    salir=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        }while(option!=0);
        System.exit(0);

    }
}
