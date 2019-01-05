
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
   private int ax, ay;

    Animacja(){
         super(); 
            setSize(1024,200);
  
    }//koniec konstruktora Animacja()
    
    
    public void rysyjDobra(){
        //sprawdzamy powodzenie budowli
        int y = Zasoby.polozenie_y[Zasoby.level];
           while(x>80){
                x=x-10;
                points.add(new Point(x,y));
                repaint();
           }//koeniec while
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
        
     /*   public int polozenie(){
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
        }//koniec polozenie ()*/
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