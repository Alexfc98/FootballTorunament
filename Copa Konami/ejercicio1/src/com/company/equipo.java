package com.company;

import java.util.ArrayList;

public class equipo {
    private String nombre;
    static ArrayList<equipo> arrayEquipos = new ArrayList<equipo>();

    public equipo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void setArrayEquipos(equipo e){
        arrayEquipos.add(e);
    }

    public static ArrayList<equipo> getArrayEquipos(){
        return arrayEquipos;
    }


    public static void getEquipos(){
        int contador =1;
        for(equipo e: arrayEquipos) {
            System.out.println("Participante " + contador + ": " + e.getNombre());
            contador++;
        }
    }
}
