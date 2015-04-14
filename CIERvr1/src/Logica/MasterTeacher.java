
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author diego
 */
public class MasterTeacher extends Empleado{
    
    private String ciudad;
    private String pais;
    private String RiC;
    private Curso curso;       
    
    public MasterTeacher () {
        super();
        this.ciudad = "";
        this.pais = "";
        this.RiC = "";
        curso = null;   
    } // Fin del contructor

    public MasterTeacher(String ciudad, String pais, String RiC, Curso curso, 
            String nombres, String apellidos, String cedula, String correo, 
            String cargo, String direccion, String telefono, boolean estado) 
    {
        super(nombres, apellidos, cedula, correo, cargo, direccion, telefono, estado);
        this.ciudad = ciudad;
        this.pais = pais;
        this.RiC = RiC;
        this.curso = curso;
    } // Fin del Contructor
    
    
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRiC() {
        return RiC;
    }

    public void setRiC(String RiC) {
        this.RiC = RiC;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
} // Fin de clase MasterTeacher

