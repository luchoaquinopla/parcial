package com.parcial;

public class Tarjeta {
    private Jugador jugador;
    private String tipoTarjeta;
    public Tarjeta( String tipoTarjeta, Jugador jugador){
        this.jugador = jugador;
        this.tipoTarjeta = tipoTarjeta;
    }
public String gettipoTarjeta(){
    return tipoTarjeta;
}
public Jugador getJugador() {
    return jugador;
}
}
