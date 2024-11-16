/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.vtrabajador;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samir
 */
public interface TrabajadorDAO {
     DefaultTableModel mostrar(String buscar);

    DefaultTableModel login(String login, String password);

    boolean insertar(vtrabajador cliente);

    boolean editar(vtrabajador cliente);

    boolean eliminar(vtrabajador cliente);

   
}
