
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
   public double [] waga = {750, 1300, 2500, 5000, 7100}; //jednostka kg
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
    
    
 public double obliczOdksztalcenie(){
    // modul Younga ustawiany przez uzytkownika(globalnie)
    double odksztalcenie; //bez jednostki; odksztalcenie = zmiana l / l
    double modul_Younga = 1; //zainicjowane jako 1, alby można było wykonać dzielenie przez moduł Younga
       if("drewno".equals(Okno.typ_materialu)){
           modul_Younga = (double)Zasoby.mYdrewna;
       }//koniec if
       else if("aluminium".equals(Okno.typ_materialu)){
           modul_Younga = (double)Zasoby.mYalu;
       }//koniec else if
       
        odksztalcenie = obliczNaprezenie()/modul_Younga;
    return odksztalcenie;
 }//koniec obliczOdksztalcenie
 
    
    public double obliczNaprezenie(){
        
    double nap=0; //jednostka ciśnienia Pa = N/m^2
    //pole przekroju ustawiane przez uzytkownika
    double pole_przekroju; // jednostka m^2
    pole_przekroju = 1; //wartosc poczatkowa 1 potrzebna do zrealizowania dzielenia
        if("drewno".equals(Okno.typ_materialu)){
            String sprawdz1;
            sprawdz1 = (String)Okno.material_drewniany.getSelectedItem();
            
            switch(sprawdz1){
                case "1m^2":
                    pole_przekroju = 1;
                    break;
                case "2m^2":
                    pole_przekroju = 2;
                    break;
                case "3m^2":
                    pole_przekroju = 3;
                    break;
             
            }//koniec switch
            
            /*
            //gdyby nie dzialal switch: 
            if( "pierwszy" == Okno.material_drewniany.getSelectedItem()){
            }
            else if("drugi" == Okno.material_drewniany.getSelectedItem()){
             }
            else if("trzeci" == Okno.material_drewniany.getSelectedItem()){
            }
             */      
         
       }//koniec if
       else if("aluminium".equals(Okno.typ_materialu)){
           String sprawdz2;
            sprawdz2 = (String)Okno.material_alu.getSelectedItem();
            
            switch(sprawdz2){
                case "1m^2":
                    pole_przekroju = 1;
                    break;
                case "2m^2":
                    pole_przekroju = 2;
                    break;
                case "3m^2":
                    pole_przekroju = 3;
                    break;
            }//koniec switch
       }//koniec else if
        
        nap = obliczSile()/pole_przekroju;
    return nap;
 }//koniec obliczNaprezenie
 
 public double obliczSile(){
    //waga pobierana z samochodu zależna od poziomu
     double waga = podajWage(Zasoby.level);
    double sila=0;
    double g = 9.8; 
        sila = waga*g;
    return sila;
  }//koniec obliczSile()
 
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
        
        
       