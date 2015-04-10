/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author diego
 */
public class Cohorte {
    private String codigo;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<LeaderTeacher> listaLTs;

    public Cohorte() {
        this.codigo = "";
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.listaLTs = new ArrayList<LeaderTeacher>();
    }

    public Cohorte(String codigo, Date fechaInicio, Date fechaFin, ArrayList listaLTs) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.listaLTs = listaLTs;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<LeaderTeacher> getListaLTs() {
        return listaLTs;
    }

    public void setListaLTs(ArrayList<LeaderTeacher> listaLTs) {
        this.listaLTs = listaLTs;
    }

}
