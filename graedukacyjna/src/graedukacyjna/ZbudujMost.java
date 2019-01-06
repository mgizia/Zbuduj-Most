package graedukacyjna;

import java.awt.*;

/**
 *
 * @author Martyna Giziewicz
 * Klasa ZbudujMost jest głowna klasa projektu graedukacyjna
 */
public class ZbudujMost {
    
    
    public static void main(String[] args) {
        
        int szerokoscGry=1024;
        int wysokoscGry=680;
             
        //pobierz rozmiar ekranu
        int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;
        
        //wysrodkowane pole naroznika
        int xCenter=(screenWidth-szerokoscGry)/2;
        int yCenter=(screenHeight-wysokoscGry)/2; 
        Okno okno = new Okno(Zasoby.tlomost, szerokoscGry, wysokoscGry, xCenter, yCenter);
        
    }//koniec main()
    
}//koniec klasy Zbuduj Most
         