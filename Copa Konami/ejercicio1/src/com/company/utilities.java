package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class utilities {

    public static  boolean esPotencia(double nEquipos){
        if(nEquipos == 1){
            return true;
        } else if (nEquipos >1 && nEquipos <2){
            return false;
        } else if(nEquipos>=2){
            return esPotencia(nEquipos/2);
        } else return false;
    }

    public static ArrayList <partido> organizaRonda(ArrayList<Participante> e){

            ArrayList<partido> arrayRonda = new ArrayList<partido>();
            Participante equipoRandom;
            Participante equipoRandom2;
            final int tam = e.size();

            for(int i =0; i<tam/2;i++){
                Random n = new Random();
                int x= n.nextInt(e.size());
                int y=n.nextInt(e.size());
                equipoRandom = e.get(x);

                do{
                if(y!=x){
                y=y;
                }else {
                    y=n.nextInt(e.size());
                }
                }while (y==x);

                equipoRandom2= e.get(y);

                partido partido1 = new partido(equipoRandom,equipoRandom2, partido.Ganador(equipoRandom,equipoRandom2));
                arrayRonda.add(partido1);
                e.remove(equipoRandom);
                e.remove(equipoRandom2);
            }
            return arrayRonda;
    }

}



