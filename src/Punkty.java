
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
    private static ArrayList<Integer> aktualna_liczba_punktow = new ArrayList<Integer>();
    Punkty(){
        super();
        setSize(100,54);
        setBackground(Color.white);
        repaint();
    }//koniec konstruktora klasy Punkty()
    
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g; 
        g2.setFont(new Font(DIALOG, BOLD, 32));
        g2.drawString(liczPunkty(0,Zasoby.odksztalcenie),5,40);
    }//koniec metody paint()
    
     public static String liczPunkty(double czas_gry, double odksztalcenie) {
         //czas gry w sekundach
          odksztalcenie= odksztalcenie*100000000;
         String punkty="";
         if(odksztalcenie<1){
            odksztalcenie = odksztalcenie * 100 * 1/2 * Zasoby.level;
            Zasoby.liczba_punktow += Math.round(Zasoby.level*100 - czas_gry - odksztalcenie); 
              //  aktualna_liczba_punktow.add(new Integer(Zasoby.liczba_punktow));
         }
         else if(Zasoby.liczba_punktow>0){
             Zasoby.liczba_punktow = Zasoby.liczba_punktow - 10; // ujemne 10 punktow za nieudana probe
         }
      punkty = String.valueOf(Zasoby.liczba_punktow);
      return punkty;
    }// koniec metody liczPunkty()
}

/*
public class Punkty extends JLabel{
    
    Punkty(double odkszt){
        super(liczPunkty(0,odkszt));
        setFont(new Font(DIALOG, BOLD, 32));
        setVisible(true);
    }//koniec konstruktora klasy Punkty
    
    // po animacji wykonujemy obliczenie, dodajemy zdobyte punkty do poprzedniej liczby puntow
    
}
*/