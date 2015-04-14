/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author oscar
 */
public class DaoLogin {
    
    
    private ConexionDB objConexion = ConexionDB.saberEstado();
//    
//    public Usuario selectUser (String login, String password) {
//        Usuario user = null;
//        Statement stm = null; 
//        String query = null ; 
//        ResultSet rs = null;
//        String log = "", pass = "", tipo = "", cedulaUsuario = "";
//        
//        try {
//            query = "SELECT * FROM usuario"
//                    + " WHERE login = '" + login + "'"
//                    + " AND pass = '" + password + "'" + ";";
//            System.out.println(query);
//            stm = objConexion.getConnetion().createStatement();
//            rs = stm.executeQuery(query);
//            while (rs.next()) {
//                log = rs.getString("login");
//                pass = rs.getString("pass");
//                tipo = rs.getString("tipo");
//                cedulaUsuario = rs.getString("cedulausuario");
//            }
//            
//            user = Usuario.getInstance(log, pass);
//            user.setTipo(tipo);
//            user.setCedulaUsuario(cedulaUsuario);            
//        } catch(SQLException sql){
//            System.err.println(sql.getMessage());
//            System.out.println("No se pudo realizar la operacion SELECT");
//        }                  
//        return user;
//    } 
}
