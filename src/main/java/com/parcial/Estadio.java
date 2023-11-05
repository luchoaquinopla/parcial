package com.parcial;

public class Estadio implements IImprimible{
    private String nombreEstadio;
    private String ciudad;
    private String pais;
    
    public Estadio(String nombreEstadio, String ciudad, String pais){
        this.nombreEstadio = nombreEstadio;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    public String getNombreEstadio(){
        return nombreEstadio;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getPais(){
        return pais;
    }
    @Override
    public String toString(){
        return "" + nombreEstadio + ", " + ciudad + " "  + "("+pais+")";
    }
    public String impresion(){
        return "[Estadio] " + getNombreEstadio() + " (" + getCiudad() + " - " + getPais() + ")";
}
}
