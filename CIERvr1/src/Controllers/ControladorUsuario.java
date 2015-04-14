/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Logica.Usuario;

/**
 *
 * @author oscar
 */
public class ControladorUsuario {
    
    public boolean ingresarUsuario(String login, String password, String tipo, String cedulaUsuario) {
        boolean respuesta = false;
        Usuario nuevoUsuario = new Usuario(login, password, tipo, cedulaUsuario);
        /**
         * Utilizar el ORM para guardar a la base de datos segun el resultado
         * de la operacion se retorna true o false
         */
        return respuesta;
    } // Fin del metodo ingresarUsuario
           
} // Fin ControladorUsuario
