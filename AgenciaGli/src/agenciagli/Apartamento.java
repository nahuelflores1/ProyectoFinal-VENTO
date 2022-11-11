/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciagli;

/**
 *
 * @author ET36
 */
public class Apartamento extends Hospedaje  {//Hecho por Flores
    private int ambientes;
    private boolean piscina;
    //Constructor
    public Apartamento(int ambientes, boolean piscina, int habitacion, int capacidad, double precio) {
        super(habitacion, capacidad, precio);
        this.ambientes = ambientes;
        this.piscina = piscina;
    }
    
    //Getters & Setters
    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int monoAmbientes) {
        this.ambientes = ambientes;
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
        if(this.ambientes>=1){
            precioH+=30000;
            
        }
      
        if(this.ambientes>=3){
                precioH+=60000;
                
   
            }
       
        
        if(this.piscina){
          precioH+=10000;
            
        }
        
        return  precioH;
    }
}
