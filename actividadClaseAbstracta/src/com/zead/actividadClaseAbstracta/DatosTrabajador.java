package com.zead.actividadClaseAbstracta;

public abstract class DatosTrabajador {

    //en esas si se pueden declarar variaboes y metodos. no deben llevar cuerpo solo definirlos
    // variables que le va a heredar a las clases hijas
    public String nombre;
    public String apellido;
    public Integer edad;
    public String direccion;
    public double sueldo;

    //mi constructor vacio
    public DatosTrabajador(){

    }

    //este es un metodo abstracto y se peden declarar los que sean necesario
    public abstract void comision();
}
