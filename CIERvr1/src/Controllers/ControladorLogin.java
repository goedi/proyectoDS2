/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import logica.DaoLogin;
import logica.Usuario;

/**
 *
 * @author oscar
 */
public class ControladorLogin {
    
    private DaoLogin daoLogin;
    
    public ControladorLogin() {
        daoLogin = new DaoLogin();
    }
    
    public String ingresar(String usuario, String contrasena){
        String respuesta = "";
        Usuario user = daoLogin.selectUser(usuario, contrasena);
        respuesta = user.getTipo();
        return respuesta;
    } // Fin del metodo login
    
} // Fin de controlador Login
