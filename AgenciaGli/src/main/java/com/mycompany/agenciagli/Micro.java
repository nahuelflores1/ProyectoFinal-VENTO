/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciagli;

/**
 *
 * @author ET36
 */
public class Micro extends Transporte {
    private boolean cocheCama;

    public Micro(boolean cocheCama, int cantAscientos, int idTransporte, double precio) {
        super(cantAscientos, idTransporte, precio);
        this.cocheCama = cocheCama;
    }

    public boolean isCocheCama() {
        return cocheCama;
    }

    public void setCocheCama(boolean cocheCama) {
        this.cocheCama = cocheCama;
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
