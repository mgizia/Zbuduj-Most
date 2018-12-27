
package graedukacyjna;

/**
 *
 * @author Martyna Giziewicz
 * klasa, w której jeździ samochod
 */
import java.util.*;


public  class Animacja extends TimerTask {
    
    @Override
    public void run(){
        
         Zasoby.zmienPolozenieSamochodu();
        
    }//koniec run
   

    
}
