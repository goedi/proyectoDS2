/** 
 * Nombre del Archivo: GetorPanelesUsuarios.java
 * Autores: JULIAN GARCIA RICO (1225435) 
 *          DIEGO FERNANDO BEDOYA (1327749) 
 *          CRISTIAN ALEXANDER VALENCIA TORRES (1329454) 
 *          OSCAR STEVEN ROMERO BERON (1326750) 
 */
package Patrones;

import View.PanelAdministrador;
import View.PanelCoordinador;
import View.PanelLT;
import View.PanelMT;
import javax.swing.JPanel;

/**
 * Esta se usa para el implementar el patron FABRICA
 * Representando representando la Fabrica de Paneles de Usuarios
 * Es tener en cuenta que el Producto (La clase de la que heredan los 
 * productos concretos) es JPanel
 */
public class GestorPanelesUsuarios {
        
    public JPanel createProduct(String tipoUsuario){
        if (tipoUsuario.equals("Administrador")) {
            return new PanelAdministrador();
        } else if (tipoUsuario.equals("Master Teacher")) {
             return new PanelMT();
        } else if (tipoUsuario.equals("Leader Teacher")) {             
             return new PanelLT();
        } else if (tipoUsuario.equals("Coordinador")) {             
             return new PanelCoordinador();
        }           
        return null;
    }
}
