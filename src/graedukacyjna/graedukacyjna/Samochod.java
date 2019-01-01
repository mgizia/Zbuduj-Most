
package graedukacyjna;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Martyna Giziewicz
 * Klasa samochod odzwierciedla obiekty samochodu- różne na kolejnych etapach gry
 */

public class Samochod extends Canvas {
    //zmienne klasy samochód
   public int ilosc_samochodow =5;
   public double [] waga = { 1300, 2500, 5000, 7100, 12000}; //jednostka kg

   //obrazek
  
  
    //konstruktor klasy samochód- zmienne są samochody i ich ciężar
    Samochod()
    {
        super();
        setSize(300,200);
        repaint();
      
    }//koniec konstruktora samochod
    
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g; 
        g2.drawImage(Zasoby.tlo_animacji.getImage(), 0,0,null);
        g2.drawImage(wyswietlSamochod(Zasoby.level).getImage(),5,Zasoby.polozenie_y[Zasoby.level], null);
    }//koniec paint
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
       
        odksztalcenie = obliczNaprezenie()/modul_Younga; // MPa/MPa = zgodne jednostki
        Zasoby.odksztalcenie = odksztalcenie; 
        czyPowodzenie(odksztalcenie);
        
     return odksztalcenie;
 }//koniec obliczOdksztalcenie
 
    public void czyPowodzenie(double odksztalcenie){
        odksztalcenie= odksztalcenie*100000000;
        if(odksztalcenie<1){
            Zasoby.powodzenie = true;   
        }
        else{
            Zasoby.powodzenie = false;   
        }
   
    }
    
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
                    pole_przekroju = 10000;//pole przekroju w cm
                    break;
                case "2m^2":
                    pole_przekroju = 20000;
                    break;
                case "3m^2":
                    pole_przekroju = 30000;
                    break;
                default: 
                    break;
            }//koniec switch
                
         
       }//koniec if
       else if("aluminium".equals(Okno.typ_materialu)){
           String sprawdz2;
            sprawdz2 = (String)Okno.material_alu.getSelectedItem();
            
            switch(sprawdz2){
                case "1m^2":
                    pole_przekroju = 10000;//pole przekroju w cm
                    break;
                case "2m^2":
                    pole_przekroju = 20000;
                    break;
                case "3m^2":
                    pole_przekroju = 30000;
                    break;
                default: 
                    break;
            }//koniec switch
       }//koniec else if
        
        nap = obliczSile()/pole_przekroju; //kN/cm^2 = 10MPa,
        nap = nap/10; // dzielimy przez 10, aby miec jednostke 1MPa
    return nap;
 }//koniec obliczNaprezenie
 
 public double obliczSile(){
    //waga pobierana z samochodu zależna od poziomu
    double waga = podajWage(Zasoby.level);
    double sila = 0;
    double g = 9.8; // [m/s]
        sila = waga*g; //wynik w N (kg*(m/s))
        sila = sila/1000; //wynik w kN potrzebny do dalszych obliczen
    return sila;
  }//koniec obliczSile()
 
}//koniec klasy Samochod
      