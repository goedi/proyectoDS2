/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.Vector;
import Patrones.*;
import logica.*;
/**
 *
 * @author cristian
 */
public class ControladorTablas {
    private Vector titulo;
    private Vector cuerpo;
    private ObjectColeccion iterador;
    
   public ControladorTablas(){
              Aspirante a = new Aspirante("1","","","","","","","","","","",true,"",true);
        Aspirante b = new Aspirante("2","","","","","","","","","","",true,"",true);
        Aspirante c = new Aspirante("3","","","","","","","","","","",true,"",true);
        Vector prueba = new Vector();
        prueba.add(a.toArray());
        prueba.add(b.toArray());
        prueba.add(c.toArray());
       
       
       titulo = new Vector();
       cuerpo = new Vector();
       iterador = new ObjectColeccion(prueba);
   }
    
    public Vector titulos(int tipo){
        switch (tipo) {
            case 1: {
                titulo.add("Nombre");
                titulo.add("Apellido");
                titulo.add("Documento");
                titulo.add("Correo");
                titulo.add("Celular");
                titulo.add("Sede");
                titulo.add("Código Dane");
                titulo.add("Grado");
                titulo.add("Secretaria");
                titulo.add("Municipio");
                titulo.add("Area");
                titulo.add("Actualmente es tutor PTA");
                titulo.add("Usuario Colombia Aprende");
                titulo.add("Estado");
                
               
            };break;
            case 2 : {
               
            };break;
            case 3 : {
                
            };break;
                        
            default: {
                System.out.println("Titulos invalidos");
            };
        }
        return titulo;
    }
    
    public Vector contruirCuerpo(){
        
       ObjetoIterador libroIterator = iterador.iterator();
        System.out.print("se agrego al objeto");
        while (libroIterator.hasNext()) {
            Object objeto = libroIterator.next();
           
            cuerpo.add(objeto);
        }
        return cuerpo;
    }
    
    
    
}
