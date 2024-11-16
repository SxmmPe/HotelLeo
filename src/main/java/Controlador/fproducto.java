package Controlador;

import DAO.ProductoDAO;
import DAO.ProductoDAOImpl;
import Modelo.vhabitacion;
import Modelo.vproducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fproducto {
    
    private final ProductoDAO productoDAO= new ProductoDAOImpl();
    public int totalregistros;
    
    public DefaultTableModel mostrar(String buscar) {
        return productoDAO.mostrar(buscar);
    } 
        public boolean insertar(vproducto dts) {
        return productoDAO.insertar(dts);
    }

    public boolean editar(vproducto dts) {
        return productoDAO.editar(dts);
    }

    public boolean eliminar(vproducto dts) {
        return productoDAO.eliminar(dts);
    }
}
