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
public class Empleado {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private String cargo;
    private String direccion;
    private String telefono;

    public Empleado() {
        nombres = "";
        apellidos = "";
        cedula = "";
        correo = "";
        cargo = "";
        direccion = "";
        telefono = "";
    }

    public Empleado(String nombres, String apellidos, String cedula, String correo, String cargo, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.cargo = cargo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
