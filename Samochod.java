
package graedukacyjna;

import javax.swing.*;

/**
 *
 * @author Martyna Giziewicz
 * Klasa samochod odzwierciedla obiekty samochodu- różne na kolejnych etapach gry
 */

public class Samochod extends JLabel {
    //zmienne klasy samochód
   public int ilosc_samochodow =5;
   public double [] waga = {100,200,300,400,500};
   //obrazek
  
  
    //konstruktor klasy samochód- zmienne są samochody i ich ciężar
    Samochod()
    {
        super(wyswietlSamochod(Zasoby.level));
        this.waga = waga;
        
    }//koniec konstruktora samochod
    
    /*metoda umieszcza konkretny obiekt w animacji
    dostaje int level z Zasobow; 
    kazdy level ma inny samochód*/
    public static ImageIcon wyswietlSamochod(int level)
    {
        switch(level)
        {
            case 1:
               return Zasoby.car1;
               
            case 2:
                return Zasoby.car2;
            
            case 3:
                return Zasoby.car3;
            
            case 4:
                return Zasoby.car4;
            
            case 5:
                return Zasoby.car5;
                   
        }//koniec switch
      return null;
    }//koniec metody wyswietl samochod
    
    public double podajWage(int level){
        switch(level)
        {
            case 1:
               return waga[0];
               
            case 2:
                return waga[1];
            
            case 3:
                return waga[2];
            
            case 4:
                return waga[3];
            
            case 5:
                return waga[4];
                   
        }//koniec switch
      return 0;   
    }//koniec podajWage 
    
   /* public int podajPolozenie(int xstart){
        int xwyjscie=0;
            java.util.Timer timer1 = new java.util.Timer();
            Animacja timer1zad = new Animacja();
            timer1.schedule(timer1zad, 0, 20);
            
        return xwyjscie;
        
    }//koniec podajPolozenie */
}//koniec klasy poziom

       
        /*  ImageIcon samochody[] = new ImageIcon[5];
        samochody[0] = Zasoby.car1;
        samochody[1] = Zasoby.car2;
        samochody[2] = Zasoby.car3;
        samochody[3] = Zasoby.car4;
        samochody[4] = Zasoby.car5;
      
        int x =700;
        int y = 190;
        int h =300;
        int w = 300;*/
        //kazdy z case'ów tworzy obiekt Samochod, wczytuje obrazek, przekazuje go do animacji
        
        
       