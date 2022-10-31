/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciagli;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Venta {
    private Cliente cli;
    private Empleado emple;
    private LocalDate fecha;
    private int nroFact;
    private ArrayList<Paquete>paquete;

    public Venta(Cliente cli, Empleado emple, LocalDate fecha, int nroFact, ArrayList<Paquete> paquete) {
        this.cli = cli;
        this.emple = emple;
        this.fecha = fecha;
        this.nroFact = nroFact;
        this.paquete = paquete;
    }

    

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Empleado getEmple() {
        return emple;
    }

    public void setEmple(Empleado emple) {
        this.emple = emple;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNroFact() {
        return nroFact;
    }

    public void setNroFact(int nroFact) {
        this.nroFact = nroFact;
    }


public double calcularPago(){
    
        return 0;
    
}
    
    
    
}



