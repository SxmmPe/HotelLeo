/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.vconsumo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samir
 */
public interface ConsumoDAO {
    DefaultTableModel mostrar(String buscar);

    boolean insertar(vconsumo cliente);

    boolean editar(vconsumo cliente);

    boolean eliminar(vconsumo cliente);


 
    
    
}
