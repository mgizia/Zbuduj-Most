/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graedukacyjna;

import static graedukacyjna.Punkty.liczPunkty;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.DIALOG;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Martynka
 */
public class UjemnePunkty extends Canvas{
  
    UjemnePunkty(){
        super();
        setSize(100,54);
        setBackground(Color.white);
        repaint();
    }//koniec konstruktora klasy UjemnePunkty()
     public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g; 
        g2.setFont(new Font(DIALOG, BOLD, 32));
        g2.drawString(odejmijPunkty(Zasoby.odksztalcenie),5,40);
    }//koniec metody paint()
     
    public static String odejmijPunkty(double odksztalcenie) {
         //czas gry w sekundach
          
         String punkty="";
           odksztalcenie= odksztalcenie*100000000; 
           odksztalcenie = odksztalcenie * 10 * 1/2 * Zasoby.level;
           odksztalcenie = Math.abs(odksztalcenie);
           int ujemne;
           ujemne = Zasoby.level * 10;
       
            //Zasoby.liczba_punktow = Zasoby.liczba_punktow - Math.abs((int)Math.round((Zasoby.level*10 - odksztalcenie))); 
            Zasoby.liczba_punktow = Zasoby.liczba_punktow - ujemne ;
                if(Zasoby.liczba_punktow < 0 ){
                    Zasoby.liczba_punktow = 0;
                    punkty = String.valueOf(Zasoby.liczba_punktow);
                }
                else { 
                    punkty = String.valueOf(Zasoby.liczba_punktow);
                }
    return punkty;
    }// koniec metody odejmijPunkty()
}//koniec klasy UjemnePunkty