/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graedukacyjna;

//import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Martyna Giziewicz
 */
public class Zasoby {
    
    public static int level = 4 ;
    
    public static ImageIcon background= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tłobezmostu.png");  
    public static ImageIcon menu= pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\menu.png");
    public static ImageIcon aluminium = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\aluminium.png");;
    public static ImageIcon wood = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\wood.png");
    public static ImageIcon poziom1 = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\poziom1.png");
    public static ImageIcon poziom2 = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\poziom2.png");
    public static ImageIcon poziom3 = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\poziom3.png");
    public static ImageIcon poziom4 = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\poziom4.png");
  //  public static ImageIcon [] cars;
   
    public static ImageIcon coin = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\cash.png");
   
    public static String nazwa = "E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\carred.png";
    public static ImageIcon car1 = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/carred.png");
    public static ImageIcon car2 =  pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/taxi.png");
    public static ImageIcon car3 = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/truckgreen.png");
    public static ImageIcon car4 = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/truckred.png");
    public static ImageIcon car5 = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/backhoeloader.png");
  
    public static String tlo = "E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tłobezmostu.png";
   public static String tlomost = "E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tło_mostdrewniany.png";
    
    public static void poczatkowyWyglad()
    {
        
      
        //nazwa = "E:/PG/semestr5/wjp/projekt/obrazy/png/carred.png";
        //background = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tłobezmostu.png"); 
       // menu = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/menu.png");
        //aluminium = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/aluminium.png");
        //coin = pobierzObraz("E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\coin.png");
       // wood = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/wood.png");
       // cars[0] = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/carred.png");
       // cars[1] = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/taxi.png");
      //  cars[2] = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/truckgreen.png");
       // cars[3] = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/truckred.png");
       // cars[4] = pobierzObraz("E:/PG/semestr5/wjp/projekt/obrazy/png/backhoeloader.png");
        //tlomost = "E:\\PG\\semestr5\\wjp\\projekt\\obrazy\\png\\tło_mostdrewniany.png";
    
    }//koniec metody poczatkowyWyglad

    public static ImageIcon pobierzObraz(String nazwa_pliku)
    {
        return new ImageIcon(nazwa_pliku);
    }//koniec pobierzObraz();
    
 
    
}//koniec klasy zasoby

