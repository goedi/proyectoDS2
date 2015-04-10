/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author diego
 */
public class FaseCurso {
    private String codigoCurso;
    private String codigoFase;
    private int numHoras;
    private int numSemanas;
    private String tipo;
    private String contenido;
    private boolean estado;

    public FaseCurso() {
        this.codigoCurso = "";
        this.codigoFase = "";
        this.numHoras = 0;
        this.numSemanas = 0;
        this.tipo = "";
        this.contenido = "";
        this.estado = false;
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
}
