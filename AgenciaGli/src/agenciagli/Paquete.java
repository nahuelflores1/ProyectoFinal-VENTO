/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciagli;

import java.time.LocalDate;

/**
 *
 * @author ET36
 */
public class Paquete {
    private double precio;
    private LocalDate fecha=LocalDate.now();
    private Ubicacion lugar;
    private Transporte trans;
    private Hospedaje hogar;

    public Paquete(double precio, Ubicacion lugar, Transporte trans, Hospedaje hogar) {
        this.precio = precio;
        this.lugar = lugar;
        this.trans = trans;
        this.hogar = hogar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Ubicacion getLugar() {
        return lugar;
    }

    public void setLugar(Ubicacion lugar) {
        this.lugar = lugar;
    }

    public Transporte getTrans() {
        return trans;
    }

    public void setTrans(Transporte trans) {
        this.trans = trans;
    }

    public Hospedaje getHogar() {
        return hogar;
    }

    public void setHogar(Hospedaje hogar) {
        this.hogar = hogar;
    }
    
   public double calcularTotal(){
       double precioP=0;
       precioP=this.trans.calcularPrecioT()+this.hogar.calcularPrecioH();
       if(this.lugar.getDestino().equalsIgnoreCase("bariloche")){
           precioP+=50000;
       }
      else if(this.lugar.getDestino().equalsIgnoreCase("jujuy")){
           precioP+=40000;
       }
      else if(this.lugar.getDestino().equalsIgnoreCase("tierra del fuego")){
           precioP+=60000;
       }
  
       return precioP;
   }
}
