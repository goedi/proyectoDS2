/** 
 * Nombre del Archivo: Item.java
 * Autores: JULIAN GARCIA RICO (1225435) 
 *          DIEGO FERNANDO BEDOYA (1327749) 
 *          CRISTIAN ALEXANDER VALENCIA TORRES (1329454) 
 *          OSCAR STEVEN ROMERO BERON (1326750) 
 */
package Logica;

import Patrones.Item;
import java.util.ArrayList;

/**
 * Esta clase se utiliza para implementar el patron COMPOSITE
 * y Representa la clase Composite, es decir que esta compuesta
 * por otro objetos (FaseCurso)
 */
public class Curso implements Item{
    private String nombreCompleto;
    private String nombreCorto;
    private String codigo;
    private String descripcion;
    private String contenido;
    private boolean estado;

    private ArrayList <Item> listFases;

    public Curso() {
        this.nombreCompleto = "";
        this.nombreCorto = "";
        this.codigo = "";
        this.descripcion = "";
        this.contenido = "";
        this.estado = false;
        this.listFases = new ArrayList <Item>();
    }

    public Curso(String nombreCompleto, String nombreCorto, String Codigo, String Descripcion,
            String Contenido, boolean estado)
    {
        this.nombreCompleto = nombreCompleto;
        this.nombreCorto = nombreCorto;
        this.codigo = Codigo;
        this.descripcion = Descripcion;
        this.contenido = Contenido;
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
        return codigo;
    }

    public void setCodigo(String Codigo) {
        this.codigo = Codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String Contenido) {
        this.contenido = Contenido;
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
