/** 
 * Nombre del Archivo: VentanaPrincipal.java 
 * Fecha de Creacion: 15/11/2014 
 * Autor: Oscar Steven Romero Beron - 1326750 
 */

package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;
import logica.*;
/**
 * Nombre Clase:
 * Funcion: 
 */

public class VentanaPrincipal extends JFrame {
    
    private JPanel panelBase;
    private JPanel panelSuperior;
    private JPanel panelInferior;
    private PanelPrincipal panelPrincipal;
    private JButton botonCerrar;
   
    /*
      Nombre: Ventana
      Proposito: Constructor de la clase, en el se asignan las caracteristicas
      del JFrame
    */
    public VentanaPrincipal() {
        // Carga el LookAndFeel    
        cargarLookAndFeel(); 
        
        // Iniciar componentes panelBase
        panelBase();
        
        
        // Caracteristicas Frame
        this.setMinimumSize(new Dimension(1000, 650));
        this.setTitle ("ABC-CIER");
        this.getContentPane().add(panelBase);
        this.pack();
        this.setLocationRelativeTo(null);         
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Eventos 
        EventosVentanaPrincipal event = new EventosVentanaPrincipal();
        asignarEvenros(event);
    } // Fin del Constructor

    private void panelBase(){
        panelBase = new JPanel(new BorderLayout());        
        // Components
        panelSuperior();               
        panelInferior();
        // Add Components
        panelBase.add(panelSuperior, BorderLayout.NORTH);
        panelBase.add(panelInferior, BorderLayout.SOUTH);
    } // Fin del metodo panelPrincipal
    
    
    private void panelSuperior(){
        panelSuperior = new JPanel(new FlowLayout());
        // Components   
        botonCerrar = new JButton("Cerrar Sesión");
        // Add Components     
        panelSuperior.add(botonCerrar);
    } // Fin del metodo panelSuperior
    
    
    private void panelInferior(){
        panelInferior = new JPanel(new FlowLayout());
        // Components
        panelPrincipal = new PanelPrincipal(this); 

        // Add Components
        panelInferior.add(panelPrincipal);        
    }// Fin del metodo panelInferior
    
    /**
     * Nombre: actualizarPanelInferior
     * Proposito: Metodo que cambiar el contenido del panelInferior
     * @param panelNuevo 
     */
    public void actualizarPanelInferior(JPanel panelNuevo){
        panelInferior.removeAll();
        panelInferior.add(panelNuevo);
        panelInferior.repaint();
        panelInferior.updateUI();
    } // Fin del metodo acutlizar panel Inferior
    
    /*
     Nombre: cargarLookAndFeel
     Proposito: Metodo que carga LookAndFeel de la interfaz
     */
    private void cargarLookAndFeel() {
        try {
            // Se cargar el look And Feel por defecto en java en caso de que ocurra una excepcion
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            /*
             Luego cargamos el nuevo lookAndFeel para la aplicacion, si ocurre una excepcion
             se mostrará el look And Feel por defecto en java
             */
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            //Actualizamos el componente
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exception) {
            System.out.println("No se pudo cargar el lookAndFeel");
        }
    } // Fin del metodo cargarLookAndFeel

    private void asignarEvenros (EventosVentanaPrincipal events) {
        botonCerrar.addActionListener(events);
    }
    
    private class EventosVentanaPrincipal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botonCerrar){
                panelPrincipal = new PanelPrincipal(VentanaPrincipal.this);
                actualizarPanelInferior(panelPrincipal);
            }
        }
        
    } // Fin de la clase EventosVentanaPrincipal
    
    

    
    public static void main(String args[]) {

        
        VentanaPrincipal v = new VentanaPrincipal();


    }
} // Fin de la clase VentanaPrincipal
