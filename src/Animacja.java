
package graedukacyjna;

/**
 *
 * @author Martyna Giziewicz
 * klasa, w której jeździ samochod
 */
import java.awt.*;
import java.util.*;



public  class Animacja extends Canvas {
  // public static int poziom=1;
   ArrayList<Point> points = new ArrayList<Point>();

   private int x =  Zasoby.polozenie_samochodu;
   private int y = polozenie();
   private int ax, ay;
   public  int polozenie_y [] = {0,55,105,82,68,98};
    Animacja(){
   
        super(); 
       setSize(1024,200);
       
    }//koniec konstruktora Animacja()
    
    
        public void rysyjDobra(){
        //sprawdzamy powodzenie budowli
        
           while(x>80){
                x=x-10;
                points.add(new Point(x,y));
                repaint();
           }//koeniec while
      }//koniec RysujDobra()
        
        public void rysyjZla(){
             while(x>=400){
                x=x-10;
                points.add(new Point(x,y));
                repaint();
             }//koeniec while
             while(x<400 & y<300){
             
               y=y+5;
                points.add(new Point(x,y));
                repaint();
             }//koniec while
         
        }//koniec  rysujZla()
      
        
        public int polozenie(){
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
                
            //    while()
      
              //  g2.drawImage(Zasoby.tlo_ani.getImage(),ax, ay, null);
                g2.drawImage(Samochod.wyswietlSamochod(Zasoby.level).getImage(),ax,ay, null); // nowe odrysowanie
                
           try {
            Thread.sleep(90);
          } catch (InterruptedException ex) {System.out.println("Wyjatek: "+ex);      }
         }
       
       } //koniec paint()
      
      

    
}//koniec klasy animacja