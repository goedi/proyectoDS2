/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author cristian
 */
public class ObjectColeccion implements TablaColeccion{

    Vector datos;
    
    public ObjectColeccion(Vector datos){
        this.datos=datos;
        
    }
    
    @Override
    public ObjetoIterador iterator() {
        return new ObjetoColeccionIterador();
    }
    
    private class ObjetoColeccionIterador implements ObjetoIterador {
        private int index;
        @Override
        public boolean hasNext() {
           if(index < datos.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Vector next() {
             System.out.print("se agrego al objeto iterador");
            return (Vector) datos.get(index++);
            
        }
        
        
        
    }
}
