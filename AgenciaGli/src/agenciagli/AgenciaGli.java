package agenciagli;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class AgenciaGli {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean loop = true;
        int fact = 1;
        double precioTotal= 0;
        String tS="";
        String rta = "";
        LocalDate fecha=LocalDate.of(2022,07,12);
        ArrayList<Paquete>p=new ArrayList();
        while(true){
            System.out.println("Has ingresado a agencia Gli");
            Cliente cliente = crearCli();
            while(loop == true){
                Transporte t = selTrans();
                Hospedaje h = selHos();
                Paquete paquete=new Paquete(1000,t.getUbi(),t,h);

                Empleado emple1=new Empleado("Uriel","Ludi",paquete );
                Empleado emple2=new Empleado("Joaco","Preisinger",paquete );
                Empleado emple3=new Empleado("Francisco","Tato",paquete );

                p.add(paquete);
                Venta v = new Venta(cliente,emple1,fecha,fact,p);
                tS = v.toString();
                System.out.println(tS);
                precioTotal =precioTotal-precioTotal+v.getPaq();
                fact++;
                System.out.println("Quiere comprar otro paquete?");
                rta = entrada.next();
                if(rta.equalsIgnoreCase("si")){
                    loop = true;
                }
                else if(rta.equalsIgnoreCase("no")){
                    loop = false;
                }
            }
            System.out.println("Precio de todos los paquetes juntos:"+precioTotal);
            System.out.println("-----------------------------------");
        } 
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
    
    public static Hospedaje  selHos(){
     Scanner entrada = new Scanner(System.in);
     int habitacion=0;
     int capacidad=0;
     double precio=0;
     String rta="";
     int cap=0;
     boolean piscina =true;
     int val=0;
     int amb=0;
     int cam=0;
     Hospedaje h = new Hotel(0,false,0,0,0);
        System.out.println("En cual instancia quiere estar? \n1.Hotel \n2.Apartamento\n3.Hostel ");
        int opc= entrada.nextInt();
        System.out.println("Cuanta capacidad para personas quiere?");
        cap=entrada.nextInt();
        if(opc==1){
            System.out.println("Elija del 1 al 5 la valoracion del hotel");
            val=entrada.nextInt();
            System.out.println("¿Quiere Piscina?");
            rta =entrada.next();
            if(rta.equalsIgnoreCase("si")){
                piscina= true;
            }
            else if(rta.equalsIgnoreCase("no")){
                piscina= false;
            }
            h=new Hotel(val,piscina,7,cap,5000);
        }
        else if(opc==2){
            System.out.println("Cuantos ambientes quiere");
            amb=entrada.nextInt();
            System.out.println("¿Quiere piscina?");
            rta =entrada.next();
            if(rta.equalsIgnoreCase("si")){
                piscina= true;
            }
            else if(rta.equalsIgnoreCase("no")){
                piscina= false;
            }
            h=new Apartamento(amb,piscina,3,cap,3000);
        }
    
        else if(opc==3){
            System.out.println("Cuantas camas queire?");
            cam=entrada.nextInt();
            h=new Hostel(cam,12,cap,1000);
        }
        return h;
    }
}