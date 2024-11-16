package DAO;

import Modelo.vhabitacion;
import javax.swing.table.DefaultTableModel;

public interface HabitacionDAO {
    
    DefaultTableModel mostrar(String buscar);

    DefaultTableModel mostrarvista(String buscar);

    boolean insertar(vhabitacion habitacion);

    boolean editar(vhabitacion habitacion);

    boolean desocupar(vhabitacion idHabitacion);

    boolean ocupar(vhabitacion idHabitacion);

    boolean eliminar(vhabitacion idHabitacion);

    vhabitacion buscarPorId(int idHabitacion);
}
