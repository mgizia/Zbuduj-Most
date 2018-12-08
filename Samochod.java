
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
   public double waga;
   //obrazek
  
  
    //konstruktor klasy samochód- zmienne są samochody i ich ciężar
    Samochod()
    {
        super(wyswietlSamochod(Zasoby.level));
        this.waga = waga;
        
    }//koniec konstruktora samochod
    
    //metoda wyswietl Samochod () umieszcza konkretny obiekt samochód w animacji
    //dostaje int level; każdy level ma inny samochód
    public static ImageIcon wyswietlSamochod(int level)
    {
       
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
               return waga;
               
            case 2:
                return waga;
            
            case 3:
                return waga;
            
            case 4:
                return waga;
            
            case 5:
                return waga;
                   
        }//koniec switch
      return 0;
        
    }//koniec podajWage
}//koniec klasy poziom
