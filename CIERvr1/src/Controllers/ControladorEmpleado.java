/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Logica.Empleado;
import Patrones.FabricaEmpleados;



/**
 * Clase: ControladorEmpleado
 * Proposito: Esta clase es la fachada de la FabricaEmpleado
 */

public class ControladorEmpleado {
    
    private FabricaEmpleados fabEmpleados;
    
    public ControladorEmpleado() {
        fabEmpleados = new FabricaEmpleados();
    } // Fin del Constructor
    
    public Empleado crearEmpleado(String tipo){
        Empleado objEmpleado = fabEmpleados.getEmpleado(tipo);
        return objEmpleado;
    } // Fin del metodo crearEmpleado
    
} // Fin del ControladorEmpleado
