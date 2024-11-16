package Controlador;

import DAO.HabitacionDAO;
import DAO.HabitacionDAOImpl;
import Modelo.vhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fhabitacion {
    
 private final HabitacionDAO habitacionDAO = new HabitacionDAOImpl();
    public int totalregistros;
    
    public DefaultTableModel mostrar(String buscar) {
        return habitacionDAO.mostrar(buscar);
    }

    public DefaultTableModel mostrarvista(String buscar) {
        return habitacionDAO.mostrarvista(buscar);
    }

    public boolean insertar(vhabitacion dts) {
        return habitacionDAO.insertar(dts);
    }

    public boolean editar(vhabitacion dts) {
        return habitacionDAO.editar(dts);
    }

    public boolean desocupar(vhabitacion idhabitacion) {
        return habitacionDAO.desocupar(idhabitacion);
    }

    public boolean ocupar(vhabitacion idhabitacion) {
        return habitacionDAO.ocupar(idhabitacion);
    }

    public boolean eliminar(vhabitacion idhabitacion) {
        return habitacionDAO.eliminar(idhabitacion);
    }

    public vhabitacion buscarPorId(int idhabitacion) {
        return habitacionDAO.buscarPorId(idhabitacion);
    }

      public int getTotalRegistros() {
        return totalregistros;
    }
    
    
}
