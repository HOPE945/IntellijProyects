package com.zead.EjercicioPOO;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your code here

     OperacionesAritmeticas operaciones = new OperacionesAritmeticas();
     Condicionales condicion =new Condicionales(); //if y switch
     EstructurasControl control =new EstructurasControl(); //for
     EstructurasControl2 estruc = new EstructurasControl2(); //while
     Arreglos arreglos =new Arreglos();
     Matrices matrices =new Matrices();



        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("--- Operacines aritmeticas ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("--- Condicion ---");
        System.out.println("5. Estructura If");
        System.out.println("6. Switch Case");
        System.out.println("--- Ciclos ---");
        System.out.println("7. For");
        System.out.println(" Otros");
        System.out.println("8. While");
        System.out.println("9. Arreglos");
        System.out.println("10. Matrices");
        System.out.println("Elige una opcion ");


        op= sc.nextInt();

        while(op > 0 && op <=10){

            switch (op){
                case 1:
                    System.out.println("Eligio suma ");
                    System.out.println("Ingrese el primer numero");
                    operaciones.d1 =sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    operaciones.d2 =sc.nextInt();
                    System.out.println("El resultado de la suma es: "+operaciones.suma());

                    break;

                case 2:
                    System.out.println("Eligio resta ");
                    System.out.println("Ingrese el numero ");
                    int a = sc.nextInt();
                    System.out.println("Ingrese el numero a restar");
                    int b = sc.nextInt();
                    System.out.println("El resultado de la resta es: "+operaciones.resta(a,b));
                    break;

                case 3:
                    try{
                        System.out.println("Eligio Multiplicacion");
                        operaciones.multi();

                    }catch(Exception e){
                        e.getMessage();
                        System.err.println("Solo debe ingresar numeros enteros");
                    }
                    break;

                case 4:
                    System.out.println("Eligio Division");
                    System.out.println("Ingrese el primer numero");
                    operaciones.d1= sc.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    operaciones.d2= sc.nextDouble();
                    System.out.println("El resultado de la Division es: "+operaciones.division());
                    break;

                case 5:

                    System.out.println("Eligio estructura If");
                    System.out.println("Compararemos 2 numeros, ingrese el primero");
                    condicion.cond1= sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    condicion.cond2= sc.nextInt();
                    System.out.println();
                    if(condicion.cond1 == condicion.cond2){
                        System.out.println(condicion.cond1+" si es igual a "+condicion.cond2);

                    }else{
                        System.out.println(condicion.cond1+" no es igual a "+condicion.cond2);
                    }
                    break;

                case 6:
                    System.out.println("Eligio Switch");
                    condicion.switchC();
                    break;

                case 7:
                    System.out.println("eligio el ciclo For ");
                    control.ciclFor();
                    break;

                case 8:
                    System.out.println("Eligio ciclo While");
                    estruc.ciclWhile();
                    break;

                case 9:
                    System.out.println("Eligio Arreglos, aqui puede agregar elementos a un ArrayList");
                    arreglos.arrayL();

                    break;
                case 10:
                    System.out.println("Eligio Matrices ");
                    matrices.matriz();

                    break;

                default:
                    throw new IllegalStateException("Su busqueda no dio resltado: " + op);
            }
            System.out.println("Elige una opcion ");
            op= sc.nextInt();

        }

    }


}
