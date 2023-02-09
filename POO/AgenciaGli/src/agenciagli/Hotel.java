/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciagli;

/**
 *
 * @author ET36
 */
public class Hotel extends Hospedaje {//Hecho por Flores
    private int valoracion;
    private boolean piscina;
    //Constructor
    public Hotel(int valoracion, boolean piscina, int habitacion, int capacidad, double precio) {
        super(habitacion, capacidad, precio);
        this.valoracion = valoracion;
        this.piscina = piscina;
    }
    //Getters & Setters
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
    
    
    //Calculamos el precio del apartamento para despues sumarlo en calcularTotal (que esta en paquete)
    public double calcularPrecioH(){
        double precioH = this.precio;
        if(this.valoracion>=1){
            precioH+=15000;
        }
       if(this.valoracion>=2){
           precioH+=20000;
           
       }
       if(this.valoracion>=3){
           precioH+=30000;
       }
       if(this.valoracion>=4){
           precioH+=40000;
       }
       if(this.valoracion>=5){
           precioH+=50000;
       }
        return precioH;
    }
    
}
