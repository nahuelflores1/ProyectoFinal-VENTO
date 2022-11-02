/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciagli;

/**
 *
 * @author ET36
 */
public class Hotel extends Hospedaje {
    private int valoracion;
    private boolean piscina;

    public Hotel(int valoracion, boolean piscina, int habitacion, int capacidad, double precio) {
        super(habitacion, capacidad, precio);
        this.valoracion = valoracion;
        this.piscina = piscina;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    public double calcularPrecioH(){
        
        if(this.valoracion>=1){
            this.precio+=15000;
        }
       if(this.valoracion>=2){
           this.precio+=20000;
           
       }
       if(this.valoracion>=3){
           this.precio+=30000;
       }
       if(this.valoracion>=4){
           this.precio+=40000;
       }
       if(this.valoracion>=5){
           this.precio+=50000;
       }
        
        
        return this.precio;
    }
    
}
