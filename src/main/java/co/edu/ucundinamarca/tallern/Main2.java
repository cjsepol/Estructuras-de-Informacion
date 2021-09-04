package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

public class Main2 {
    
    static Logger log = Logger.getLogger(Juego.class.getName());
    
    public static void main(String[] args) {
        
      Juego objQuitaVida = new Juego();
      objQuitaVida.quitaVida();
      
      Juego objMuestraVidas = new Juego();
      objMuestraVidas.muestraVidasRestantes();
      
      Juego objReiniciaPartida = new Juego();
      objReiniciaPartida.reiniciaPartida();
      
      Juego objMuestraVidasR = new Juego();
      objMuestraVidasR.muestraVidasRestantes();
      
      Juego objActualR = new Juego();
      objActualR.actualizaRecord();
        
    }
    
    
}
