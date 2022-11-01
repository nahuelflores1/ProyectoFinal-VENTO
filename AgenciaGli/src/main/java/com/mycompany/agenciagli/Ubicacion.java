/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciagli;

/**
 *
 * @author ET36
 */
public class Ubicacion {
    private String origen;
    private String destino ;
    private int distancia;
    

    public Ubicacion(String origen, String destino,int distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia=distancia;
        
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(int distancia){
        this.distancia=distancia;
    }

public int getDistancia(){
  
    return this.distancia;
}
    

}
