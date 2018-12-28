
package graedukacyjna;

/**
 *
 * @author Martyna Giziewicz
 * klasa, w której jeździ samochod
 */
import java.awt.*;
import java.util.*;



public  class Animacja extends Canvas {
    
   ArrayList<Point> points = new ArrayList<Point>();
   private int x =  Zasoby.polozenie_samochodu;
   private int y;
   private static int ax, ay;
    Animacja(){
   
        super();
        Color c=new Color(0f,0f,0f,0f);
        setBackground(Color.BLUE);
        
        setSize(1024,200);
        switch(Zasoby.level){
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
                        
        }//koniec switch
               
         
           while(x>80){
           x=x-10;
           points.add(new Point(x,y));
            repaint();
           }
        
        
    }//konieck Animacja()
       public void paint(Graphics g){
        
           int ax = this.ax;
           int ay = this.ay;
          
           Point x1;
           Graphics2D g2=(Graphics2D) g;
         
//               g2.setBackground(c);
            
           for(int i=0; i<points.size();i++){
               x1=points.get(i);
                ax = (int)x1.getX();
                 ay = (int)x1.getY();
                g2.clearRect(ax-10, ay, 300, 300); // usuniecie poprzedniego odrysowania
              //  g2.drawImage(Zasoby.tlo_ani.getImage(),ax, ay, null);
                g2.drawImage(Samochod.wyswietlSamochod(Zasoby.level).getImage(),ax,ay, null); // nowe odrysowanie
                
           try {
            Thread.sleep(90);
          } catch (InterruptedException ex) {System.out.println("Wyjatek: "+ex);      }
         }
      
     }
}//koniec klasy animacja
