package com.zead.ejerciciostring;

public class Main {

    public static void main(String[] args) {
	// write your code here
String nombre = "Hanna ";
String apellido = "Morales, ";
String edad = "20 años, ";
String genero = "Femenino, ";
String estudios = "Estudiante de Auxiliar de Enfermeria, ";
String auto = "mi auto favorito 325 CI de BMW, ";
String color = "color favorito es el naranja, ";
String comida = "mi comida favorita es el tapado. ";

System.out.println("Hola soy " + nombre +
        apellido + "tengo "+ edad + genero + estudios + auto + color + comida);
//Mayusculas
        System.out.println(nombre.toUpperCase()+apellido.toUpperCase()+edad.toUpperCase()
                +genero.toUpperCase()+estudios.toUpperCase()+auto.toUpperCase()+color.toUpperCase()
                +comida.toUpperCase());

//Minusculas
        System.out.println(nombre.toLowerCase()+apellido.toLowerCase()+edad.toLowerCase()+genero.toLowerCase()
        +estudios.toLowerCase()+auto.toLowerCase()+color.toLowerCase()+comida.toLowerCase());



    }
}
