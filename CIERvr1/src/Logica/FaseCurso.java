/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Patrones.Item;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class FaseCurso implements Item{


    private String codigoCurso;
    private String codigoFase;
    private int numHoras;
    private int numSemanas;
    private String tipo;
    private String contenido;
    private boolean estado;
    private ArrayList <Item> listPracticas;
    

    public FaseCurso() {
        this.codigoCurso = "";
        this.codigoFase = "";
        this.numHoras = 0;
        this.numSemanas = 0;
        this.tipo = "";
        this.contenido = "";
        this.estado = false;
        this.listPracticas = new ArrayList<Item>();
    }

    public FaseCurso(String codigoCurso, String codigoFase, int numHoras, int numSemanas, 
            String tipo, String contenido, boolean estado) {
        this.codigoCurso = codigoCurso;
        this.codigoFase = codigoFase;
        this.numHoras = numHoras;
        this.numSemanas = numSemanas;
        this.tipo = tipo;
        this.contenido = contenido;
        this.estado = estado;
        this.listPracticas = new ArrayList<Item>();
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getCodigoFase() {
        return codigoFase;
    }

    public void setCodigoFase(String codigoFase) {
        this.codigoFase = codigoFase;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getNumSemanas() {
        return numSemanas;
    }

    public void setNumSemanas(int numSemanas) {
        this.numSemanas = numSemanas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public ArrayList<Item> getListPracticas() {
        return listPracticas;
    }

    public void setListPracticas(ArrayList<Item> listPracticas) {
        this.listPracticas = listPracticas;
    }
        

    @Override
    public void insertarItem(Item nuevoObjeto) {
        listPracticas.add(nuevoObjeto);
    }

    @Override
    public int obtenerItem(Object... list) {
        String codigoPractica = (String)list[0];
        int posicion = -1;
        for (int x = 0; x < listPracticas.size(); x++) {
            FasePractica fasePractica = (FasePractica)listPracticas.get(x);
            if (fasePractica.getCodigoFase().equals(codigoPractica)) {
                posicion = x; 
            }
        }
        return posicion;        
    }

    @Override
    public void eliminarItem(Object... list) {
        String codigoPractica = (String)list[0];
        int posicion = obtenerItem(codigoPractica);
        if (posicion != -1) {
            listPracticas.remove(posicion);
        }    
    }    
} // Fin de la clase FaseCurso
