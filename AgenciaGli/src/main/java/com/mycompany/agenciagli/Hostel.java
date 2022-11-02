/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciagli;

/**
 *
 * @author ET36
 */
public class Hostel extends Hospedaje  {
    private int cantCamas;

    public Hostel(int cantCamas, int habitacion, int capacidad, double precio) {
        super(habitacion, capacidad, precio);
        this.cantCamas = cantCamas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
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
        if(this.cantCamas>=1){
            this.precio+=4000;
        }
        else{
            if(this.cantCamas>=2){
                this.precio+=6000;
                }
        }
                    
        return this.precio;
    }
    
    
    
    
}
