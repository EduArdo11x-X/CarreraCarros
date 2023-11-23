/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracarros;

import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patricio
 */
public class Reloj extends Thread{

    Pista miPista;
    public Reloj(String name,Pista pista) {
        super(name);
        this.miPista=pista;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
        if(getName().equals("reloj")){
            String hora;
        LocalDateTime tiempo;
       while(true){
            tiempo=LocalDateTime.now();
            hora=String.valueOf(tiempo.getHour()) + ":" + String.valueOf(tiempo.getMinute())+":" +String.valueOf(tiempo.getSecond());
          
            miPista.getLblReloj().setText(hora);
            }
        }
    }
    
    
    
}
