/**
 * Esta clase es la Fabrica
 */
package Patrones;

import View.PanelAdministrador;
import javax.swing.JPanel;

/**
 *
 * @author oscar
 */
public class GestorPanelesUsuarios {
        
    public JPanel retornarPanelUsuario(String tipoUsuario){
        if (tipoUsuario.equals("Administrador")) {
            return new PanelAdministrador();
        } else if (tipoUsuario.equals("Master Teacher")) {
            // return new PanelCoordinador();
        } else if (tipoUsuario.equals("Leader Teacher")) {
            // return PanelMT
        } else if (tipoUsuario.equals("Coodirnador")) {
            // return PanelLT
        }           
        return null;
    }
}
