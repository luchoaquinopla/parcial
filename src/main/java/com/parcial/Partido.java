package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class Partido {

    private Equipo local;
    private Equipo visitante;
    private String nombrePart;
     private List<TarjetaBase> tarjetas;
     private Estadio estadio;
     private Arbitro arbitro;
     private List<Arbitro> arbitroLinea;
     private Arbitro arbitroAsistente;

    public Partido(Equipo local, Equipo visitante,String nombrePart){
        this.local = local;
        this.visitante = visitante;
        this.nombrePart = nombrePart;
        this.tarjetas = new ArrayList<>();
        this.tarjetas = new ArrayList<>();
        this.arbitroLinea = new ArrayList<>();

    }
     public Partido(Estadio estadio, Equipo local, Equipo visitante,String nombrePart ){
        this.estadio = estadio;
        this.local = local;
        this.visitante = visitante;
        this.nombrePart = nombrePart;
        this.tarjetas = new ArrayList<>();
        this.tarjetas = new ArrayList<>();
        this.arbitroLinea = new ArrayList<>();
       

    }
      public Partido(Estadio estadio, Equipo local, Equipo visitante,String nombrePart, Arbitro arbitro, Arbitro arbitroAsistente ){
        this.estadio = estadio;
        this.local = local;
        this.visitante = visitante;
        this.nombrePart = nombrePart;
        this.tarjetas = new ArrayList<>();
        this.tarjetas = new ArrayList<>();
        this.arbitroLinea = new ArrayList<>();
        this.arbitro = arbitro;
        this.arbitroAsistente = arbitroAsistente;

    }
    public Equipo getLocal(){
        return local;
    }
     public Equipo getVisitante(){
        return visitante;
    }
    public String getNombrePart() {
        return nombrePart + " " + local.getAbreviatura() + "x" + visitante.getAbreviatura();
    }
    public void agregar(TarjetaBase tarjeta) {
        tarjetas.add(tarjeta);
    }

    public List<TarjetaBase> getTarjetas() {
        return tarjetas;
    }
    public int tarjetasCantidad() {
        return tarjetas.size();
    }
    public Estadio getEstadio(){
        return estadio;
    }
    public Arbitro getArbitro(){
        return arbitro;
    }
    public Arbitro getArbitroAsistente(){
        return arbitroAsistente;
    }
    public List<Arbitro> getArbitros(){
        return arbitroLinea;
    }
     public void agregarArbitro(Arbitro arbitro) {
        arbitroLinea.add(arbitro);
    }
    public int arbitroCantidad(){
        return arbitroLinea.size();
    }
}

