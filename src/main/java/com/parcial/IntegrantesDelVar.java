package com.parcial;

public abstract class IntegrantesDelVar extends ArbitroBase{
    public String tipoAsistente;
    public IntegrantesDelVar(String tipoAsistente){
        setTipoAsistente(tipoAsistente);
    }
    public String getTipoAsistente(){
        return tipoAsistente;
    }
    public void setTipoAsistente(String tipoAsistente) {
        this.tipoAsistente = tipoAsistente;
    }
    
    
}
