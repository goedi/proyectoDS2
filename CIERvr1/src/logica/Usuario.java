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
public class Usuario {
    
    private String login;
    private String password;
    private String tipo;
    private String cedulaUsuario;

    public Usuario() {
        login = "";
        password = "";
        tipo = "";
        cedulaUsuario = "";
    }

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
    
}
