/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class LeaderTeacher extends Aspirante{
    
    private Date FechaNacimiento;
    private String sexo;
    private String zonaDeDesempenio;
    private String modalidad;
    private ArrayList enfasis;
    private ArrayList Etnoeducacion;
    private ArrayList NivelesEscolaridad; 
    private ArrayList GradosEscolaridad;
    private ArrayList AreasFormacion;
    private int NivelEducacion;
    private int nivelEducacionAlcanzado;
    private int experienciaBasicaPrimaria;
    private int experienciaBasicaSecundaria;
    private int experienciaSuperior;
    private int experienciaPreescolar;
    private int experienciaRural;
    private int experienciaUrbano;
    private int experienciaSectorPublico;
    private int experienciaSectorPrivado;

    public LeaderTeacher() {
        super();
        this.FechaNacimiento = new Date();
        this.sexo = "";
        this.zonaDeDesempenio = "";
        this.modalidad = "";
        this.enfasis = new ArrayList();
        this.Etnoeducacion = new ArrayList();
        this.NivelesEscolaridad = new ArrayList();
        this.GradosEscolaridad = new ArrayList();
        this.AreasFormacion = new ArrayList();;
        this.NivelEducacion = 0;
        this.nivelEducacionAlcanzado = 0;
        this.experienciaBasicaPrimaria = 0;
        this.experienciaBasicaSecundaria = 0;
        this.experienciaSuperior = 0;
        this.experienciaPreescolar = 0;
        this.experienciaRural = 0;
        this.experienciaUrbano = 0;
        this.experienciaSectorPublico = 0;
        this.experienciaSectorPrivado = 0;
    }

    public LeaderTeacher(Date FechaNacimiento, String sexo, String zonaDeDesempenio,
            String modalidad, ArrayList enfasis, ArrayList Etnoeducacion,
            ArrayList NivelesEscolaridad, ArrayList GradosEscolaridad, ArrayList AreasFormacion,
            int NivelEducacion, int nivelEducacionAlcanzado, int experienciaBasicaPrimaria,
            int experienciaBasicaSecundaria, int experienciaSuperior, int experienciaPreescolar,
            int experienciaRural, int experienciaUrbano, int experienciaSectorPublico,
            int experienciaSectorPrivado, String nombre, String apellido, String cedula,
            String correo, String sedePertenece, String institucion, String codDANEInstitucion,
            String grado, String secretariaEducacion, String municipio, String areaInscripcion,
            boolean perteneceAprenderPTA, String usuarioColombiaAprende, boolean estado)
    {
        super(nombre, apellido, cedula, correo, sedePertenece,
                institucion, codDANEInstitucion, grado, secretariaEducacion,
                municipio, areaInscripcion, perteneceAprenderPTA, usuarioColombiaAprende, estado);
        this.FechaNacimiento = FechaNacimiento;
        this.sexo = sexo;
        this.zonaDeDesempenio = zonaDeDesempenio;
        this.modalidad = modalidad;
        this.enfasis = enfasis;
        this.Etnoeducacion = Etnoeducacion;
        this.NivelesEscolaridad = NivelesEscolaridad;
        this.GradosEscolaridad = GradosEscolaridad;
        this.AreasFormacion = AreasFormacion;
        this.NivelEducacion = NivelEducacion;
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

    public ArrayList getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(ArrayList enfasis) {
        this.enfasis = enfasis;
    }

    public ArrayList getEtnoeducacion() {
        return Etnoeducacion;
    }

    public void setEtnoeducacion(ArrayList Etnoeducacion) {
        this.Etnoeducacion = Etnoeducacion;
    }

    public ArrayList getNivelesEscolaridad() {
        return NivelesEscolaridad;
    }

    public void setNivelesEscolaridad(ArrayList NivelesEscolaridad) {
        this.NivelesEscolaridad = NivelesEscolaridad;
    }

    public ArrayList getGradosEscolaridad() {
        return GradosEscolaridad;
    }

    public void setGradosEscolaridad(ArrayList GradosEscolaridad) {
        this.GradosEscolaridad = GradosEscolaridad;
    }

    public ArrayList getAreasFormacion() {
        return AreasFormacion;
    }

    public void setAreasFormacion(ArrayList AreasFormacion) {
        this.AreasFormacion = AreasFormacion;
    }

    public int getNivelEducacion() {
        return NivelEducacion;
    }

    public void setNivelEducacion(int NivelEducacion) {
        this.NivelEducacion = NivelEducacion;
    }

    public int getNivelEducacionAlcanzado() {
        return nivelEducacionAlcanzado;
    }

    public void setNivelEducacionAlcanzado(int nivelEducacionAlcanzado) {
        this.nivelEducacionAlcanzado = nivelEducacionAlcanzado;
    }

    public int getExperienciaBasicaPrimaria() {
        return experienciaBasicaPrimaria;
    }

    public void setExperienciaBasicaPrimaria(int experienciaBasicaPrimaria) {
        this.experienciaBasicaPrimaria = experienciaBasicaPrimaria;
    }

    public int getExperienciaBasicaSecundaria() {
        return experienciaBasicaSecundaria;
    }

    public void setExperienciaBasicaSecundaria(int experienciaBasicaSecundaria) {
        this.experienciaBasicaSecundaria = experienciaBasicaSecundaria;
    }

    public int getExperienciaSuperior() {
        return experienciaSuperior;
    }

    public void setExperienciaSuperior(int experienciaSuperior) {
        this.experienciaSuperior = experienciaSuperior;
    }

    public int getExperienciaPreescolar() {
        return experienciaPreescolar;
    }

    public void setExperienciaPreescolar(int experienciaPreescolar) {
        this.experienciaPreescolar = experienciaPreescolar;
    }

    public int getExperienciaRural() {
        return experienciaRural;
    }

    public void setExperienciaRural(int experienciaRural) {
        this.experienciaRural = experienciaRural;
    }

    public int getExperienciaUrbano() {
        return experienciaUrbano;
    }

    public void setExperienciaUrbano(int experienciaUrbano) {
        this.experienciaUrbano = experienciaUrbano;
    }

    public int getExperienciaSectorPublico() {
        return experienciaSectorPublico;
    }

    public void setExperienciaSectorPublico(int experienciaSectorPublico) {
        this.experienciaSectorPublico = experienciaSectorPublico;
    }

    public int getExperienciaSectorPrivado() {
        return experienciaSectorPrivado;
    }

    public void setExperienciaSectorPrivado(int experienciaSectorPrivado) {
        this.experienciaSectorPrivado = experienciaSectorPrivado;
    }

}
