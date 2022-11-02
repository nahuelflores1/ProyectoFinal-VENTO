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
   protected Ubicacion ubi;

    public Transporte(int cantAscientos, int idTransporte, double precio, Ubicacion ubi) {
        this.cantAscientos = cantAscientos;
        this.idTransporte = idTransporte;
        this.precio = precio;
        this.ubi=ubi;
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

    public Ubicacion getUbi() {
        return ubi;
    }

    public void setUbi(Ubicacion ubi) {
        this.ubi = ubi;
    }
    
 
   public abstract double calcularPrecioT();
       
      
   
   
   
}


