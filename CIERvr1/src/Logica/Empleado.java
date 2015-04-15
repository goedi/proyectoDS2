/** 
 * Nombre del Archivo: Empleado.java
 * Autores: JULIAN GARCIA RICO (1225435) 
 *          DIEGO FERNANDO BEDOYA (1327749) 
 *          CRISTIAN ALEXANDER VALENCIA TORRES (1329454) 
 *          OSCAR STEVEN ROMERO BERON (1326750) 
 */
package Logica;

public class Empleado {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private String cargo;
    private String direccion;
    private String telefono;
    private boolean estado;
    
    public Empleado() {
        nombres = "";
        apellidos = "";
        cedula = "";
        correo = "";
        cargo = "";
        direccion = "";
        telefono = "";
        estado = false;
    }

    public Empleado(String nombres, String apellidos, String cedula, String correo,
            String cargo, String direccion, String telefono, boolean estado)
    {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.cargo = cargo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
