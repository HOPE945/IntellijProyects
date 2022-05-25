package com.zead.actividadahd2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Actividad 2 ahd2
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int men =0;

        System.out.println("Estructuras de control");

        while(!salir){
            System.out.println("1. Estructura if");
            System.out.println("2. Estructura else if");
            System.out.println("3. Switch Case");
            System.out.println("4. Ciclo for");
            System.out.println("5. Ciclo while");
            System.out.println("6. Ciclo do while");
            System.out.println("0. Salir");
            System.out.println("ingrese el numero de la opcion que desee");
            men = sc.nextInt();

            int subm=0;

            switch (men){
                case 1:
                    do{
                        System.out.println("Seleccionaste if, buena eleccion");
                        System.out.println("1. Comparar numeros");
                        System.out.println("2. verificar su un numero es par o impar ");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();

                        switch (subm){
                            case 1:
                                int subm2 = 0;
                                int n1;
                                int n2;

                                System.out.println("Comparar numeros");
                                System.out.println("Ingrese el primer numero");
                                n1 = sc.nextInt();
                                System.out.println("Ingrese el segundo numero");
                                n2 = sc.nextInt();
                                if (n1 == n2){
                                    System.out.println("Los numeros son iguales");
                                }
                                else{
                                    System.out.println("Los numeros no son iguales");
                                }

                                break;//aqui termina el case 1 del ejercicio if

                            case 2:

                                System.out.println("verificar su un numero es par o impar");
                                int num1;
                                int num2;

                                System.out.println("Ingrese dos numeros para saber si son par o impar");
                                num1 = sc.nextInt();
                                while (subm!=0) {
                                    if (num1 %2==0){
                                        System.out.println("Numero " + num1 + " par ");
                                    } else{
                                        System.out.println("Numero " + num1 + " impar ");
                                    }
                                    num2 = sc.nextInt();
                                    if (num2 %2==0){
                                        System.out.println("Numero " + num2 + " par");
                                    } else{
                                        System.out.println("Numero " + num2 + " impar");
                                    }
                                    break;

                                }

                            case 0:
                                break;
                            default:
                                System.out.println("Opcion no valida, intente de nuevo...");
                                break;
                        }

                    }while(subm != 0);

                case 2:

                    do{
                        System.out.println("Seleccionaste else if, buena eleccion");
                        System.out.println("1. contador de cifras");
                        System.out.println("2. Ordenar numeros del mayor al menor");
                        System.out.println("3. Lagos mas Conocidos de Guatemala");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();

                        switch (subm) {
                            case 1:

                                int num1;
                                System.out.println("Contador de cifras");
                                System.out.println("Ingrese un numero entre 0 a 9999");
                                num1 = sc.nextInt();
                                if (num1>=0 && num1<=9){
                                    System.out.println("El numero " + num1 + " tiene una cifra");
                                }
                                else if (num1>=10 && num1<=99){
                                    System.out.println("El numero " + num1 + " tiene dos cifras");
                                }
                                else if (num1>=100 && num1<=999){
                                    System.out.println("El numero "+ num1 + " tiene tres cifras");
                                }
                                else{
                                    System.out.println("Ingreso un numero incorrecto");
                                }

                                break;

                            case 2:

                                System.out.println("Ordenar numeros del mayor al menor");
                                int n1 = 0;
                                int n2 = 0;
                                int n3 = 0;
                                System.out.println("Ingrese 3 numeros para que sean ordenados de mayor a menor");
                                System.out.println("Pirmer numero ");
                                n1 = sc.nextInt();
                                System.out.println("Segundo numero ");
                                n2 = sc.nextInt();
                                System.out.println("Tercer numero ");
                                n3 = sc.nextInt();

                                System.out.println("Los numeros de mayor a menor son: ");

                                if (n1>=n2 && n2>=n3){
                                    System.out.println(n1+" "+n2 +" "+n3);
                                } else if (n1>=n3 && n3>=n2){
                                    System.out.println(+n1 +" "+n3 +" " +n2);
                                } else if (n2>=n3 && n3>=n1){
                                    System.out.println(+n2 +" "+n3 +" " +n1);
                                } else if (n3>=n1 && n1>=n2){
                                    System.out.println(+n3 +" "+n1 +" " +n2);
                                } else {
                                    System.out.println(n3 +" " + n2 + " "+ n1);
                                }

                                break;
                            case 3:
                                int n6;
                                System.out.println("Lagos mas conocidos de Guatemala");
                                System.out.println("ingrese un numero del 1 al 5");
                                n6 = sc.nextInt();

                                if (n6 == 1){
                                    System.out.println("Lago de Izabal");
                                }
                                else if (n6 == 2){
                                    System.out.println("Lago de Atitlan");
                                }
                                else if (n6 == 3){
                                    System.out.println("Lago Penten Itza");
                                }
                                else if (n6 == 4){
                                    System.out.println("El Golfete");
                                }
                                else if (n6 == 5){
                                    System.out.println("Amatitlan");
                                }
                                else{
                                    System.out.println("NUMERO FUERA DE RANGO");
                                }

                                break;
                            case 0:
                                break;
                        }
                    }while(subm != 0);

                    break;
                case 3: //case de



                    break;
                case 4:
                    do{
                        System.out.println("Seleccionaste Ciclo for, buena eleccion");
                        System.out.println("1. Suma de 2 numeros");
                        System.out.println("2. Generador de numeros ");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();

                        switch (subm) {
                            case 1:
                                System.out.println("Suma de 2 numeros");
                                int dato;
                                int suma = 0;
                                for (int i =0; i< 2; i++){
                                    System.out.println("Ingrese los numeros a sumar");
                                    dato = sc.nextInt();

                                    suma = suma + dato;

                                }
                                System.out.println("La suma es: "+ suma);

                                break;
                            case 2:
                                System.out.println("Gernerador de numeros");
                                System.out.println("Ingrese el numero con el que quiere que inicie");
                                int ini = sc.nextInt();
                                System.out.println("Ingrese el numero con el que quiere finalizar");
                                int fin = sc.nextInt();
                                for (int i = ini; i<=fin; i++){
                                    System.out.println(""+i);

                                }
                                break;

                            case 0:
                                break;
                        }
                    }while(subm != 0);
                    break;
                case 5:
                    do{
                        System.out.println("Seleccionaste Ciclo while, buena eleccion");
                        System.out.println("1. Mostrar numeros del 1 al 10");
                        System.out.println("2. Tabla de multiplicacion de un numero");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();
                        switch (subm) {
                            case 1:
                                int num4;
                                int cuadrado;

                                System.out.println("Mostrar numeros del 1 al 10");

                                int n = 1;
                                while (n <= 10){
                                    System.out.print(n);
                                    System.out.print(", ");
                                    n++;
                                }
                                System.out.println();
                                break;


                            case 2:
                                int t1 = 1;
                                System.out.println("Ingrese un numero entero positivo para ver la tabla de ese numero");
                                int num5 = sc.nextInt();
                                while (t1 <=10) {
                                    System.out.println(num5 + " X " + t1 + " = " + num5 * t1);
                                    t1++;
                                }break;//

                            case 0:
                                break;
                        }
                    }while(subm != 0);
                    break;

                case 6:

                    do{
                        System.out.println("Seleccionaste Ciclo do while, buena eleccion");
                        System.out.println("1. Multiplicacion de numero");
                        System.out.println("2. Clasificacion de peso para exportacion ");
                        System.out.println("0. Salir");
                        subm = sc.nextInt();
                        switch (subm) {
                            case 1:
                                int dw1;
                                int dw2;
                                int dw3;
                                int dw4;
                                do {
                                    System.out.println("Multiplicacion de numeros");
                                    System.out.println("Ingrese un numero entero entre 1 y 10 (0 para salir)");
                                    dw1 = sc.nextInt();

                                    if (dw1 >= 1 && dw1<=10){
                                        dw2 = dw1*10;
                                        dw3 =dw1*100;
                                        dw4 = dw1*500;
                                        System.out.println("El numero " +dw1 +" X " + "10 " + "es: " + dw2);
                                        System.out.println("El numero "+ dw1 +" X " + "100" + "es: " + dw3);
                                        System.out.println("El numero " + dw1 +" X "+ "500" + "es: "+ dw4);
                                    } else {
                                        System.out.println("Dato fuera de rango");
                                    }

                                }while (dw1!=0);
                                break;

                            case 2:
                                int dw5;
                                int dw6;
                                int dw7;

                                float p;
                                dw5 = 0;
                                dw6 = 0;
                                dw7 = 0;


                                do {
                                    System.out.println("Clasificador y contador de sandias aptas para exportacion " +
                                            "segun su peso en Kg. ");
                                    System.out.print("Ingrese el peso de la sandia: (0 para salir)");
                                    p= sc.nextFloat();
                                    if (p>=12){
                                        dw5++;
                                    }else{
                                        if (p>=6 && p<=11){
                                            dw6++;
                                        }else{
                                            if (p>0){
                                                dw7++;
                                            }
                                        }
                                    }
                                }while (p!=0);
                                int suma2 = dw5+dw6+dw7;
                                System.out.println("Cantidad de sandias procesadas" + suma2+ "de las cuales: ");
                                System.out.println("Sandia grande: Aptas para exportacion: " +dw5);
                                System.out.println("Sandia mediana: Apta para exportacion: " + dw6);
                                System.out.println("Sandias pequeñas NO aptas para exportacion " +dw7);
                                break;
                            case 0:
                                break;
                        }
                    }while(subm != 0);

                    break;
                case 0:
                    salir=true;
                    break;
                default:
                    System.out.println("Dato fuera de rango");
                    break;

            }

        }


    }

    public static void compararNumeros(){

    }
}
