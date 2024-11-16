/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.vproducto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samir
 */
public interface ProductoDAO {
    DefaultTableModel mostrar(String buscar);

    boolean insertar(vproducto cliente);

    boolean editar(vproducto cliente);

    boolean eliminar(vproducto cliente);
}
