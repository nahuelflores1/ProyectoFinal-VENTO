/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciagli;

/**
 *
 * @author ET36
 */
public abstract class Hospedaje  {
    protected int habitacion;
    protected int capacidad;
    protected double precio;

    public Hospedaje(int habitacion, int capacidad, double precio) {
        this.habitacion = habitacion;
        this.capacidad = capacidad;
        this.precio = precio;
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
 
    public double calcularPrecio(){
        
        return 0;
        
    }
    
    
    
    
}


