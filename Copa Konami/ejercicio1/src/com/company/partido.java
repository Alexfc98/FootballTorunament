package com.company;

import java.util.Random;

public class partido {

    private Participante equipo1;
    private Participante equipo2;
    private Participante ganador;

    public partido(Participante equipo1, Participante equipo2, Participante ganador) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.ganador = ganador;
    }

    public Participante getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Participante equipo1) {
        this.equipo1 = equipo1;
    }

    public Participante getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Participante equipo2) {
        this.equipo2 = equipo2;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }

    public static Participante Ganador (Participante a, Participante b){
        Random r = new Random();
        int x = r.nextInt(a.getMedia());
        int y = r.nextInt(b.getMedia());
        int z = r.nextInt(2);
        if(x > y){
            return a;
        } else if(x<y){
            return b;
        } else if(z>0){
            return a;
        } else return b;
    }
}
