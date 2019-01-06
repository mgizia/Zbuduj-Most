
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
 * Klasy UjemnePunkty wylicza i rysuje punkty w przypadku powodzenie == false
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
        
      //Zmienne potrzebne do zastosowania innych mozliwosci odejmowania punktow (zaprezentowane pozniżej):
            // odksztalcenie= odksztalcenie*100000000; 
            //odksztalcenie = odksztalcenie * 100 * 1/2 * Zasoby.level;
            //odksztalcenie = Math.abs(odksztalcenie);
            //int ujemne;
            //ujemne = Zasoby.level * 10;
        
          String punkty="";
          
         if(Zasoby.powodzenie == false){
          switch(Zasoby.level){
              case 1: 
                  Zasoby.liczba_punktow = Zasoby.liczba_punktow - 10 ;
                  break;
             case 2: 
                  Zasoby.liczba_punktow = Zasoby.liczba_punktow - 40 ;
                  break;
             case 3: 
                  Zasoby.liczba_punktow = Zasoby.liczba_punktow/2 - 150 ;
                  break;
            case 4: 
                  Zasoby.liczba_punktow = Zasoby.liczba_punktow/2 - 250 ;
                  break;
            case 5: 
                  Zasoby.liczba_punktow = Zasoby.liczba_punktow/2 - 350 ;
                  break;
          
          }
         }
       
          
             /*inne możliwości odejmowania punktów:
                  * Zasoby.liczba_punktow = Zasoby.liczba_punktow - Math.abs(Math.round((Zasoby.level*10 - odksztalcenie))); 
                  * Zasoby.liczba_punktow = Zasoby.liczba_punktow - 30 ;
                  *Zasoby.liczba_punktow = Zasoby.liczba_punktow/3 - (int)odksztalcenie);*/
             
             //zabezpieczenie przed tym, aby użytkownik nie miał ujemnej liczby punktów:
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