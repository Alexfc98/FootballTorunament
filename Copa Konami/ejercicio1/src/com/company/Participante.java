package com.company;

import java.util.ArrayList;
import java.util.List;

public class Participante extends equipo{

    private int media;

    public Participante(String nombre,int media) {
        super(nombre);
        this.media=media;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    static Participante RMA = new Participante("RMA",95);
    static Participante FCB = new Participante("FCB",90);
    static Participante ATM = new Participante("ATM",60);
    static Participante MCI = new Participante("MCI",98);
    static Participante LIV = new Participante("LIV",90);
    static Participante CHE = new Participante("CHE",85);
    static Participante JUV = new Participante("JUV",65);
    static Participante MIL = new Participante("MIL",62);
    static Participante BAY = new Participante("BAY",94);
    static Participante BOR = new Participante("BOR",55);
    static Participante MUN = new Participante("MUN",65);
    static Participante PSG = new Participante("PSG",92);
    static Participante INT = new Participante("INT",68);
    static Participante NAP = new Participante("NAP",50);
    static Participante TOT = new Participante("TOT",53);
    static Participante ARS = new Participante("ARS",62);

    public static ArrayList<Participante> getParticipantes(){
        ArrayList<Participante> list = new ArrayList<>();

        list.add(RMA);
        list.add(FCB);
        list.add(ATM);
        list.add(MCI);
        list.add(LIV);
        list.add(CHE);
        list.add(JUV);
        list.add(MIL);
        list.add(BAY);
        list.add(BOR);
        list.add(MUN);
        list.add(PSG);

        list.add(INT);
        list.add(NAP);
        list.add(TOT);
        list.add(ARS);

        return list;
    }

    public static void printParticipantes(){
        for( Participante e: getParticipantes()){
            System.out.println(e.getNombre());
        }
    }
}




