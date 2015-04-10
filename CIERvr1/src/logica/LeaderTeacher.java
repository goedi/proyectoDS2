/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author diego
 */
public class LeaderTeacher {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String direccionDomicilio;
    private String sedePertenece;
    private String institucion;
    private String codDANEInstitucion;
    private String grado;
    private String secretariaEducacion;
    private String municipio;
    private String areaInscripcion;
    private String perteneceAprenderPTA;
    private String usuarioColombiaAprende;
    private Date FechaNacimiento;
    private String sexo;
    private String zonaDeDesempenio;
    private String modalidad;
    private String nivelEscolaridadDesempenioLavoral;
    private String gradosDesempeniados;
    private String areasDeDesempenio;
    private String nivelEducacionAlcanzado;
    private String experienciaBasicaPrimaria;
    private String experienciaBasicaSecundaria;
    private String experienciaSuperior;
    private String experienciaPreescolar;
    private String experienciaRural;
    private String experienciaUrbano;
    private String experienciaSectorPublico;
    private String experienciaSectorPrivado;

    public LeaderTeacher() {
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.correo = "";
        this.direccionDomicilio = "";
        this.sedePertenece = "";
        this.institucion = "";
        this.codDANEInstitucion = "";
        this.grado = "";
        this.secretariaEducacion = "";
        this.municipio = "";
        this.areaInscripcion = "";
        this.perteneceAprenderPTA = "";
        this.usuarioColombiaAprende = "";
        this.FechaNacimiento = new Date();
        this.sexo = "";
        this.zonaDeDesempenio = "";
        this.modalidad = "";
        this.nivelEscolaridadDesempenioLavoral = "";
        this.gradosDesempeniados = "";
        this.areasDeDesempenio = "";
        this.nivelEducacionAlcanzado = "";
        this.experienciaBasicaPrimaria = "";
        this.experienciaBasicaSecundaria = "";
        this.experienciaSuperior = "";
        this.experienciaPreescolar = "";
        this.experienciaRural = "";
        this.experienciaUrbano = "";
        this.experienciaSectorPublico = "";
        this.experienciaSectorPrivado = "";
    }

