package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    public String db="hotel";
    public String url="jdbc:mysql://localhost:3306/" +db;
    public String user="root";
    public String pass="";

    public conexion() {
    }
    
    public Connection conectar(){
        Connection link=null;
        
        try {
            link=DriverManager.getConnection(this.url, this.user, this.pass);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return link;
    }
    
    public static void main(String[] args) {
        conexion con =  new conexion();
        con.conectar();
    }
    
    
}
