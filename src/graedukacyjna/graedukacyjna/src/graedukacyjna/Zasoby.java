
package graedukacyjna;

import java.awt.Image;
import javax.swing.*;

public class Zasoby {
    
    public static int level = 1;
    public static int polozenie_y [] = {0,55,105,82,68,98};
    public static int polozenie_samochodu = 750; // os x
    public static int liczba_punktow;
    public static int mYdrewna = 11000; //[MPa] moduł Younga drewna dębowego wzdłuż włókien
    public static long mYalu = 69000; //[MPa] moduł Younga stopu glinu (aluminium)
    public static boolean start_animacji = false;
    public static boolean koniec_animacji = false;
    public static boolean powodzenie = false;

    public static ImageIcon tlo_animacji= pobierzIcon("obrazy\\png\\tło_animacji.png");
    public static ImageIcon background= pobierzIcon("obrazy\\png\\tłobezmostu.png");  
    public static ImageIcon menu= pobierzIcon("obrazy\\png\\menu.png");
    public static ImageIcon sprawdzenie= pobierzIcon("obrazy\\png\\sprawdz.png");
    public static ImageIcon reset= pobierzIcon("obrazy\\png\\reset.png");
    public static ImageIcon kontynuuj= pobierzIcon("obrazy\\png\\kontynuuj.png");
    public static ImageIcon zakoncz= pobierzIcon("obrazy\\png\\zakoncz.png");
    public static ImageIcon aluminium = pobierzIcon("obrazy\\png\\aluminium.png");;
    public static ImageIcon wood = pobierzIcon("obrazy\\png\\wood.png");
    public static Image poziom1 = pobierzImg("obrazy\\png\\poziom1.png");
    public static Image poziom2 = pobierzImg("obrazy\\png\\poziom2.png");
    public static Image poziom3 = pobierzImg("obrazy\\png\\poziom3.png");
    public static Image poziom4 = pobierzImg("obrazy\\png\\poziom4.png");
        public static Image poziom5 = pobierzImg("obrazy\\png\\poziom5.png");
  //  public static ImageIcon [] cars;
   public static ImageIcon nastepny = pobierzIcon("obrazy\\png\\nastepny.png");
   public static ImageIcon wyjdz = pobierzIcon("obrazy\\png\\wyjdz.png");
   public static ImageIcon sprobuj = pobierzIcon("obrazy\\png\\sprobuj.png");
    
    public static ImageIcon coin = pobierzIcon("obrazy\\png\\cash.png");
   
   // public static String nazwa = "obrazy\\png\\carred.png";
    public static Image car1 = pobierzImg("obrazy/png/carred.png");
    public static Image car2 =  pobierzImg("obrazy/png/taxi.png");
    public static Image car3 = pobierzImg("obrazy/png/truckgreen.png");
    public static Image car4 = pobierzImg("obrazy/png/backhoeloader.png"); 
    public static Image car5 = pobierzImg("obrazy/png/truckred.png");
   
   public static double odksztalcenie; 
   
  
    public static String tlo = "obrazy\\png\\tłobezmostu.png";
   public static String tlomost = "obrazy\\png\\tło_moststalowy.png";
    
    public static ImageIcon tlo_zmostem = pobierzIcon(tlomost);
    public static ImageIcon most_stalowy = pobierzIcon("obrazy\\png\\tło_moststalowy.png");
   
    public static ImageIcon pobierzIcon(String nazwa_pliku)
    {
        return new ImageIcon(nazwa_pliku);
    }//koniec pobierzObraz();
    
       public static Image pobierzImg(String nazwa_pliku)
    {
        return  pobierzIcon(nazwa_pliku).getImage();
    }//koniec pobierzObraz();

}//koniec klasy Zasoby

