/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciagli;

/**
 *
 * @author ET36
 */
public class Hostel extends Hospedaje  {//Hecho por Flores
    private int cantCamas;
    //Cosntructor
    public Hostel(int cantCamas, int habitacion, int capacidad, double precio) {
        super(habitacion, capacidad, precio);
        this.cantCamas = cantCamas;
    }
    //Getters & Setters
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
    //Calculamos el precio del apartamento para despues sumarlo en calcularTotal (que esta en paquete)
    public double calcularPrecioH(){
        double precioH = this.precio;
        if(this.cantCamas>=1){
            precioH+=4000;
        }
        else{
            if(this.cantCamas>=2){
                precioH+=6000;
                }
        }
                    
        return precioH;
    }
    
    
    
    
}
