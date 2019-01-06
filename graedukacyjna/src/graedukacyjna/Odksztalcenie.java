
package graedukacyjna;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.DIALOG;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Martyna Giziewicz
 * Klasa rysująca informacje na temat odksztalcenia (wyliczonego na postawie wyborow gracza),
 *  po kazdej probie ukonczenia poziomu
 */
public class Odksztalcenie extends Canvas{
    
    private String zdanie = "    *   *   *   Odkształcenie wynosi: ";
    private String gwiazdki = ".    *   *   *";
    
    Odksztalcenie(){
        super();
        setSize(1024,20);
        setBackground(Color.lightGray);
        repaint();
    }//koniec konstruktora klasy Odksztalcenie()
    
     public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g; 
        g2.setFont(new Font(DIALOG, BOLD, 16));
        g2.drawString(zmienNaStringa(Zasoby.odksztalcenie),5,15);
    }//koniec metody paint()
     
     String zmienNaStringa(double odksztalcenie){
       String odkszt;
        odkszt = String.valueOf(odksztalcenie);
       String nowy;
       nowy = zdanie + odkszt + gwiazdki;
     return nowy;
     }//koniec metody zmienNaStringa()
}//koniec klasy Odksztalcenie
