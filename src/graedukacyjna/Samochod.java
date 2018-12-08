
package graedukacyjna;

import javax.swing.*;

/**
 *
 * @author Martyna Giziewicz
 * Klasa samochod odzwierciedla obiekty samochodu- różne na kolejnych etapach gry
 */

public class Samochod {
    //zmienne klasy samochód
   public int ilosc_samochodow =5;
   public double [] waga;
   //obrazek
  
   
    //konstruktor klasy samochód- zmienne są samochody i ich ciężar
    Samochod()
    {
        
        this.waga = waga;
        
    }//koniec konstruktora samochod
    
    //metoda wyswietl Samochod () umieszcza konkretny obiekt samochód w animacji
    //dostaje int level; każdy level ma inny samochód
    public void wyswietlSamochod(int level)
    {
        ImageIcon samochody[] = new ImageIcon[5];
        samochody[0] = Zasoby.car1;
        samochody[1] = Zasoby.car2;
        samochody[2] = Zasoby.car3;
        samochody[3] = Zasoby.car4;
        samochody[4] = Zasoby.car5;
        
        
        
        //kazdy z case'ów tworzy obiekt Samochod, wczytuje obrazek, przekazuje go do animacji
        switch(level)
        {
            case 1:
            break;
            
            case 2:
            break;
            
            case 3:
            break;
            
            case 4:
            break;
            
            case 5:
            break;
                   
        }//koniec switch
    }//koniec metody wyswietl samochod
}//koniec klasy poziom
