/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracarros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Patricio
 */
public class CarreraCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pista pista = new Pista();
        pista.setVisible(true);
        Reloj hilo=new Reloj("reloj", pista);
        
       // hilo.start();//Inicio Reloj...
        
       pista.getBtnEmpezar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                  Proceso hiloc1= new Proceso("Carro1", pista);
                  hiloc1.start();
                  
                  Proceso hiloc2= new Proceso("Carro2", pista);
                  hiloc2.start();
                  Proceso hiloc3= new Proceso("Carro3", pista);
                  hiloc3.start();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
  
    
}
