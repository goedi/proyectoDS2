/** 
 * Nombre del Archivo: MasterTeacher.java
 * Autores: JULIAN GARCIA RICO (1225435) 
 *          DIEGO FERNANDO BEDOYA (1327749) 
 *          CRISTIAN ALEXANDER VALENCIA TORRES (1329454) 
 *          OSCAR STEVEN ROMERO BERON (1326750) 
 */
package Logica;

public class MasterTeacher {
    
    private String nombre;
    private String apellido;
    private String correo;
    private String ciudad;
    private String pais;
    private String cedula;
    private String RiC;
    private boolean estado;
    private Curso curso;    
    
    public MasterTeacher() {
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.ciudad = "";
        this.pais = "";
        this.cedula = "";
        this.RiC = "";
        this.estado = false;
        this.curso = null;
    }

    public MasterTeacher(String Nombre, String Apellido, String Correo, String Ciudad, String Pais, String Cedula, String RiC, boolean estado, Curso Curso) {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.correo = Correo;
        this.ciudad = Ciudad;
        this.pais = Pais;
        this.cedula = Cedula;
        this.RiC = RiC;
        this.estado = estado;
        this.curso = Curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String Correo) {
        this.correo = Correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad = Ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String Pais) {
        this.pais = Pais;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String Cedula) {
        this.cedula = Cedula;
    }

    public String getRiC() {
        return RiC;
    }

    public void setRiC(String RiC) {
        this.RiC = RiC;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso Curso) {
        this.curso = Curso;
    }
}
