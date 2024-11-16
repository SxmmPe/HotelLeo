package DAO;

import Modelo.vreserva;
import javax.swing.table.DefaultTableModel;


public interface ReservaDAO {
     DefaultTableModel mostrar(String buscar);

    boolean insertar(vreserva cliente);

    boolean editar(vreserva cliente);

    boolean eliminar(vreserva cliente);
    
    boolean pagar(vreserva cliente);
}
