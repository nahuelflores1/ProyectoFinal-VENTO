/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciagli;

/**
 *
 * @author ET36
 */
public class Avion extends Transporte {
    private boolean primeraClase;

    public Avion(boolean primeraClase, int cantAscientos, int idTransporte, double precio,Ubicacion ubi) {
        super(cantAscientos, idTransporte, precio,ubi);
        this.primeraClase = primeraClase;
    }

    public boolean getPrimeraClase() {
        return primeraClase;
    }

    public void setPrimeraClase(boolean primeraClase) {
        this.primeraClase = primeraClase;
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
    

   public double calcularPrecio(){
      
if(primeraClase){
            this.precio+=100000;
        }
        if(this.ubi.getDistancia()<=100){// se calcula el precio mediante los kilometros
            this.precio+=60000;
        }
        else{
            if(this.ubi.getDistancia()<=1000){
            this.precio+=100000;
            }
            else{
                this.precio+=180000;
            }    
            
    
    }
        return this.precio;
   }
    
}
