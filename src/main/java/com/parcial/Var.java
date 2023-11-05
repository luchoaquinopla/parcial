package com.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Var {
    private Partido partido;
    private AsistenteDeVideo asistenteDeVideo;
    private List<AVAR> aVar;
  
    public Var(Partido partido){
        this.partido = partido;
        this.aVar = new ArrayList<>();
    }
    public int cantidadTarjetasAmarillas() {
        Predicate<TarjetaBase> tarjetas = tarjeta -> tarjeta.getColor().contains("AMARILLA");
        int tarjetaAmarillas = Math.toIntExact(partido.getTarjetas().stream().filter(tarjetas).count()); 
        return tarjetaAmarillas;
    }
    public int cantidadTarjetasRojas() {
        Predicate<TarjetaBase> tarjetas = tarjeta -> tarjeta.getColor().contains("ROJA");
        int tarjetaRojas = Math.toIntExact(partido.getTarjetas().stream().filter(tarjetas).count()); 
        return tarjetaRojas;
    }
    public int cantidadTarjetas(Equipo equipo){
        List<TarjetaBase> listaTarjetas = new ArrayList<>();
        Predicate<TarjetaBase> buscarTarjeta = tarjeta -> equipo.getJugadores().contains(tarjeta.getJugador());
        listaTarjetas.addAll(partido.getTarjetas().stream().filter(buscarTarjeta).collect(Collectors.toList()));
        return listaTarjetas.size();
    }
    
}
