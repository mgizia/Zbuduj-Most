
package graedukacyjna;

import javax.swing.*;

/**
 *
 * @author Martyna Giziewicz
 */
public class Zasoby {
    
    public static int level = 1;
    public static int polozenie_y [] = {55,105,82,68,98};
    public static int polozenie_samochodu = 750;
    public static int liczba_punktow;
    public static int mYdrewna = 11000; //[MPa] moduł Younga drewna dębowego wzdłuż włókien
    public static long mYalu = 69000; //[MPa] moduł Younga stopu glinu (aluminium)
    public static boolean start_animacji = false;
    public static boolean koniec_animacji = false;
    public static boolean powodzenie = true;
    
    public static ImageIcon tlo_ani= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tło_animacji.png");
    public static ImageIcon background= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tłobezmostu.png");  
    public static ImageIcon menu= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\menu.png");
    public static ImageIcon sprawdzenie= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\sprawdz.png");
    public static ImageIcon reset= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\reset.png");
    public static ImageIcon kontynuuj= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\kontynuuj.png");
    public static ImageIcon zakoncz= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\zakoncz.png");
    public static ImageIcon aluminium = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\aluminium.png");;
    public static ImageIcon wood = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\wood.png");
    public static ImageIcon poziom1 = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\poziom1.png");
    public static ImageIcon poziom2 = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\poziom2.png");
    public static ImageIcon poziom3 = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\poziom3.png");
    public static ImageIcon poziom4 = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\poziom4.png");
  //  public static ImageIcon [] cars;
   public static ImageIcon nastepny = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\nastepny.png");
   public static ImageIcon wyjdz = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\wyjdz.png");
   public static ImageIcon sprobuj = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\sprobuj.png");
    
    public static ImageIcon coin = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\cash.png");
   
    public static String nazwa = "E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\carred.png";
    public static ImageIcon car1 = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/carred.png");
    public static ImageIcon car2 =  pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/taxi.png");
    public static ImageIcon car3 = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/truckgreen.png");
    public static ImageIcon car4 = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/backhoeloader.png"); 
    public static ImageIcon car5 = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/truckred.png");
   
   public static double odksztalcenie; 
   
  
    public static String tlo = "E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tłobezmostu.png";
   public static String tlomost = "E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tło_mostdrewniany.png";
    
   
    public static ImageIcon pobierzObraz(String nazwa_pliku)
    {
        return new ImageIcon(nazwa_pliku);
    }//koniec pobierzObraz();
    
public static void zmienPolozenieSamochodu()
{
    polozenie_samochodu = polozenie_samochodu - 50;
   
}
    

}//koniec klasy Zasoby

