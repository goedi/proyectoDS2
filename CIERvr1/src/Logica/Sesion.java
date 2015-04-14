/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author oscar
 */

/**
 * Nombre Clase: Sesion
 * Proposito: Clase que representa la sesion inciada por el usuario de la aplicacion
 */
public class Sesion {
    
    private String login;
    private String password;
    private String tipo;
    private String cedulaUsuario;    
    
    private static Sesion instanciaSesion;
    
    private Sesion(String login, String password){
        this.login = login;
        this.password = password;
    } // Constructor
    
    public static Sesion getInstance(String login, String password){
        if (instanciaSesion == null) {
            instanciaSesion = new Sesion(login, password);
        }
        return instanciaSesion;
    } // Fin del metodo getInstance

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

    public static Sesion getInstanciaSesion() {
        return instanciaSesion;
    }

    public static void setInstanciaSesion(Sesion instanciaSesion) {
        Sesion.instanciaSesion = instanciaSesion;
    }
} // Fin de la clase Sesion