    public LeaderTeacher(String nombre, String apellido, String cedula, String correo, String direccionDomicilio, String sedePertenece, String institucion, String codDANEInstitucion, String grado, String secretariaEducacion, String municipio, String areaInscripcion, String perteneceAprenderPTA, String usuarioColombiaAprende, Date FechaNacimiento, String sexo, String zonaDeDesempenio, String modalidad, String nivelEscolaridadDesempenioLavoral, String gradosDesempeniados, String areasDeDesempenio, String nivelEducacionAlcanzado, String experienciaBasicaPrimaria, String experienciaBasicaSecundaria, String experienciaSuperior, String experienciaPreescolar, String experienciaRural, String experienciaUrbano, String experienciaSectorPublico, String experienciaSectorPrivado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.direccionDomicilio = direccionDomicilio;
        this.sedePertenece = sedePertenece;
        this.institucion = institucion;
        this.codDANEInstitucion = codDANEInstitucion;
        this.grado = grado;
        this.secretariaEducacion = secretariaEducacion;
        this.municipio = municipio;
        this.areaInscripcion = areaInscripcion;
        this.perteneceAprenderPTA = perteneceAprenderPTA;
        this.usuarioColombiaAprende = usuarioColombiaAprende;
        this.FechaNacimiento = FechaNacimiento;
        this.sexo = sexo;
        this.zonaDeDesempenio = zonaDeDesempenio;
        this.modalidad = modalidad;
        this.nivelEscolaridadDesempenioLavoral = nivelEscolaridadDesempenioLavoral;
        this.gradosDesempeniados = gradosDesempeniados;
        this.areasDeDesempenio = areasDeDesempenio;
        this.nivelEducacionAlcanzado = nivelEducacionAlcanzado;
        this.experienciaBasicaPrimaria = experienciaBasicaPrimaria;
        this.experienciaBasicaSecundaria = experienciaBasicaSecundaria;
        this.experienciaSuperior = experienciaSuperior;
        this.experienciaPreescolar = experienciaPreescolar;
        this.experienciaRural = experienciaRural;
        this.experienciaUrbano = experienciaUrbano;
        this.experienciaSectorPublico = experienciaSectorPublico;
        this.experienciaSectorPrivado = experienciaSectorPrivado;
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

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
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

    public String getPerteneceAprenderPTA() {
        return perteneceAprenderPTA;
    }

    public void setPerteneceAprenderPTA(String perteneceAprenderPTA) {
        this.perteneceAprenderPTA = perteneceAprenderPTA;
    }

    public String getUsuarioColombiaAprende() {
        return usuarioColombiaAprende;
    }

    public void setUsuarioColombiaAprende(String usuarioColombiaAprende) {
        this.usuarioColombiaAprende = usuarioColombiaAprende;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getZonaDeDesempenio() {
        return zonaDeDesempenio;
    }

    public void setZonaDeDesempenio(String zonaDeDesempenio) {
        this.zonaDeDesempenio = zonaDeDesempenio;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getNivelEscolaridadDesempenioLavoral() {
        return nivelEscolaridadDesempenioLavoral;
    }

    public void setNivelEscolaridadDesempenioLavoral(String nivelEscolaridadDesempenioLavoral) {
        this.nivelEscolaridadDesempenioLavoral = nivelEscolaridadDesempenioLavoral;
    }

    public String getGradosDesempeniados() {
        return gradosDesempeniados;
    }

    public void setGradosDesempeniados(String gradosDesempeniados) {
        this.gradosDesempeniados = gradosDesempeniados;
    }

    public String getAreasDeDesempenio() {
        return areasDeDesempenio;
    }

    public void setAreasDeDesempenio(String areasDeDesempenio) {
        this.areasDeDesempenio = areasDeDesempenio;
    }

    public String getNivelEducacionAlcanzado() {
        return nivelEducacionAlcanzado;
    }

    public void setNivelEducacionAlcanzado(String nivelEducacionAlcanzado) {
        this.nivelEducacionAlcanzado = nivelEducacionAlcanzado;
    }

    public String getExperienciaBasicaPrimaria() {
        return experienciaBasicaPrimaria;
    }

    public void setExperienciaBasicaPrimaria(String experienciaBasicaPrimaria) {
        this.experienciaBasicaPrimaria = experienciaBasicaPrimaria;
    }

    public String getExperienciaBasicaSecundaria() {
        return experienciaBasicaSecundaria;
    }

    public void setExperienciaBasicaSecundaria(String experienciaBasicaSecundaria) {
        this.experienciaBasicaSecundaria = experienciaBasicaSecundaria;
    }

    public String getExperienciaSuperior() {
        return experienciaSuperior;
    }

    public void setExperienciaSuperior(String experienciaSuperior) {
        this.experienciaSuperior = experienciaSuperior;
    }

    public String getExperienciaPreescolar() {
        return experienciaPreescolar;
    }

    public void setExperienciaPreescolar(String experienciaPreescolar) {
        this.experienciaPreescolar = experienciaPreescolar;
    }

    public String getExperienciaRural() {
        return experienciaRural;
    }

    public void setExperienciaRural(String experienciaRural) {
        this.experienciaRural = experienciaRural;
    }

    public String getExperienciaUrbano() {
        return experienciaUrbano;
    }

    public void setExperienciaUrbano(String experienciaUrbano) {
        this.experienciaUrbano = experienciaUrbano;
    }

    public String getExperienciaSectorPublico() {
        return experienciaSectorPublico;
    }

    public void setExperienciaSectorPublico(String experienciaSectorPublico) {
        this.experienciaSectorPublico = experienciaSectorPublico;
    }

    public String getExperienciaSectorPrivado() {
        return experienciaSectorPrivado;
    }

    public void setExperienciaSectorPrivado(String experienciaSectorPrivado) {
        this.experienciaSectorPrivado = experienciaSectorPrivado;
    }
    
    
}
