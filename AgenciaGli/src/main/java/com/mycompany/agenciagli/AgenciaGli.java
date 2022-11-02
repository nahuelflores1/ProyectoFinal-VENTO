/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.agenciagli;

import java.util.Scanner;

/**
 *
 * @author ET36
 */
public class AgenciaGli {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Has ingresado a agencia Gli");
        Cliente cliente = crearCli();
        Transporte t = selTrans();
    }
    public static Cliente crearCli(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int dni;
        int tel;
        System.out.println("Ingrese su nombre:");
        nombre = entrada.next();
        System.out.println("Ingrese su apellido:");
        apellido = entrada.next();
        System.out.println("Ingrese su dni:");
        dni = entrada.nextInt();
        System.out.println("Ingrese su tel:");
        tel = entrada.nextInt();
        Cliente c = new Cliente(nombre, apellido,dni,tel);
        return c;
    }
    public static Ubicacion selUbi(){
        Scanner entrada = new Scanner(System.in);
        String destino="";
        int distancia=0;
        System.out.println("Elija un Paquete \n 1.Bariloche \n 2.Jujuy \n 3. Tierra del Fuego");
        int opc = entrada.nextInt();
        if(opc==1){
            destino="Bariloche";
            distancia=1575;
        }
        else if(opc==2){
            destino="Jujuy";
            distancia=1515;
        }
    
        else if(opc==3){
            destino="Tierra del Fuego";
            distancia=3026;
        }
         Ubicacion u =new Ubicacion(destino,distancia);
         return u;
        
    }
    
    
    
    public static Transporte selTrans(){
        Scanner entrada = new Scanner(System.in);
       int cantAsientos=0;
       int id=0;
       String rta="";
       double precio=0;
       boolean clase= true;
       Ubicacion ubi = selUbi();
       Transporte t = new Avion(true,0,0,0,ubi);
       
        System.out.println("Elija Transporte \n1.Avion  \n 2.Micro \n 3.Tren");
        int opc=entrada.nextInt();
        System.out.println("Elija la cantidad de asientos");
        int a = entrada.nextInt();
        
        
        
        if(opc==1){
            System.out.println("¿Quiere priemera clase?");
            rta =entrada.next();
            if(rta.equalsIgnoreCase("si")){
                clase= true;
            }
            else if(rta.equalsIgnoreCase("no")){
                clase= false;
            }
            t= new Avion(clase,a,8164619,60000,ubi);
        }
        else if(opc==2){
            System.out.println("¿Quiere coche cama?");
            rta =entrada.next();
            if(rta.equalsIgnoreCase("si")){
                clase= true;
            }
            else if(rta.equalsIgnoreCase("no")){
                clase= false;
            }
            t= new Micro(clase,a,4535488,30000,ubi);
        }
    
        else if(opc==3){
            System.out.println("¿Quiere priemera clase?");
            rta =entrada.next();
            if(rta.equalsIgnoreCase("si")){
                clase= true;
            }
            else if(rta.equalsIgnoreCase("no")){
                clase= false;
            }
            t = new Tren(clase,a,8164619,15000,ubi);
        }
        return t;
    }
    
}
