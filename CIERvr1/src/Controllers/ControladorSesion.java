/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Logica.Sesion;



/**
 *
 * @author oscar
 */
public class ControladorSesion {

    public Sesion ingresar(String usuario, String contrasena){
        Sesion nuevaSesion = null;
        /**
         * Con usuario y contrasena va y consulta a la base de datos (Tabla Usuario)
         * si el Usuario no tiene mas sesiones si no esta crea un Objeto Sesion
         * y si esta retorna un null
         */
        nuevaSesion = Sesion.getInstance(usuario, contrasena);
        nuevaSesion.setTipo("Administrador");
        return nuevaSesion;
    } // Fin del metodo login
    
} // Fin de controlador Login
