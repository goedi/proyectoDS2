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
public class Coordinador extends Empleado{
    
    private int anosExperiencia;

    public Coordinador () {
        super();
        anosExperiencia = 0;
    } // Fin del Constructor
    
    public Coordinador(int anosExperiencia, String nombres, String apellidos, 
            String cedula, String correo, String cargo, String direccion, 
            String telefono, boolean estado) 
    {
        super(nombres, apellidos, cedula, correo, cargo, direccion, telefono, estado);
        this.anosExperiencia = anosExperiencia;
    } // Fin del Constructor

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

} // Fin de la clase Coordinador
