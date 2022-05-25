package com.zead;



public class Main {
//cuando escribi el replace, medio error, porque me altero el mpublic static void, lo arregle escribiendo la linea 7
    public static void main(String[] args) {
	// write your code here
        //Ejercicio 1
        //Variables
        /*int edad = 20;
        String nombre = "Hanna";
        int anio = 2022;
        String apellido = "Morales";
        int precio = 10;
        String color = "verde";
//Rango de datos
        //byte b = 127;
       // short s = 32767;
       // int i = 2147483647;
        //Ejercicio 2

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 52323232376375834l;
        float f = 3.2f;
        double d1 = 1.65;
        char c1 = 123;
        char c2 = '@';
        boolean b1 = true;
        boolean b2 = false;


//Mostrar

        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(anio);
        System.out.println(apellido);
        System.out.println(precio);
        System.out.println(color);
        System.out.println(b);
        System.out.println(s); */


//Ejercicio3
// suma
        /*int s1 = 2;//declaracion de variable
        int s2 = 5;//declaracion de variable
        int suma; //declaracion de variable
         //aqui estoy llamando a la variable
        suma = s1 + s2; //funcionalidad
//resta
        int r1 = 2;
        int r2 = 7;
        int resta;
        resta = r1 - r2;
//multiplicacion
        double m1 = 100;
        double m2 = 100;
        double producto;
        producto = m1 * m2;
//division
        double n1 = 15;
        double n2 = 3;
        double division;
        division = n1 / n2;
//residuo
        double r4 = 10;
        double r5 = 5;
        double residuo;
        residuo = r4 % r5;



        System.out.println(suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(division);
        System.out.println(residuo);*/

        //ejemplo con String
        String cadena1 = "Hola ";
        String cadena2 = "como estas";
        String cadena3 = "espero estes bien ";
        String cadena4 = "y todo este de maravilla ";
        int anio= 2022;
        int mes = 02;
        //concatenation
        System.out.println(cadena1 + cadena2 + cadena3 + cadena4);
        System.out.println(anio + mes);
        //contar el tamaño
        System.out.println(cadena1.length());
        System.out.println(cadena3.length());
//reemplazar
        System.out.println(cadena4.replace("maravilla", "exitoso"));
        System.out.println(cadena2.replace("como", "donde"));


    }
}
