/** 
 * Nombre del Archivo: PanelCoordinador.java
 * Autores: JULIAN GARCIA RICO (1225435) 
 *          DIEGO FERNANDO BEDOYA (1327749) 
 *          CRISTIAN ALEXANDER VALENCIA TORRES (1329454) 
 *          OSCAR STEVEN ROMERO BERON (1326750) 
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * Esta se usa para el implementar el patron FABRICA
 * Representa un Producto Concreto
 */
public class PanelCoordinador extends javax.swing.JPanel {

    /**
     * Creates new form PanelPrincipal
     */
    public PanelCoordinador() {
        initComponents();       

        // Componentes

        // Eventos
        EventosPanelCoordinador events = new EventosPanelCoordinador();
        asignarEventos(events);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIzq = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelDer = new javax.swing.JPanel();

        panelIzq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("PANEL COOR");

        javax.swing.GroupLayout panelIzqLayout = new javax.swing.GroupLayout(panelIzq);
        panelIzq.setLayout(panelIzqLayout);
        panelIzqLayout.setHorizontalGroup(
            panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzqLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelIzqLayout.setVerticalGroup(
            panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzqLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDer, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelDer, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelIzq;
    // End of variables declaration//GEN-END:variables


    /**
     * Nombre: actualizarPaneDer
     * Proposito: Metodo que actualiza el contenido del panelDer
     * @param panelNuevo 
     */    
    private void actualizarPaneDer(JPanel panelNuevo){
        panelDer.removeAll();
        panelDer.add(panelNuevo);
        panelDer.repaint();
        panelDer.updateUI();
    } // Fin del metodo actualizarPaneDer
    
    private void asignarEventos(EventosPanelCoordinador events) {      
        
    } // Fin del metodo asignarEventos
    
    private class EventosPanelCoordinador implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    } // Fin de la clase EventosPanelPrincipal

} // Fin de la clase PanelPrincipal
