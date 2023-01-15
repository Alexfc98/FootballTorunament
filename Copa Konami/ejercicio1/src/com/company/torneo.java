package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class torneo {

    private static Participante ganadorTorneo;

    public static equipo getGanadorTorneo() {
        return ganadorTorneo;
    }

    public void simulaTorneo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Participantes: ");
        Participante.printParticipantes();
        System.out.println("Pulse Enter para comenzar.");
        String a = sc.next();

        ArrayList<partido> arrayRonda1 = utilities.organizaRonda(Participante.getParticipantes());
        ArrayList<Participante> GanaRonda = new ArrayList<>();

        int contador0=1;
        for(partido e: arrayRonda1){

            System.out.println("Partido  " + contador0 + ": "+ e.getEquipo1().getNombre() + " vs " + e.getEquipo2().getNombre());
            System.out.println("Ganador: " + e.getGanador().getNombre());
            GanaRonda.add(e.getGanador());
            contador0++;
        }

        System.out.println("Primera Ronda concluida.");

        for(equipo e: GanaRonda){
            System.out.println("Pasa a la siguiente ronda: " + e.getNombre());
        }

        String continuar;
        System.out.println("Pulse 'Enter' para continuar");
        continuar = sc.next();

        do{
        ArrayList<partido> arrayRonda = utilities.organizaRonda(GanaRonda);

        int contador=1;
        for(partido e: arrayRonda){

            System.out.println("Partido  " + contador + ": "+ e.getEquipo1().getNombre() + " vs " + e.getEquipo2().getNombre());
            System.out.println("Ganador: " + e.getGanador().getNombre());
            GanaRonda.add(e.getGanador());
            contador++;
        }

        System.out.println("Ronda concluida.");

        for(equipo e: GanaRonda){
            System.out.println("Pasa a la siguiente ronda: " + e.getNombre());
        }

        String continuare;
        System.out.println("Pulse 'C' para continuar");
        continuare = sc.next();
        if(GanaRonda.size() ==1){
            ganadorTorneo = GanaRonda.get(0);
        }
    }while(ganadorTorneo == null);

        System.out.println("Ganador del torneo: " + torneo.getGanadorTorneo().getNombre());

    }

}

