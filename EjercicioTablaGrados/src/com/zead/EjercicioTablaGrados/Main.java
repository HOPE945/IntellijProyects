package com.zead.EjercicioTablaGrados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PrimerG p = new PrimerG();
        SegundoG s = new SegundoG();
        TercerG t = new TercerG();
        CuartoG c = new CuartoG();
        QuintoG q = new QuintoG();
        SextoG sg = new SextoG();



            Scanner sc = new Scanner(System.in);
            int op;
            System.out.println("Tablas de multiplicacion para primaria ");
            System.out.println("1. Primer grado ");
            System.out.println("2. Segundo grado ");
            System.out.println("3. Tercer grado ");
            System.out.println("4. Cuarto grado ");
            System.out.println("5. Quindo grado ");
            System.out.println("6. Sexto grado ");
            System.out.println("7. Salir ");
            System.out.println("Ingrese el numero que pertenece a su grado ");
            op = sc.nextInt();

            try {

                while (op > 0 && op <= 6) {

                    switch (op) {
                        case 1:
                            System.out.println("Tablas de multiplicar para primer grado ");
                            p.tabla();
                            System.out.println("Numero de estudiantes del grado " + p.estudiantes(20));
                            break;

                        case 2:
                            System.out.println("Tablas de multiplicar para segundo grado ");
                            s.tabla();
                            System.out.println("Numero de estudiantes del grado " + s.estudiantes(14));
                            break;

                        case 3:
                            System.out.println("Tablas de multiplicar para tercer grado ");
                            t.tabla();
                            System.out.println("Numero de estudiantes del grado " + t.estudiantes(18));
                            break;

                        case 4:
                            System.out.println("Tablas de multiplicar para cuarto grado ");
                            c.tabla();
                            System.out.println("Numero de estudiantes del grado " + c.estudiantes(19));
                            break;

                        case 5:
                            System.out.println("Tablas de multiplicar para quinto grado ");
                            q.tabla();
                            System.out.println("Numero de estudiantes del grado " + q.estudiantes(20));
                            break;

                        case 6:
                            System.out.println("Tabla de multiplicar para sexto grado ");
                            sg.tabla();


                            break;
                        default:
                            System.out.println("Opcion no valida ");
                            break;



                    }
                    System.out.println("Ingrese el numero que pertenece a su grado ");
                    op = sc.nextInt();


                }
            } catch (Exception e) {
                System.err.println("Ocurrio un error");
            }








    }


}
