package Controlador;

import DAO.ConsumoDAO;
import DAO.ConsumoDAOImpl;
import Modelo.vconsumo;
import Modelo.vhabitacion;
import Modelo.vproducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fconsumo {
    
    private final ConsumoDAO consumoDAO= new ConsumoDAOImpl();
    public int totalregistros;
    public double totalconsumo;
    

    public boolean insertar(vconsumo dts) {
        return consumoDAO.insertar(dts);
    }

    public boolean editar(vconsumo dts) {
        return consumoDAO.editar(dts);
    }

    public boolean eliminar(vconsumo dts) {
        return consumoDAO.eliminar(dts);
    }
    private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","idreserva","idproducto","producto","cantidad","Precio Venta","Estado"};
       
       String [] registro =new String [7];
       
       totalregistros=0;
       totalconsumo=0.0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select c.idconsumo,c.idreserva,c.idproducto,p.nombre,c.cantidad,c.precio_venta "
               + ",c.estado from consumo c inner join producto p on c.idproducto=p.idproducto"
               + " where c.idreserva ="+ buscar + " order by c.idconsumo desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idconsumo");
               registro [1]=rs.getString("idreserva");
               registro [2]=rs.getString("idproducto");
               registro [3]=rs.getString("nombre");
               registro [4]=rs.getString("cantidad");
               registro [5]=rs.getString("precio_venta");
               registro [6]=rs.getString("estado");
               
               totalregistros=totalregistros+1;
               totalconsumo=totalconsumo + (rs.getDouble("cantidad") * rs.getDouble("precio_venta") );
               
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }   
       
   } 
}
