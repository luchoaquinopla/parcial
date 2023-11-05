package com.parcial;

public class Jugador implements IJugador,IImprimible{
    private String nombre;
    private int numero;
    private String posicion;
 

    public Jugador(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

 
    public String getName() {
        return nombre;
    }
  
    public int getNumero() {
        return numero;
    }
  
    public String getPosicion(){
        return posicion;
    }
    public void setPosicion(String nuevaPosicion){
        this.posicion = nuevaPosicion;
    }
    public String impresion(){
        return "[Jugador " + getNumero() + "] " + getName() + " > " + getPosicion();
    }
}
