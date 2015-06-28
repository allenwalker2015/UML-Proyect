
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Administrar {
    
    public static Connection miConec() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/hotelBobbie";
            String driver = "com.mysql.jdbc.Driver";
            String user="root";
            String pass="root";
            Class.forName(driver);
            Connection cnx=DriverManager.getConnection(url, user, pass);
            return cnx;
        }catch(ClassNotFoundException|SQLException ex){
            ex.getMessage();
            return null;
        }
    }
    //String query="SELECT idReserva, numeroDiasReservas*precioHabitacion AS ganan FROM reserva r inner join habitacion h on r.codHabitacion=h.codHabitacion WHERE fechaReserva=?";
    public static double calcularGanancias(String mes){
        try {           
            Connection cnx = miConec();
            double sum;
            double sumT=0;
            //String sumT = 0;
            String query="SELECT idReserva, numeroDiasReservas*precioHabitacion FROM reserva r inner join habitacion h on r.codHabitacion=h.codHabitacion WHERE fechaReserva like '%/"+mes+"/%' and r.idEstReserva=3";            
            PreparedStatement ps=cnx.prepareStatement(query);
            //ps.setString(1, mes);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                sum=rs.getDouble("numeroDiasReservas*precioHabitacion");
                sumT= sumT + sum;
            }
            
            return sumT;
        } catch (SQLException ex) {
            return 0;
        }
        
    }

    public static Vector getGanancias(String mes) throws ClassNotFoundException,SQLException{
      Vector row;
      Vector reg = new Vector();

        Connection cnx=miConec();
        Statement s = cnx.createStatement();
        String query = "SELECT idReserva, precioHabitacion, numeroDiasReservas, numeroDiasReservas*precioHabitacion AS Ganancia FROM reserva r inner join habitacion h on r.codHabitacion=h.codHabitacion WHERE fechaReserva like '%/"+mes+"/%' and r.idEstReserva=3";

        ResultSet rs = s.executeQuery(query);

        while (rs.next()) {
            row = new Vector();
            row.add(rs.getString("idReserva"));
            row.add(rs.getString("precioHabitacion"));
            row.add(rs.getString("numeroDiasReservas"));
            row.add(rs.getString("Ganancia"));
            reg.add(row);

        }
        return reg;
    }
    
    public static boolean cambiarPrecioHabitacion(String cod, double newPrecio){
        try{
            Connection cnx=miConec();
            String query="UPDATE habitacion SET precioHabitacion=? where codHabitacion=?";
            PreparedStatement ps=cnx.prepareStatement(query);
            ps.setDouble(1, newPrecio);
            ps.setString(2, cod);
            ps.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static Vector getHabitaciones() throws ClassNotFoundException,SQLException{
      Vector row;
      Vector reg = new Vector();

        Connection cnx=miConec();
        Statement s = cnx.createStatement();
        String query = "SELECT codHabitacion, precioHabitacion FROM habitacion";
        ResultSet rs = s.executeQuery(query);
        while (rs.next()) {
            row = new Vector();
            row.add(rs.getString("codHabitacion"));
            row.add(rs.getDouble("precioHabitacion"));
            reg.add(row);

        }
        return reg;
    }
    
    public static boolean buscarHab(String cod){
     try{
         Connection cnx=miConec();
         boolean flag=true;
         String query="SELECT codHabitacion FROM habitacion WHERE codHabitacion=?";
         PreparedStatement ps=cnx.prepareStatement(query);
         ps.setString(1, cod);
         ResultSet rs=ps.executeQuery();
         flag=rs.next()?true:false;
         return flag;
     }catch(SQLException ex){
         System.out.println(ex.getMessage());
         return false;
     }
 }
    
    public static Vector getReservas(int est) throws ClassNotFoundException,SQLException{
      Vector row;
      Vector reg = new Vector();

        Connection cnx=miConec();
        String query = "SELECT idReserva, codHabitacion, fechaReserva, nomEstado FROM reserva r inner join estadoReserva er on r.idEstReserva=er.idEstReserva WHERE r.idEstReserva="+est;
        PreparedStatement ps=cnx.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query);
        while (rs.next()) {
            row = new Vector();
            row.add(rs.getInt("idReserva"));
            row.add(rs.getString("codHabitacion"));
            row.add(rs.getString("fechaReserva"));
            row.add(rs.getString("nomEstado"));
            reg.add(row);

        }
        return reg;
    }
    
    public static boolean buscarReserv(int id){
     try{
         Connection cnx=miConec();
         boolean flag=true;
         String query="SELECT idReserva FROM reserva WHERE idReserva=?";
         PreparedStatement ps=cnx.prepareStatement(query);
         ps.setInt(1, id);
         ResultSet rs=ps.executeQuery();
         flag=rs.next()?true:false;
         return flag;
     }catch(SQLException ex){
         System.out.println(ex.getMessage());
         return false;
     }
 }
    
    public static boolean cambiarEstadoReserva(int id){
        try{
            Connection cnx=miConec();
            String query="UPDATE reserva SET idEstReserva=2 where idEstReserva=?";
            PreparedStatement ps=cnx.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        }catch(SQLException ex){
            
            return false;
        }
    }
    
    public static boolean guardarReservacion(int id){
        try{
            Connection cnx=miConec();
            String query="UPDATE reserva SET idEstReserva=3 where idReserva=?";
            PreparedStatement ps=cnx.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        }catch(SQLException ex){
            
            return false;
        }
    }
    
    public static boolean eliminarReservacion(int id){
        try{
            Connection cnx=miConec();
            String query="UPDATE reserva SET idEstReserva=4 where idReserva=?";
            PreparedStatement ps=cnx.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        }catch(SQLException ex){
            
            return false;
        }
    }
    
    public static boolean verifReserElim(int id){
        try{
            Connection cnx=miConec();
            int x=4;
            String query="select idEstReserva from reserva where idReserva=?";
            PreparedStatement ps=cnx.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return x==rs.getInt("idEstReserva");
        }catch(SQLException ex){
            
            return false;
        }
    }
    
    public static boolean Disp(String id){
        try{
           Connection cnx = miConec();
           boolean flag=true;
           String query="SELECT idDispHabitacion FROM habitacion WHERE codHabitacion='"+id+"'";
           PreparedStatement ps = cnx.prepareStatement(query);
           ResultSet rs = ps.executeQuery();
           int n=0;
           while(rs.next()){
               n=rs.getInt("idDispHabitacion");
               System.out.println("se ejecuta la asignación: "+n);
           }
           if(n==1){
               return true;
           }else{
               return false;
           }
           
           
           
            
            //return true;
        }catch(SQLException ex){
            return false;
        }
    }
  
    public static boolean ReservarHab(Cliente c, Reserva r, String code){
        try{
           
           Connection cnx = miConec();
           String query="INSERT INTO reserva(idReserva, idCliente, codHabitacion, fechaReserva, numeroDiasReservas, idEstReserva) VALUES(?,?,?,?,?,1)";
           PreparedStatement ps = cnx.prepareStatement(query);
           ps.setInt(1, Administrar.Ret1());
           ps.setInt(2, Administrar.Ret());
           System.out.println(c.getIdCliente());
           ps.setString(3, code);//Falta el cod de Habitacion
           System.out.println(code);
           ps.setString(4, r.getFechaReserva());
           System.out.println(r.getFechaReserva());
           ps.setInt(5, r.getNumeroDiasReserva());
           System.out.println(r.getNumeroDiasReserva());
           
           ps.executeUpdate();
           
           return true;
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        
        }
    }
    
  
    
    public static boolean DatosCliente(Cliente c){
        try{
            
            Connection cnx = miConec();
            String query="INSERT INTO cliente(idCliente, nombreCliente, ApellidoCliente, tarjetaCredito) VALUES(?,?,?,?)";
            PreparedStatement ps = cnx.prepareStatement(query);
            ps.setInt(1, Administrar.Ret2());
            ps.setString(2, c.getNombreCliente());
            ps.setString(3, c.getApellidoCliente());
            ps.setString(4, c.getTarjetaCredito());
            //ResultSet rs=ps.executeQuery();
            ps.executeUpdate();

           
            return true;
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static int Ret(){
           try{
               Connection cnx = miConec();
               String query="SELECT idCliente from cliente ORDER BY idCliente DESC LIMIT 1";
               PreparedStatement ps = cnx.prepareStatement(query);
               ResultSet rs = ps.executeQuery();
               int r=0;
               while(rs.next()){
                   r=rs.getInt("idCliente");
               }
               System.out.println(r);
               return r;
               
           }catch(SQLException ex){
               return 0;
           }
    }
    public static int Ret1(){
           try{
               Connection cnx = miConec();
               String query="SELECT idReserva from reserva ORDER BY idReserva DESC LIMIT 1";
               PreparedStatement ps = cnx.prepareStatement(query);
               ResultSet rs = ps.executeQuery();
               int k=0;
               while(rs.next()){
                   k=rs.getInt("idReserva");
               }
               k=k+1;
               return k;
           }catch(SQLException ex){
               return 0;
           }
    }
    
    public static int Ret2(){
           try{
               Connection cnx = miConec();
               String query="SELECT idCliente from cliente ORDER BY idCliente DESC LIMIT 1";
               PreparedStatement ps = cnx.prepareStatement(query);
               ResultSet rs = ps.executeQuery();
               int r=0;
               while(rs.next()){
                   r=rs.getInt("idCliente");
               }
               r=r+1;
               return r;
           }catch(SQLException ex){
               return 0;
           }
    }
    
    

}
