/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author diego
 * Comentario de prueba
 */
public class Aspirante {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String sedePertenece;
    private String institucion;
    private String codDANEInstitucion;
    private String grado;
    private String secretariaEducacion;
    private String municipio;
    private String areaInscripcion;
    private boolean perteneceAprenderPTA;
    private String usuarioColombiaAprende;
    private boolean estado;
    

    public Aspirante() {
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.correo = "";
        this.sedePertenece = "";
        this.institucion = "";
        this.codDANEInstitucion = "";
        this.grado = "";
        this.secretariaEducacion = "";
        this.municipio = "";
        this.areaInscripcion = "";
        this.perteneceAprenderPTA = false;
        this.usuarioColombiaAprende = "";
        this.estado = false;
        
    }

    public Aspirante(String nombre, String apellido, String cedula, String correo, String sedePertenece, 
            String institucion, String codDANEInstitucion, String grado, String secretariaEducacion,
            String municipio, String areaInscripcion, boolean perteneceAprenderPTA,
            String usuarioColombiaAprende, boolean estado)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.sedePertenece = sedePertenece;
        this.institucion = institucion;
        this.codDANEInstitucion = codDANEInstitucion;
        this.grado = grado;
        this.secretariaEducacion = secretariaEducacion;
        this.municipio = municipio;
        this.areaInscripcion = areaInscripcion;
        this.perteneceAprenderPTA = perteneceAprenderPTA;
        this.usuarioColombiaAprende = usuarioColombiaAprende;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSedePertenece() {
        return sedePertenece;
    }

    public void setSedePertenece(String sedePertenece) {
        this.sedePertenece = sedePertenece;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getCodDANEInstitucion() {
        return codDANEInstitucion;
    }

    public void setCodDANEInstitucion(String codDANEInstitucion) {
        this.codDANEInstitucion = codDANEInstitucion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSecretariaEducacion() {
        return secretariaEducacion;
    }

    public void setSecretariaEducacion(String secretariaEducacion) {
        this.secretariaEducacion = secretariaEducacion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getAreaInscripcion() {
        return areaInscripcion;
    }

    public void setAreaInscripcion(String areaInscripcion) {
        this.areaInscripcion = areaInscripcion;
    }

    public boolean getPerteneceAprenderPTA() {
        return perteneceAprenderPTA;
    }

    public void setPerteneceAprenderPTA(boolean perteneceAprenderPTA) {
        this.perteneceAprenderPTA = perteneceAprenderPTA;
    }

    public String getUsuarioColombiaAprende() {
        return usuarioColombiaAprende;
    }

    public void setUsuarioColombiaAprende(String usuarioColombiaAprende) {
        this.usuarioColombiaAprende = usuarioColombiaAprende;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public Vector toArray(){
        Aspirante aspirante = new Aspirante();
        Vector  datosObject = new Vector();
        datosObject.add(getNombre());
        datosObject.add(getApellido());
        datosObject.add(getCedula());
        datosObject.add(getCorreo());
        datosObject.add(getSedePertenece());
        datosObject.add(getInstitucion());
        datosObject.add(getCodDANEInstitucion());
        datosObject.add(getGrado());
        datosObject.add(getSecretariaEducacion());
        datosObject.add(getMunicipio());
        datosObject.add(getAreaInscripcion());
        datosObject.add(""+getPerteneceAprenderPTA());
        datosObject.add(getUsuarioColombiaAprende());
        datosObject.add(""+isEstado());
    return datosObject;
    }
}
