/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciagli;

/**
 *
 * @author ET36
 */
public abstract class Hospedaje  {//Hecho por Flores
    protected int habitacion;
    protected int capacidad;
    protected double precio;
    //Constructor
    public Hospedaje(int habitacion, int capacidad, double precio) {
        this.habitacion = habitacion;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    //Getters & Setters
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
    
    //Calculamos el precio del apartamento para despues sumarlo en calcularTotal (que esta en paquete)
    public abstract double calcularPrecioH();
        
        
        
    
    
    
    
    
}


