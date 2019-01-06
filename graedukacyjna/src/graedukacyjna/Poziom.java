
package graedukacyjna;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

/**
 *
 * @author Martyna Giziewicz
 * Klasa Poziom rysuje  dla kolejnych poziomow obrazek informujacy o tym, na jakim etapie gry jest uzytkownik 
 */

public class Poziom extends Canvas{

    Poziom(){
        super();
        setSize(133,47);
        setBackground(Color.white);
        repaint();
    }//koniec konstruktora klasy Poziom
    
    //metoda zwracajaca obraz zalezny od poziomu
    public Image ktoryPoziom(){
        switch(Zasoby.level){
            case 1:
                return Zasoby.poziom1;
            case 2:
                return Zasoby.poziom2;
            case 3:
                return Zasoby.poziom3;
            case 4:
                return Zasoby.poziom4;
            case 5:
                return Zasoby.poziom5;  
            default:
                return Zasoby.poziom5;
        }//koniec switch
      
    }//koniec metody ktoryPoziom
    
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.drawImage(ktoryPoziom(),0,0,null);
    }//koniec paint()
    
}//koniec klasy Poziom
