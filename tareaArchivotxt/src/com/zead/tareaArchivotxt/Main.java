package com.zead.tareaArchivotxt;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //escritura y lectura de mi archivo

        Scanner sc = new Scanner(System.in);

        //FileWrite crea mi archivo
        FileWriter fw;
        //PrintWrite agrega informacion al archivo
        PrintWriter pw;

        //

        try {
            //fw = new FileWriter(" C:\\Users\\peace\\Desktop\\paratxt ");
            fw = new FileWriter(" C:\\Users\\peace\\Desktop\\paratxt ", true);
            pw = new PrintWriter(fw);

            String nombre;
            String apellido;
            String ciudad;

            //pidiendo datos personales
            System.out.println("Ingrese su nombre");
            nombre=sc.next();
            System.out.println("Ingrese su apellido");
            apellido = sc.next();
            System.out.println("Ingrese la ciudad");
            ciudad = sc.next();

            //concatencion para mostrar

            pw.println("Nombre: "+nombre);
            pw.println("Apellido: "+apellido);
            pw.println("Coudad donde vive: "+ciudad);

            //recorrido del 0 al 100

            for (int i = 0; i<=100; i++){
                pw.println();
            }

            //arrego de 5 double

            double[] dimension = new double[5];

            dimension[0]=3.1416;
            dimension[1]=2;
            dimension[2]=3;
            dimension[3]=4;
            dimension[4]=5;
            //recorro aqui mi double
            for (int i=0; i<5; i++){

            }






            pw.println("Cambiarlo despues");
            for (int i=0; i<= 10; i++){
                pw.println("Linea que tengo que borrar"+i);
            }
            fw.close();

        }catch (Exception | ExceptionInInitializerError e){
        }



    }
}
