package com.zead.metodosgregoriancalendarG2;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date f=new Date();
        GregorianCalendar gc=new GregorianCalendar();
        gc.setTime(f);
        //muestra la fecha

        //System.out.println(f);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        System.out.println("La fecha es: "+sdf.format(f));
    }
}
