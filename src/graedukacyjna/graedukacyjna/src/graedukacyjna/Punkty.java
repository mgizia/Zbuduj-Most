
package graedukacyjna;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.DIALOG;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author Martyna Giziewicz
 */
public class Punkty extends Canvas{
  //  private static ArrayList<Integer> aktualna_liczba_punktow = new ArrayList<Integer>();
    Punkty(){
        super();
        setSize(100,54);
        setBackground(Color.white);
        repaint();
    }//koniec konstruktora klasy Punkty()
    
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g; 
        g2.setFont(new Font(DIALOG, BOLD, 32));
        g2.drawString(liczPunkty(Zasoby.odksztalcenie),5,40);
    }//koniec metody paint()
    
    public static String liczPunkty(double odksztalcenie) {
         //czas gry w sekundach
          odksztalcenie= odksztalcenie*100000000;
         String punkty="";
        
            odksztalcenie = odksztalcenie * 100 * 1/2 * Zasoby.level;
            odksztalcenie = Math.abs(odksztalcenie);
            Zasoby.liczba_punktow += Math.round(Zasoby.level*100 - odksztalcenie); 
              //  aktualna_liczba_punktow.add(new Integer(Zasoby.liczba_punktow));
        
      punkty = String.valueOf(Zasoby.liczba_punktow);
      return punkty;
    }// koniec metody liczPunkty()
}
