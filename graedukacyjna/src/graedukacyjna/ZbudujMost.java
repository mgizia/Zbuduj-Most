
package graedukacyjna;

import java.awt.*;



/**
 *
 * @author Martyna Giziewicz
 */
public class ZbudujMost {
    
    
    public static void main(String[] args) {
        
        int szerokoscGry=1024;
        int wysokoscGry=680;
             
        //pobierz rozmiar ekranu
        int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;
        
        //wysrodkowane pole naroznika*
        int xCenter=(screenWidth-szerokoscGry)/2;
        int yCenter=(screenHeight-wysokoscGry)/2; 
        Zasoby.poczatkowyWyglad();
        new Okno(Zasoby.tlomost, szerokoscGry, wysokoscGry, xCenter, yCenter);
        
        
    }}
         /*       
        Okno poczatkowy=new Okno(szerokoscGry,wysokoscGry,xCenter,yCenter);
      
         //ustawienie koloru przeroczystego
        Color c=new Color(0f,0f,0f,0f);
        //dodanie samochodu jako przycisku
        JButton samochod = new JButton(new ImageIcon(Zasoby.nazwa));
        samochod.setBackground(c);
      //  samochod.setComponentOrientation(ComponentOrientation.UNKNOWN);
      
        samochod.setEnabled(false); //brak interakcji z przyciskiem
        
        
        samochod.setVisible(true);
        //label tło jest utworzony po to, aby okienko wypełnić grafiką
        JLabel tło = new JLabel(new ImageIcon(Zasoby.background));
        tło.setVisible(true);
        //layout , na ktorym będą umieszczane odpowiednie komponenty
        tło.setLayout(new BorderLayout());
        
        tło.add(samochod, BorderLayout.EAST);
       
        //dadanie komponentu tła do kontenera Okno
        poczatkowy.getContentPane().add(tło);
       
        
        
        
        
       // poczatkowy.add(tło);
       // poczatkowy.add(b);
        
        poczatkowy.setVisible(true);
        
       
        
        System.out.println("szer laptopa "+ screenWidth);
        System.out.println("wys laptopa " + screenHeight);
      
        
        
        
       
    }
   

}*/