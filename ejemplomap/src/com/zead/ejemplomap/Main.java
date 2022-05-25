package com.zead.ejemplomap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Map, no acepta llaves duplicadas ni valores nulos
        //si se duplica la llave, los que hace es que solo muestra la ultima ocurrencnc
        //
        //HashMap, no preciso ordenarlo, pero para tenerlo ordenado yo lo puedo hacer en orden o aleatorio
        Map<Integer,String> mapH = new HashMap<>();
        mapH.put(101,"Motor");
        mapH.put(104,"Llantas");
        mapH.put(102,"Motor");//este no lo toma en cuenta, porque esta repetido
        mapH.put(101,"Motor");

        //obtener tamaño del map
        System.out.println(mapH.size());
        //si esta vacia
        System.out.println(mapH.isEmpty());
        //muestra el valor que tiene asignada la clave
        System.out.println(mapH.get(101));
        //limpia lo tengo comenado porque sino me borra lo borra
        //     mapH.clear();
        //remueve tanto clave como valor
        System.out.println(mapH.remove(102));
        //valida si la clave existe en el map
        System.out.println(mapH.containsKey(101));
        //valida si existe en el mapa
        System.out.println(mapH.values());
        //values muestra todas las posiciones, solo guarda un valor
        System.out.println(mapH.values());
        
        //Recorrido del map
        System.out.println("Recorrido ");
        for (Map.Entry<Integer, String> mapHR: mapH.entrySet()) {
            Integer key = mapHR.getKey();
            String value = mapHR.getValue();
            System.out.println(key +"---"+value);
        }
        
        

        System.out.println("______________sepadador ____________________\n");

        //treeMap aqui estoy llenando claves y valores de tipo String
        Map<String, String> mapT = new TreeMap<>();
        mapT.put("P1", "Motherboard");
        mapT.put("P7", "SSD");
        mapT.put("P3", "Memoria RAM");
        mapT.put("P9", "Fuente de Poder");
        mapT.put("P5", "Procesador");

        //Tamaño del Map
        System.out.println(mapT.size());

        //si esta vacio
        System.out.println(!mapT.isEmpty());

        //Muestra el valor que tiene asignada
        System.out.println(mapT.get("p50"));

        //Limpiar map, clear remueve tanto clave como valor
        //mapT.clear();
        //System.out.println(mapT.remove(""));

        //Valida si la clave existe en el map
        System.out.println(mapT.containsKey("P3"));

        //valida si el valor existe en el map
        System.out.println(mapT.containsValue("Procesado"));

        //Muestra en una coleccion los valores del map

        System.out.println(mapT.values());
        
        //Recorrer el map
        System.out.println("--------------Separador----------------");
        for (Map.Entry<String, String> mapTR : mapT.entrySet()) {
            String key = mapTR.getKey();
            String value = mapTR.getValue();
            System.out.println(key + "---"+value);
        }

        



    }
}
