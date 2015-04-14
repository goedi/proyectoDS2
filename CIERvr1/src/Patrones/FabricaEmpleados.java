/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import Logica.Coordinador;
import Logica.Empleado;
import Logica.MasterTeacher;

/**
 *
 * @author oscar
 */
public class FabricaEmpleados {
    
    public static String MASTER_TEACHER = "Master Teacher";
    public static String COORDINADOR = "Coordinador";
    
    public Empleado getEmpleado (String tipo) {
        if (tipo.equals(MASTER_TEACHER)) {
            return new MasterTeacher();
        } else if(tipo.equals(COORDINADOR)) {
            return new Coordinador();
        }
        return null;
    } // Fin del metodo getEmpleado
    
} // Fin de la clase FabricaUsuarios
