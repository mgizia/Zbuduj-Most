
package graedukacyjna;

import java.awt.*;
import java.util.*;

/**
 *
 * @author Martyna Giziewicz
 * Klasa Animacja rysuje poruszający się obiekt klasy Samochód, jeśli 
 * powodzenie == true
 */

public  class Animacja extends Canvas {

   ArrayList<Point> points = new ArrayList<Point>();
   private int x =  Zasoby.polozenie_samochodu; // polozenie samochodu na osi x
   private int ax, ay;

    Animacja(){
         super(); 
            setSize(1024,200);
  
    }//koniec konstruktora Animacja()
    
    
     //okreslony sposob poruszania się samochodu, jesli powodzenie == true
    public void rysyjDobra(){
        //sprawdzamy powodzenie budowli
        int y = Zasoby.polozenie_y[Zasoby.level];
           while(x>80){
                x=x-10;
                points.add(new Point(x,y));
                repaint();
           }//koniec while
      }//koniec RysujDobra()
        
   
       public void paint(Graphics g){
           
       Graphics2D g2=(Graphics2D) g; 
        
           Point x1;
           
           for(int i=0; i<points.size();i++){
               x1=points.get(i);
                ax = (int)x1.getX();
              
                 ay= Zasoby.polozenie_y[Zasoby.level];
                g2.clearRect(ax-10, ay, 300, 300); // usuniecie poprzedniego odrysowania
                g2.drawImage(Zasoby.tlo_animacji.getImage(), 0,0,null);
                g2.drawImage(Samochod.wyswietlSamochod(Zasoby.level),ax,ay, null); // nowe odrysowanie
                
         try {
            Thread.sleep(70);
          } //koniec try
           catch (InterruptedException ex) 
           {System.out.println("Wyjatek: "+ex);      
          }//koniec catch
         }//koniec for
       
       } //koniec paint()
      
}//koniec klasy animacja      
        
