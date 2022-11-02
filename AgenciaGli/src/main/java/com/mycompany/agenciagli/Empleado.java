/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciagli;

/**
 *
 * @author ET36
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private  int sueldo=70000;
    private Paquete paquete;

    public Empleado(String nombre, String apellido,Paquete paquete) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paquete=paquete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

public double calcularComision(){
    double total = 0;
    
    double desc = (this.paquete.calcularTotal()*100)/2;
    total=desc + this.sueldo;
        return total;
    
}

}



