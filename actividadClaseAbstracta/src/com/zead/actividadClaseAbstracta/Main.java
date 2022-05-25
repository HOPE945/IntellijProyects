package com.zead.actividadClaseAbstracta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// i
        Scanner sc = new Scanner(System.in);

        int op;
        System.out.println("Empresas ");
        System.out.println("1. Navisco ");
        System.out.println("2. Pozuelo ");
        System.out.println("3. Marinela ");
        System.out.println("Ingrese el numero que corresponde a la empresa");
        op = sc.nextInt();

        while (op > 0 && op <=3){
            switch (op){
                case 1:
                    Navisco n = new Navisco();
                    System.out.println("Eligio la empresa Navisco S.A. ");
                    System.out.println("--------------Datos del empleado----------------");
                    System.out.println(n.nombre="Nombre: Luis Jose");
                    System.out.println(n.apellido="Apellido: De Paz Alfaro");
                    System.out.print("Edad ");
                    System.out.println(n.edad=45);
                    System.out.println(n.direccion="Direccion: 4ta. avenida 5-55 Zona 1, Ciudad de Guatemala");
                    System.out.println("Sueldo Q "+(n.sueldo=5000));
                    System.out.println("------------salario total por año -------------");
                    n.salarioAnualN();
                    System.out.println("------------------Comision---------------------");
                    n.comision();

                    break;

                case 2:
                    Pozuelo p = new Pozuelo();
                    System.out.println("Eligio la empresa Pozuelo S.A. ");
                    System.out.println("--------------Datos del empleado----------------");
                    System.out.println(p.nombre="Nombre: Marvin Esahu ");
                    System.out.println(p.apellido="Apellido: Lopez Mendez ");
                    System.out.print("Edad ");
                    System.out.println(p.edad=30);
                    System.out.println(p.direccion="Direccion: 4ta. avenida 5-55 Zona 1, Ciudad de Guatemala");
                    System.out.println("Sueldo Q "+(p.sueldo= 4300));
                    System.out.println("------------salario total por año -------------");
                    p.salarioAnualP();
                    System.out.println("------------------Comision---------------------");
                    p.comision();


                    break;

                case 3:
                    Marinela m = new Marinela();
                    System.out.println("Eligio la empresa Marinela S.A. ");
                    System.out.println("--------------Datos del empleado----------------");
                    System.out.println(m.nombre="Nombre: Maria Luisa");
                    System.out.println(m.apellido="Escobar Pernillo");
                    System.out.print("Edad ");
                    System.out.println(m.edad=22);
                    System.out.println(m.direccion="Direccion: 12 avenida 21-12 Zona 5, Ciudad de Guatemala");
                    System.out.println("Sueldo Q "+(m.sueldo=3000));
                    System.out.println("------------salario total por año -------------");
                    m.salarioAnualM();
                    System.out.println("------------------Comision---------------------");
                    m.comision();
                    break;

            }
            System.out.println("Ingrese el numero que corresponde a la empresa");
            op = sc.nextInt();

        }






    }
}
