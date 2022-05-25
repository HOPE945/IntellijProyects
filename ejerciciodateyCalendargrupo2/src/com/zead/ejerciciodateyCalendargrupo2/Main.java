package com.zead.ejerciciodateyCalendargrupo2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
public class Main {
    public static void main (String []args)     {
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("Fecha actual: "+ c1.getTime().toString());
        c1.set(2000, Calendar.AUGUST, 31);

        System.out.println("Fecha 31 Agosto 2000: "+ c1.getTime().toString());
        c1.set(Calendar.MONTH, 2); //
        System.out.println("Fecha 2 meses más: "+ c1.getTime().toString());

        c1.add(Calendar.MONTH, 13); /* aqui se estan sumando 13 meses */
        System.out.println("Fecha 13 meses más: "+ c1.getTime().toString());
        c1.roll(Calendar.HOUR, 25); /* Añadir 25 horas */
        System.out.println("Fecha 25 horas más: "+ c1.getTime().toString());    /*uso de roll*/

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy"); // aqui le defino el formato

        System.out.println("Fecha Formateada: "+sdf.format(c1.getTime()));

    }

}