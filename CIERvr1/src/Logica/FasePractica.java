/** 
 * Nombre del Archivo: FasePractica.java
 * Autores: JULIAN GARCIA RICO (1225435) 
 *          DIEGO FERNANDO BEDOYA (1327749) 
 *          CRISTIAN ALEXANDER VALENCIA TORRES (1329454) 
 *          OSCAR STEVEN ROMERO BERON (1326750) 
 */
package Logica;

import Patrones.Item;


/**
 * Esta clase se utiliza para implementar el patron COMPOSITE
 * y Representa una clase Hoja
 */
public class FasePractica implements Item {
    
    private String codigoFase;
    private String codigoPractica;
    private String nombre;
    private String descripcion;
    private boolean estado;
   

    public FasePractica() {
        this.codigoFase = "";
        this.codigoPractica = "";
        this.nombre = "";
        this.descripcion = "";
        this.estado = false;
    }

    public FasePractica(String codigoFase, String codigoPractica, String nombre, 
            String descripcion, boolean estado) {
        this.codigoFase = codigoFase;
        this.codigoPractica = codigoPractica;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getCodigoFase() {
        return codigoFase;
    }

    public void setCodigoFase(String codigoFase) {
        this.codigoFase = codigoFase;
    }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public void insertarItem(Item nuevoObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerItem(Object... list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarItem(Object... list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} // Fin de la clase FesePractica
