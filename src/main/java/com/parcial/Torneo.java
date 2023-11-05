package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private String nombre;
        private List<Equipo> equipos;
        private List<Partido> partidos;

    public Torneo(String nombre){
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }
    public String getName(){
        return nombre;
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public void agregar(Equipo equipo) {

        equipos.add(equipo);
    }
    public void agregar(Partido partido) {
        partidos.add(partido);
    }
    public int equiposCantidad() {
        return equipos.size();
    }
    public int partidosCantidad(){
        return partidos.size();
    }
     public List<Partido> getPartidos() {
        return partidos;
    }
}
