/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

/**
 *
 * @author oscar
 */
public interface Item {
    public void insertarItem(Item nuevoObjeto);
    public int obtenerItem(Object...list);
    public void eliminarItem(Object...list);
} // Fin de la interface Item
