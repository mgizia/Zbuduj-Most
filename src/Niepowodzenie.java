/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graedukacyjna;

import java.awt.*;
import java.util.*;



public  class Niepowodzenie extends Canvas {
  // public static int poziom=1;
   ArrayList<Point> punkty = new ArrayList<Point>();

   private int x =  Zasoby.polozenie_samochodu;
 //  private int y = polozenie();
   private int ax, ay;
 //  public  int polozenie_y [] = {0,55,105,82,68,98};
    Niepowodzenie(){
   
        super(); 
       setSize(1024,200);
    
       
    }//koniec konstruktora Animacja()
      
        public void rysyjZla(){
            int y = Zasoby.polozenie_y[Zasoby.level];
             while(x>=400){
                x=x-10;
                punkty.add(new Point(x,y));
                repaint();
             }//koeniec while
             while(x<400 & y<300){
             
               y=y+5;
                punkty.add(new Point(x,y));
                repaint();
             }//koniec while
         
        }//koniec  rysujZla()

      /*  public int polozenie(){
            switch(Zasoby.level){
            case 1:
                y=55;
                return y;
            case 2:
                y=105;
                return y;
            case 3:
                y=82;
               return y;
            case 4:
                y=68;
                return y;
            case 5:
                y=98;
               return y;
            default:
                break;
                        
        }//koniec switch
        return polozenie_y[Zasoby.level];
        }//koniec polozenie ()
      /*  public void zasadyRysowania(int poziom){
        
         switch(poziom){
            case 1:
                y=55;
                break;
            case 2:
                y=105;
                break;
            case 3:
                y=82;
               break;
            case 4:
                y=68;
                break;
            case 5:
                y=98;
               break;
            default:
                break;
                        
        }//koniec switch
    
        }*/
       public void paint(Graphics g){
       Graphics2D g2=(Graphics2D) g; 
          
           Point x1;
          Color c=new Color(0f,0f,0f,0f);
              g2.setColor(c);
            
           for(int i=0; i<punkty.size();i++){
               x1=punkty.get(i);
                ax = (int)x1.getX();
                ay = (int)x1.getY();  
               //  ay = Zasoby.polozenie_y[Zasoby.level];
                 if(ax>=400){
                    ay= Zasoby.polozenie_y[Zasoby.level];
                    g2.clearRect(ax-10, ay, 300, 300); // usuniecie poprzedniego odrysowani
                    g2.drawImage(Samochod.wyswietlSamochod(Zasoby.level).getImage(),ax,ay, null); // nowe odrysowanie
                 }
                 else if(ax<400 & ay <300 & ay > Zasoby.polozenie_y[Zasoby.level]){
                   
                     g2.clearRect(ax, ay-5, 300, 300);
                     g2.drawImage(Samochod.wyswietlSamochod(Zasoby.level).getImage(),ax,ay, null);
                 }
                
           try {
            Thread.sleep(90);
          } catch (InterruptedException ex) {System.out.println("Wyjatek: "+ex);      }
         }
       
       } //koniec paint()
      
      

    
}//koniec klasy Niepowodzenie