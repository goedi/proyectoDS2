/** 
 * Nombre del Archivo: Item.java
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
 *
 * @author oscar
 */
public class PanelPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form PanelPrincipal
     * @param frame
     */
    public PanelPrincipal(VentanaPrincipal frame) {
        initComponents();
        
        framePadre = frame;
        
        // Componentes
        panelLogin = new PanelLogin(framePadre);
        panelAspirante = new PanelAspirante();
        panelCohorte = new PanelCohorte();
        
//        Datos = new Vector();
        // Eventos
        EventosPanelPrincipal events = new EventosPanelPrincipal();
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
        botonCohorte = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botonLogin = new javax.swing.JButton();
        botonAspirante = new javax.swing.JButton();
        panelDer = new javax.swing.JPanel();

        panelIzq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonCohorte.setText("COHORTE");

        jButton2.setText("Opcion_3");

        jButton3.setText("Opcion_2");

        botonLogin.setText("Login");

        botonAspirante.setText("Inscripción Aspirante");

        javax.swing.GroupLayout panelIzqLayout = new javax.swing.GroupLayout(panelIzq);
        panelIzq.setLayout(panelIzqLayout);
        panelIzqLayout.setHorizontalGroup(
            panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCohorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAspirante, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelIzqLayout.setVerticalGroup(
            panelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzqLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(botonCohorte, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAspirante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JButton botonAspirante;
    private javax.swing.JButton botonCohorte;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelIzq;
    // End of variables declaration//GEN-END:variables
    private PanelLogin panelLogin;
    private PanelAspirante panelAspirante;
    private PanelCohorte panelCohorte;

    
    private VentanaPrincipal framePadre;
    
    
//    public void setDatos(Vector datos){
//        Datos=datos;
//    }
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
    
    private void asignarEventos(EventosPanelPrincipal events) {
        botonLogin.addActionListener(events);
        botonAspirante.addActionListener(events);
        botonCohorte.addActionListener(events);
    } // Fin del metodo asignarEventos
    
    private class EventosPanelPrincipal implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botonLogin) {
                actualizarPaneDer(panelLogin);
            }
            if (e.getSource() == botonAspirante){
                actualizarPaneDer(panelAspirante);            
            }
            if (e.getSource() == botonCohorte){
              
                actualizarPaneDer(panelCohorte);
                
            }
        }
    } // Fin de la clase EventosPanelPrincipal

} // Fin de la clase PanelPrincipal
