package DAO;

import Modelo.vcliente;
import javax.swing.table.DefaultTableModel;

public interface ClienteDAO {
    DefaultTableModel mostrar(String buscar);

    boolean insertar(vcliente cliente);

    boolean editar(vcliente cliente);

    boolean eliminar(vcliente cliente);
}
