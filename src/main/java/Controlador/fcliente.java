package Controlador;

import DAO.ClienteDAO;
import DAO.ClienteDAOImpl;
import Modelo.vcliente;
import Modelo.vproducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fcliente {

     private final ClienteDAO clienteDAO = new ClienteDAOImpl();
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo = clienteDAO.mostrar(buscar);
        if (modelo != null) {
            totalregistros = modelo.getRowCount();
        } else {
            totalregistros = 0;
        }
        return modelo;
    }

    public boolean insertar(vcliente dts) {
        return clienteDAO.insertar(dts);
    }

    public boolean editar(vcliente dts) {
        return clienteDAO.editar(dts);
    }

    public boolean eliminar(vcliente dts) {
        return clienteDAO.eliminar(dts);
    }
}
