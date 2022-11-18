package accesoDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import agenciagli.Apartamento;
import agenciagli.Avion;
import agenciagli.Cliente;
import agenciagli.Empleado;
import agenciagli.Hospedaje;
import agenciagli.Hostel;
import agenciagli.Hotel;
import agenciagli.Micro;
import agenciagli.Paquete;
import agenciagli.Transporte;
import agenciagli.Tren;
import agenciagli.Ubicacion;
import agenciagli.Venta;

public class AccesoDatos {
    private Connection conn;
    private Statement comandos;
    
    public AccesoDatos(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/paquetesturisticos",
                                            "root", "");
            comandos=conn.createStatement();
        }catch(ClassNotFoundException ex){
            System.out.println("Error: no encontro la BD");
        }catch(SQLException ex){
            System.out.println("Error: usuario o pass incorrectos");
        }
    }
    
    public void insertarCliente(Cliente cli){
        String sql="call crearCliente("+cli.getDni()+", '"+cli.getNombre()+"', '"+cli.getApellido()+"', "+cli.getTelefono()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    public void insertarEmpleado(Empleado emp){
        String sql="call crearEmpleado('"+emp.getNombre()+"', '"+emp.getApellido()+"', "+emp.getSueldo()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarUbicacion(Ubicacion ubi){
        String sql="call crearUbicacion("+ubi.getOrigen()+"', '"+ubi.getDestino()+"', "+ubi.getDistancia()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarAvion(Avion avi){
        String sql="call crearAvion("+avi.getPrimeraClase()+", "+avi.getPrecio()+", "+avi.getCantAscientos()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarMicro(Micro mic){
        String sql="call crearMicro("+mic.isCocheCama()+", "+mic.getPrecio()+", "+mic.getCantAscientos()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarTren(Tren tr){
        String sql="call crearTren("+tr.getPrimeraClase()+", "+tr.getPrecio()+", "+tr.getCantAscientos()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarHotel(Hotel hot){
        String sql="call crearHotel("+hot.getValoracion()+", "+hot.getPiscina()+", "+hot.getHabitacion()+", "+hot.getCapacidad()+", "+hot.getPrecio()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarHostel(Hostel host){
        String sql="call crearHostel("+host.getCantCamas()+", "+host.getHabitacion()+", "+host.getCapacidad()+", "+host.getPrecio()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarApartamento(Apartamento ap){
        String sql="call crearApartamento("+ap.getAmbientes()+", "+ap.getPiscina()+", "+ap.getHabitacion()+", "+ap.getCapacidad()+", "+ap.getPrecio()+");";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarPaquete(Paquete pa){
        String sql="call crearPaquete("+pa.getPrecio()+", "+pa.getFecha()+", '"+pa.getLugar().getOrigen()+" // "+pa.getLugar().getDestino()+"', '"+pa.getTrans()+"', '"+pa.getHogar()+"');";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
    public void insertarVenta(Venta ven, Paquete pa){
        String sql="call crearVenta('"+ven.getCli().getNombre()+" "+ven.getCli().getApellido()+"', '"+ven.getEmple().getNombre()+" "+ven.getEmple().getApellido()+"', "+ven.getFecha()+", "+pa.getLugar().getOrigen()+" // "+pa.getLugar().getDestino()+", '"+pa.getTrans()+"', '"+pa.getHogar()+"');";
        System.out.println(sql);
        try{
            comandos.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Error en la sintaxis SQL");
        }
    }
    
}
