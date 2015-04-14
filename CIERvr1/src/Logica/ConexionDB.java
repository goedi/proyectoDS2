/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author oscar
 */
public class ConexionDB {

//    private final String URL_BASEDATOS = "jdbc:postgresql://ec2-107-20-159-103.compute-1.amazonaws.com:5432/dbikdp8uvuqigr?user=itrvknmdhrrwce&password=O7nb2g-81YaZV9v4PJx-g0syGS&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
//    private final String USUARIO = "itrvknmdhrrwce";
//    private final String CONTRASEÑA = "O7nb2g-81YaZV9v4PJx-g0syGS";   
     private final String URL_BASEDATOS = "jdbc:postgresql://localhost:5432/pdesarrollo";
    private final String USUARIO = "univalle";
    private final String CONTRASEÑA = "u4385451";    

    
//    private final String URL_BASEDATOS = "jdbc:postgresql://ec2-107-20-159-103.compute-1.amazonaws.com:5432/dbikdp8uvuqigr?user=itrvknmdhrrwce&password=O7nb2g-81YaZV9v4PJx-g0syGS&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
//    private final String USUARIO = "itrvknmdhrrwce";
//    private final String CONTRASEÑA = "O7nb2g-81YaZV9v4PJx-g0syGS";   
    

    private Connection conn;
    
    private static ConexionDB instanciaConexionDB; // Singleton
    
    private ConexionDB(){
        System.out.println("Conectando a la Base de Datos");
        try {           
            this.conn = DriverManager.getConnection(URL_BASEDATOS, USUARIO, CONTRASEÑA);
        } 
        catch (SQLException sqle) {
            System.out.println("Error en la conexion a la Base de Datos");
        }
    } // Fin del constructor
    
    public static ConexionDB saberEstado(){
        if (instanciaConexionDB == null) {
            instanciaConexionDB = new ConexionDB();
        }
        return instanciaConexionDB;
    }
    
    public void desconectar () {
        this.instanciaConexionDB = null;
    }
    
    public Connection getConnetion(){
        return this.conn;
    }  
} // Fin de la clase Conexion
