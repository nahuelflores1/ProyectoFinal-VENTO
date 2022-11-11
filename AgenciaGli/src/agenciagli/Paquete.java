package agenciagli;

import java.time.LocalDate;

public class Paquete {//Hecho por Ludi
    private double precio;
    private LocalDate fecha;
    private Ubicacion lugar;
    private Transporte trans;
    private Hospedaje hogar;
    //Constructor de Paquete 
    public Paquete(double precio, LocalDate fecha, Ubicacion lugar, Transporte trans, Hospedaje hogar) {
        this.precio = precio;
        this.lugar = lugar;
        this.trans = trans;
        this.hogar = hogar;
        this.fecha = fecha;
    }
    
    //Getters and Setters
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
    
    //Calculamosel total del paquete con los calcularPrecio de Transporte y Hospedaje
   public double calcularTotal(){
       double precioP=0;
       precioP=this.trans.calcularPrecioT()+this.hogar.calcularPrecioH();//sumamos los precios de los transportes y hospedajes
       //Dependiendo de a donde elija ir se leagregara un precio o otro 
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
