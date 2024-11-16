package Controlador;

import DAO.ReservaDAO;
import DAO.ReservaDAOImpl;
import Modelo.vhabitacion;
import Modelo.vproducto;
import Modelo.vreserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class freserva {
    
  private final ReservaDAO reservaDAO = new ReservaDAOImpl();
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo = reservaDAO.mostrar(buscar);
        if (modelo != null) {
            totalregistros = modelo.getRowCount();
        } else {
            totalregistros = 0;
        }
        return modelo;
    }

    public boolean insertar(vreserva dts) {
        return reservaDAO.insertar(dts);
    }

    public boolean editar(vreserva dts) {
        return reservaDAO.editar(dts);
    }

    public boolean eliminar(vreserva dts) {
        return reservaDAO.eliminar(dts);
    }
    
     public boolean pagar(vreserva dts) {
        return reservaDAO.pagar(dts);
    }
    
}
