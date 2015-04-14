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
public class Curso implements Item{
    private String nombreCompleto;
    private String nombreCorto;
    private String Codigo;
    private String Descripcion;
    private String Contenido;
    private boolean estado;

    private ArrayList <Item> listFases;

    public Curso() {
        this.nombreCompleto = "";
        this.nombreCorto = "";
        this.Codigo = "";
        this.Descripcion = "";
        this.Contenido = "";
        this.estado = false;
        this.listFases = new ArrayList <Item>();
    }

    public Curso(String nombreCompleto, String nombreCorto, String Codigo, String Descripcion,
            String Contenido, boolean estado)
    {
        this.nombreCompleto = nombreCompleto;
        this.nombreCorto = nombreCorto;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Contenido = Contenido;
        this.estado = estado;
        this.listFases = new ArrayList <Item>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public void insertarItem(Item nuevoObjeto) {       
        listFases.add(nuevoObjeto);
    }
    
    public ArrayList<Item> getListFases() {
        return listFases;
    }

    public void setListFases(ArrayList<Item> listFases) {
        this.listFases = listFases;
    }
        

    @Override
    public int obtenerItem(Object...list) {
        String codigoFase = (String)list[0];
        int posicion = -1;
        for (int x = 0; x < listFases.size(); x++) {
            FaseCurso fase = (FaseCurso)listFases.get(x);
            if (fase.getCodigoFase().equals(codigoFase)) {
                posicion = x; 
            }
        }
        return posicion;
    }

    @Override
    public void eliminarItem(Object...list) {
        String codigoFase = (String)list[0];
        int posicion = obtenerItem(codigoFase);
        if (posicion != -1) {
            listFases.remove(posicion);
        }
    }
    
} // Fin de la clase Curso
