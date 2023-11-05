package com.parcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo implements IImprimible{
    private String nombre;
    private String abreviatura;
    private List<IJugador> jugadores;

    public Equipo(String nombre, String abreviatura){
        this.nombre = nombre;
        this.abreviatura = abreviatura;
         this.jugadores = new ArrayList<>();
    }
    
    public String getName(){
        return nombre;
    }
    
     public String getAbreviatura(){
        return abreviatura;
    }
    public List<IJugador> getJugadores() {
        return jugadores;
    }
    public void agregar(IJugador jugador) {
        jugadores.add(jugador);
    }
    public int jugadoresCantidad(){
        return jugadores.size();
    }
    public IJugador obtenerJugador(int numeroCamiseta) {
        for (IJugador jugador : jugadores) {
            if (jugador.getNumero() == numeroCamiseta) {
                return jugador;
            }
        }
        return null; 
}

public String imprimirPlantel(){
    StringBuilder plantel = new StringBuilder();
    for (int i = 0; i < jugadores.size(); i++) {
        IJugador jugador = jugadores.get(i);
        if(jugador == obtenerJugador(19)){
            continue;
        }
        String jug = "[" + jugador.getNumero() + "] " + jugador.getName() + " (" + jugador.getPosicion() + ")";
        plantel.append(jug);
        if (i < jugadores.size()) {
        plantel.append(", ");
        }
    }for (int i = 0; i < jugadores.size(); i++) {
        IJugador jugador = jugadores.get(i);
        if(jugador == obtenerJugador(19)){
             String jug = "[" + jugador.getNumero() + "] " + jugador.getName() + " (" + jugador.getPosicion() + ")";
            plantel.append(jug);
        }
    }
    return plantel.toString();
}
    public String impresion(){
        return "[Equipo] " + getName() + " > " + getAbreviatura();
    }
}
