/** 
 * Nombre del Archivo: VentanaPrincipal.java 
 * Fecha de Creacion: 15/11/2014 
 * Autor: Oscar Steven Romero Beron - 1326750 
 */

package View;

import Logica.Curso;
import Logica.FaseCurso;
import Logica.FasePractica;
import Logica.Usuario;
import Patrones.Item;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
=======
import java.util.Vector;
>>>>>>> 43ee9133adc34d37e6f8be7bdc78a15116ca554a
import javax.swing.*;
import Logica.*;
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
<<<<<<< HEAD
    
    // ATRIBUTO TEMPORALES SOLO PARA TERCERA ENTRAGA DE PATRONES DE 
    public static Curso objCurso = new Curso(); 
    public static ArrayList <Usuario> listUsuario = new ArrayList<Usuario>();
    
=======
   
>>>>>>> 43ee9133adc34d37e6f8be7bdc78a15116ca554a
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
        this.addWindowListener(events);
        botonCerrar.addActionListener(events);
    }
    
    private class EventosVentanaPrincipal implements ActionListener, WindowListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botonCerrar){
                panelPrincipal = new PanelPrincipal(VentanaPrincipal.this);
                actualizarPanelInferior(panelPrincipal);
            }
        }
<<<<<<< HEAD

        @Override
        public void windowOpened(WindowEvent e) {
        }

        @Override
        public void windowClosing(WindowEvent e) {
            
            //SOLO PARA TERCERA ENTRAGA DE PATRONES DE DISEÑO            
            Curso curso = VentanaPrincipal.objCurso;
            ArrayList <Item> listFasesCurso = curso.getListFases();
            System.out.println("LISTA DE FASES");
            for (int x = 0; x <  listFasesCurso.size(); x ++) {
                FaseCurso faseCurso = (FaseCurso)listFasesCurso.get(x);
                ArrayList <Item> listaPractica = faseCurso.getListPracticas();
                System.out.println("Codigo Fase:" + faseCurso.getCodigoFase());
                System.out.println("Lista de Practicas");
                for (int y = 0; y < listaPractica.size(); y++) {
                    FasePractica fasePractica = (FasePractica) listaPractica.get(y);
                    System.out.println("Codigo Practica " + fasePractica.getCodigoPractica());
                }
            }
        }        
        @Override
        public void windowClosed(WindowEvent e) {
        }

        @Override
        public void windowIconified(WindowEvent e) {
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
        }

        @Override
        public void windowActivated(WindowEvent e) {
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        }
    
    } // Fin de la clase EventosVentanaPrincipal
=======
        
    } // Fin de la clase EventosVentanaPrincipal
    
    

    
    public static void main(String args[]) {

        
        VentanaPrincipal v = new VentanaPrincipal();


    }
>>>>>>> 43ee9133adc34d37e6f8be7bdc78a15116ca554a
} // Fin de la clase VentanaPrincipal
