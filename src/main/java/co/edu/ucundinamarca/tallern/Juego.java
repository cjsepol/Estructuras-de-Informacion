package co.edu.ucundinamarca.tallern;

import java.util.logging.Logger;

public class Juego {
    
  static Logger log = Logger.getLogger(Juego.class.getName());  

  public int vidas, record;
  
  private int vidasI = 5;

  public void vidasIniciales(){
    vidas = vidasI;   
  }
  public void quitaVida(){
    vidas = vidas - 1;  
    if(vidas == 0){
      log.info("Juego terminado");      
    }    
  }
  public void reiniciaPartida(){
    vidasIniciales();
  }
  public void actualizaRecord(){
    if(vidas == record){
      log.info("alcanzo record");      
    }
    if(vidas > record){
      log.info("sobrepaso el record");    
    }    
  }
 
  public void muestraVidasRestantes(){
    log.info("Vidas restantes = " + vidas);  
  }
 } 
