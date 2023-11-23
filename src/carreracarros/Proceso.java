/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracarros;

import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Patricio
 */

public class Proceso extends Thread {
    

    Pista miPista;

    public Proceso(String name, Pista pista) {
        super(name);
        this.miPista = pista;
        
    }

    @Override
    public void run() {
   
        super.run(); //To change body of generated methods, choose Tools | Templates.

        switch (getName()) {

            case "Carro1":
                moverCarro(1);
                break;
            case "Carro2":
                moverCarro(2);
                break;
            case "Carro3":
                moverCarro(3);
                break;
        }
        
    }

private void moverCarro(int c) {
    long startTime = System.currentTimeMillis();

    switch (c) {
        case 1:
            while (miPista.getLblCarro1().getLocation().x < 830) {
                miPista.getLblCarro1().setLocation(miPista.getLblCarro1().getLocation().x + 10, miPista.getLblCarro1().getLocation().y);

                try {
                    // Genera un intervalo de tiempo aleatorio entre 50 y 200 milisegundos
                    Random random = new Random();
                    int intervalo = random.nextInt(150) + 50;
                    Thread.sleep(intervalo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            long endTimeCarro1 = System.currentTimeMillis();
            long tiempocarro1 = endTimeCarro1 - startTime;
            System.out.println("Carro 1 tardó " + tiempocarro1 + " milisegundos en llegar.");
            break;

        case 2:
            while (miPista.getLblCarro2().getLocation().x < 830) {
                miPista.getLblCarro2().setLocation(miPista.getLblCarro2().getLocation().x + 10, miPista.getLblCarro2().getLocation().y);

                try {
                    // Genera un intervalo de tiempo aleatorio entre 50 y 200 milisegundos
                    Random random = new Random();
                    int intervalo = random.nextInt(150) + 50;
                    Thread.sleep(intervalo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            long endTimeCarro2 = System.currentTimeMillis();
            long tiempocarro2= endTimeCarro2 - startTime;
            System.out.println("Carro 2 tardó " + tiempocarro2 + " milisegundos en llegar.");
            break;

        case 3:
            while (miPista.getLblCarro3().getLocation().x < 830) {
                miPista.getLblCarro3().setLocation(miPista.getLblCarro3().getLocation().x + 10, miPista.getLblCarro3().getLocation().y);

                try {
                    // Genera un intervalo de tiempo aleatorio entre 50 y 200 milisegundos
                    Random random = new Random();
                    int intervalo = random.nextInt(150) + 50;
                    Thread.sleep(intervalo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            long endTimeCarro3 = System.currentTimeMillis();
            long tiempocarro3 = endTimeCarro3 - startTime;
            System.out.println("Carro 3 tardó " + tiempocarro3 + " milisegundos en llegar.");
          
        
    }
 
}








}
        

