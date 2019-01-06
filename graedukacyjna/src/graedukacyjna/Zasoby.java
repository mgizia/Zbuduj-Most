
package graedukacyjna;

import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Martyna Giziewicz
 * Klasa Zasoby przechowuje zmienne statyczne gry: poczatkowe, ulegajace zmianom i nieulegajace zmianom 
 */
public class Zasoby {
    
    public static int level = 1; //gre zaczynam od poziomu pierwszego
    //polozenia kolenych samochodow na osi y, potrzebne do wyrysowywania kolejnych obiektow:
    public static int polozenie_y [] = {0,55,105,82,68,98,0};
    public static int polozenie_samochodu = 750; // os x
    public static int liczba_punktow;
    public static double odksztalcenie; 
    public static int mYdrewna = 11000; //[MPa] moduł Younga drewna dębowego wzdłuż włókien
    public static long mYalu = 69000; //[MPa] moduł Younga stopu glinu (aluminium)
    //zmienne boolowskie na początku ustawione jako false:
     public static boolean start_animacji = false;
     public static boolean koniec_animacji = false;
     public static boolean powodzenie = false;
    //ikony kojnych elementow gry:
     public static ImageIcon menu= pobierzIcon("res\\menu.png");
     public static ImageIcon sprawdzenie= pobierzIcon("res\\sprawdz.png");
     public static ImageIcon reset= pobierzIcon("res\\reset.png");
     public static ImageIcon kontynuuj= pobierzIcon("res\\kontynuuj.png");
     public static ImageIcon zakoncz= pobierzIcon("res\\zakoncz.png");
     public static ImageIcon aluminium = pobierzIcon("res\\aluminium.png");;
     public static ImageIcon wood = pobierzIcon("res\\wood.png");
     public static ImageIcon nastepny = pobierzIcon("res\\nastepny.png");
     public static ImageIcon wyjdz = pobierzIcon("res\\wyjdz.png");
     public static ImageIcon sprobuj = pobierzIcon("res\\sprobuj.png");  
     public static ImageIcon coin = pobierzIcon("res\\cash.png");
    //obrazy okreslajace poziom dla kolejnych poziomow
    public static Image poziom1 = pobierzImg("res\\poziom1.png");
    public static Image poziom2 = pobierzImg("res\\poziom2.png");
    public static Image poziom3 = pobierzImg("res\\poziom3.png");
    public static Image poziom4 = pobierzImg("res\\poziom4.png");
    public static Image poziom5 = pobierzImg("res\\poziom5.png");
   //obrazy okreslajace samochod dla kolejnych poziomow
    public static Image car1 = pobierzImg("res/carred.png");
    public static Image car2 =  pobierzImg("res/taxi.png");
    public static Image car3 = pobierzImg("res/truckgreen.png");
    public static Image car4 = pobierzImg("res/backhoeloader.png"); 
    public static Image car5 = pobierzImg("res/truckred.png");
  //rozne tla w zaleznosci od stanu gry:
    public static String tlo = "res\\tłobezmostu.png";
    public static String tlomost = "res\\tło_moststalowy.png";
    public static ImageIcon tlo_zmostem = pobierzIcon(tlomost);
    public static ImageIcon most_stalowy = pobierzIcon("res\\tło_moststalowy.png");
    public static ImageIcon tlo_animacji= pobierzIcon("res\\tło_animacji.png");
    public static ImageIcon background= pobierzIcon("res\\tłobezmostu.png");  
    
    //metoda zwracajaca ikone
    public static ImageIcon pobierzIcon(String nazwa_pliku)
    {
        return new ImageIcon(nazwa_pliku);
    }//koniec pobierzIcon();
    
    //metoda zwracajaca obraz
       public static Image pobierzImg(String nazwa_pliku)
    {
        return  pobierzIcon(nazwa_pliku).getImage();
    }//koniec pobierzObraz();

}//koniec klasy Zasoby

