/** 
 * Nombre del Archivo: Usuario.java
 * Autores: JULIAN GARCIA RICO (1225435) 
 *          DIEGO FERNANDO BEDOYA (1327749) 
 *          CRISTIAN ALEXANDER VALENCIA TORRES (1329454) 
 *          OSCAR STEVEN ROMERO BERON (1326750) 
 */
package Logica;

public class Usuario {
    
    private String login;
    private String password;
    private String tipo;
    private String cedulaUsuario;
     
    public Usuario () {
        this.login = "";
        this.password = "";
        this.tipo = "";
        this.cedulaUsuario = "";        
    } // Fin del constructo
    
    public Usuario(String login, String password, String tipo, String cedulaUsuario) {
        this.login = login;
        this.password = password;
        this.tipo = tipo;
        this.cedulaUsuario = cedulaUsuario;
    }    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }
    
} // Fin de la clase Usuario
