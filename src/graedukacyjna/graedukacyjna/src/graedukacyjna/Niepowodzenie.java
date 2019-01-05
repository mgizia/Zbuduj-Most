
package graedukacyjna;

import java.awt.*;
import java.util.*;



public  class Niepowodzenie extends Canvas {
  // public static int poziom=1;
   ArrayList<Point> punkty = new ArrayList<Point>();

   private int x =  Zasoby.polozenie_samochodu;
   private int ax, ay;

    Niepowodzenie(){
        super(); 
         setSize(1024,200);   
    }//koniec konstruktora Animacja()
      
        public void rysyjZla(){
            int y = Zasoby.polozenie_y[Zasoby.level];
             while(x>=550){
                x=x-10;
                punkty.add(new Point(x,y));
                repaint();
             }//koeniec while
             while(x<550 & y<300){
             
               y=y+5;
                punkty.add(new Point(x,y));
                repaint();
             }//koniec while
         
        }//koniec  rysujZla()

      
       public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g; 
         Point x1;
         
           for(int i=0; i<punkty.size();i++){
               x1=punkty.get(i);
                ax = (int)x1.getX();
                ay = (int)x1.getY();  
               
                 if(ax>=550){
                    ay= Zasoby.polozenie_y[Zasoby.level];

                    g2.clearRect(ax-10, ay, 300, 300); // usuniecie poprzedniego odrysowani
                    g2.drawImage(Zasoby.tlo_animacji.getImage(), 0,0,null);
                    g2.drawImage(Samochod.wyswietlSamochod(Zasoby.level),ax,ay, null); // nowe odrysowanie
                 }
                 else if(ax<550 & ay <300 & ay > Zasoby.polozenie_y[Zasoby.level]){
                      
                     g2.clearRect(ax, ay-5, 300, 300);
                     g2.drawImage(Zasoby.tlo_animacji.getImage(), 0,0,null);
                     g2.drawImage(Samochod.wyswietlSamochod(Zasoby.level),ax,ay, null);
                 }
                
           try {
            Thread.sleep(70);
          } //koniec try
           catch (InterruptedException ex) 
           {System.out.println("Wyjatek: "+ex);      
          }//koniec catch
       }//koniec for
       } //koniec paint()
    
}//koniec klasy Niepowodzenie