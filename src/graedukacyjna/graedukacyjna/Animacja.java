
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
   public int polozenie_y [] = {55,105,82,68,98};
    Animacja(int level){
   
        super();
       
       // setBackground(Color.BLUE);
        
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
            default:
                break;
                        
        }//koniec switch
    
         //sprawdzamy powodzenie budowli
         if(Zasoby.powodzenie==true){
           while(x>80){
                x=x-10;
                points.add(new Point(x,y));
                repaint();
           }//koeniec while
         }//koniec if
         else if(Zasoby.powodzenie==false){
             while(x>=400){
                x=x-10;
                points.add(new Point(x,y));
                repaint();
             }//koeniec while
             while(x<400 & y<200){
                y=y+5;
                points.add(new Point(x,y));
                repaint();
             }//koniec while
         }// koniec else
        
    }//koniec konstruktora Animacja()
    
        public void zasadyRysowania(int y){
         
         
        }
       public void paint(Graphics g){
       Graphics2D g2=(Graphics2D) g; 
           int ax = this.ax;
           int ay = this.ay;
          
           Point x1;
           
          Color c=new Color(0f,0f,0f,0f);
              g2.setColor(c);
            
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
       
       } //koniec paint()
      
      

     public void zmienPolozenieY(){
         
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
            default:
                break;
                        
        }//koniec switch
         
      }//koniec zmienPolozenieY()
}//koniec klasy animacja