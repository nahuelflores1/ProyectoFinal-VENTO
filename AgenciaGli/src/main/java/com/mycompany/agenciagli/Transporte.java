package com.mycompany.agenciagli;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ET36
 */
public abstract  class Transporte {
   protected int cantAscientos;
   protected int idTransporte;
   protected double precio;

    public Transporte(int cantAscientos, int idTransporte, double precio) {
        this.cantAscientos = cantAscientos;
        this.idTransporte = idTransporte;
        this.precio = precio;
    }

    public int getCantAscientos() {
        return cantAscientos;
    }

    public void setCantAscientos(int cantAscientos) {
        this.cantAscientos = cantAscientos;
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
   public double calcularPrecio(){
       
       return 0;
       
   }
   
   
   
}


