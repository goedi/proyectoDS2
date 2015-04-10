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
public class Curso {
    private String nombreCompleto;
    private String nombreCorto;
    private String Codigo;
    private String Descripcion;
    private String Contenido;
    private boolean estado;

    public Curso() {
        this.nombreCompleto = "";
        this.nombreCorto = "";
        this.Codigo = "";
        this.Descripcion = "";
        this.Contenido = "";
        this.estado = false;
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
}
