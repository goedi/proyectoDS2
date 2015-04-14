/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cristian
 */
public class TablaModel extends DefaultTableModel {
    
    private DefaultTableModel modelo;
    
    /**
     *
     * @param cuerpo
     * @param String
     */
    public TablaModel(Vector cuerpo, Vector  titulo){
         modelo = new DefaultTableModel(cuerpo, titulo);
         
    }
   
    public DefaultTableModel getModelo(){
        return modelo;
    }
    
    }
