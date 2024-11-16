package Controlador;

import DAO.TrabajadorDAO;
import DAO.TrabajadorDAOImpl;
import Modelo.vcliente;
import Modelo.vproducto;
import Modelo.vtrabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ftrabajador {

    private final TrabajadorDAO trabajadorDAO = new TrabajadorDAOImpl();
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo = trabajadorDAO.mostrar(buscar);
        if (modelo != null) {
            totalregistros = modelo.getRowCount();
        } else {
            totalregistros = 0;
        }
        return modelo;
    }

    public DefaultTableModel login(String login, String password) {
        DefaultTableModel modelo = trabajadorDAO.login(login, password);

        if (modelo != null ) {
           totalregistros = modelo.getRowCount();
        } else {
            totalregistros = 0;
        }
        return modelo;
    }

    public boolean insertar(vtrabajador dts) {
        return trabajadorDAO.insertar(dts);
    }

    public boolean editar(vtrabajador dts) {
        return trabajadorDAO.editar(dts);
    }

    public boolean eliminar(vtrabajador dts) {
        return trabajadorDAO.eliminar(dts);
    }


    }  