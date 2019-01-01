
package graedukacyjna;




import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.DIALOG;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Martyna Giziewicz
 */
public class Okno extends JFrame {
    
    
    public static JComboBox material_drewniany;
    public static JComboBox material_alu;
    public static String typ_materialu;
    public static boolean widocznosc_menu;
    
    public Okno(String fname, int szerokosc, int wysokosc, int xcenter, int ycenter) {
    super();
  

    setResizable(false); //zablokuj mozliwosc zmian rozmiaru okna
    setSize(szerokosc, wysokosc); //ustaw wymiary okna
    setLocation(xcenter,ycenter); //ustaw pozycje okna
    setUndecorated(true); //ukryj ramke okna i przyciski kontroln
    StworzPanel gra = new StworzPanel(fname,szerokosc,wysokosc);
    //ustawienia Layoutu dla panelu gra
    gra.setLayout(null);
    /*W takim kontenerze pobsługujemy się "absolutnym"
    pozycjonowaniem  i wymiarowaniem komponentów  np. za pomocą metody setBounds(x,y,w,h)*/
    
    //dodawanie kolejnych labeli do panelu gry
         
        Samochod samochod = new Samochod();  
        
        JLabel animowane =  new JLabel();
        animowane.setVisible(false);
        
        dodajAnimacje(samochod,Zasoby.start_animacji,animowane);
     
        //przyciski menu wyswietlanego po probie przejscia kolejnego poziomu
            JLabel wyjdz = new JLabel(Zasoby.wyjdz);
            wstawObiekt(100,500, 156,42, wyjdz);
                wyjdz.setVisible(false);
        JLabel nastepny = new JLabel(Zasoby.nastepny);
            wstawObiekt(400,500, 270,42,nastepny);
                nastepny.setVisible(false);
        JLabel sprobuj = new JLabel(Zasoby.sprobuj);
            wstawObiekt(400,500, 270,42, sprobuj);
                sprobuj.setVisible(false);
      
      //poczatkowa liczba punktow to 100
//       Punkty punkty = new Punkty(0);  
       // wstawObiekt(815, 41, 118, 64, punkty);  
        
        //sprawdzenie powodzenia
    JLabel sprawdz = new JLabel(Zasoby.sprawdzenie);
        wstawObiekt(409, 142, 226, 42, sprawdz); 
           kursorLapki(sprawdz);
           
      //  Punkty punkciki = new Punkty(0);  
      //  punkciki.setVisible(false);
       
      JLabel punkty = new JLabel();
      punkty.setVisible(false);
       // Punkty wynik = new Punkty();
      //  wstawObiekt(815, 41, 118, 64, punkty);
        
        
        sprawdz.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //wyswietla wynik
           double odksztalcenie = samochod.obliczOdksztalcenie();
            
             wstawObiekt(815, 41, 118, 64, punkty);
               System.out.println("Odksztalcenie wynosci: " + odksztalcenie );  
               Zasoby.start_animacji = true;
             // punkty.setVisible(false);
              //if(Zasoby.powodzenie == true){
           
            //  Punkty punkciki = new Punkty(odksztalcenie);  
            //  wstawObiekt(815, 41, 118, 64, wynik);
            //  punkciki.setVisible(true);
             // }
               dodajPunkty(punkty);
               dodajAnimacje(samochod, Zasoby.start_animacji, animowane);
               dodajMenu(wyjdz,nastepny,sprobuj);
               sprawdz.setVisible(false);
               
             add(gra);   
            }  
        });
    
         
            wyjdz.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                    System.exit(0);
                }
            });
         
         sprobuj.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent en) {
                  
                    Zasoby.start_animacji = false; 
                    dodajAnimacje(samochod,Zasoby.start_animacji,animowane);
                    sprawdz.setVisible(true);
                   add(gra); 
                    
                }
            });
          
         nastepny.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                    
                
                
                    
                    if(Zasoby.level<5){
                        Zasoby.level = Zasoby.level + 1;
                      //  Animacja.poziom += 1;
                    }
                    else
                        System.out.println("Koniec gry");
                   
                   // Samochod samochod = new Samochod(); //zmienia sie samochod na kolejnym poziomie
                    Zasoby.start_animacji = false; 
                    dodajAnimacje(samochod,Zasoby.start_animacji,animowane);
                    sprawdz.setVisible(true);
                   add(gra);     
                }
            });
         
       nastepny.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent en) {
            //   wynik.setVisible(false);  
           }
       });
    
    JLabel coin = new JLabel(Zasoby.coin);
        wstawObiekt(870, 41, 118, 64, coin);
     
    
        JPanel alum = new JPanel();
        material_alu = new JComboBox();
        material_alu.addItem("1m^2");
        material_alu.addItem("2m^2");
        material_alu.addItem("3m^2");
        alum.add(material_alu);
        alum.setBounds(41,57,100,30);
        alum.setVisible(false);
        add(alum);
       
        JPanel drzewo = new JPanel();
        material_drewniany = new JComboBox();
        material_drewniany.addItem("1m^2");
        material_drewniany.addItem("2m^2");
        material_drewniany.addItem("3m^2");
        drzewo.add(material_drewniany);
        drzewo.setBounds(152,57,100,30);
        drzewo.setVisible(false);
        add(drzewo);
        
        typ_materialu = new String();
        
        JRadioButton wybierz_drewno = new JRadioButton("drewno");
        wybierz_drewno.setBounds(152,35,100,25);
        wybierz_drewno.setVisible(true);
        wybierz_drewno.setBackground(Color.WHITE);
        add(wybierz_drewno);
        
            wybierz_drewno.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                drzewo.setVisible(true);
                alum.setVisible(false);
                typ_materialu = "drewno";
    }
        });
        
        JRadioButton wybierz_alu = new JRadioButton("aluminium");
        wybierz_alu.setBounds(41,35,100,25);
        wybierz_alu.setVisible(true);
        wybierz_alu.setBackground(Color.WHITE);
        add(wybierz_alu);
        
        wybierz_alu.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                drzewo.setVisible(false);
                 alum.setVisible(true);
                 typ_materialu = "aluminium";
    }
        });
        
        ButtonGroup grupa = new ButtonGroup();
        grupa.add(wybierz_drewno);
        grupa.add(wybierz_alu);
       
        JLabel wood = new JLabel(Zasoby.wood);
        wstawObiekt(152, 57, 90, 90, wood);
    
        
    JLabel alu = new JLabel(Zasoby.aluminium);
        wstawObiekt(41, 57, 90, 90, alu);
       
        
        
    JLabel poziom = new JLabel(Zasoby.poziom1);
        wstawObiekt(449, 42, 133, 47, poziom);
   
        
        //przyciski menu 
        JLabel zakoncz = new JLabel(Zasoby.zakoncz); 
        wstawObiekt(40, 574, 316, 78, zakoncz);
        zakoncz.setVisible(false);
           kursorLapki(zakoncz);
           
        JLabel kontynuuj = new JLabel(Zasoby.kontynuuj);
        wstawObiekt(705, 574, 276, 78, kontynuuj);
        kontynuuj.setVisible(false);
           kursorLapki(kontynuuj);
           
        JLabel reset = new JLabel(Zasoby.reset);
        wstawObiekt(450, 574, 157, 78, reset);
        reset.setVisible(false);
           kursorLapki(reset);
           
        widocznosc_menu = true;
        JLabel menu = new JLabel(Zasoby.menu);
        wstawObiekt(785, 574, 201, 87, menu);
        menu.setVisible(widocznosc_menu);
            kursorLapki(menu);
        //obsluga przyciskow menu:
            //przycisk resetu:
         reset.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               Zasoby.level = 1;
               widocznosc_menu = true;
               menu.setVisible(widocznosc_menu);
               reset.setVisible(false);
               kontynuuj.setVisible(false);
               zakoncz.setVisible(false);
                 
         }
        });
        
            //przycisk zakonczenia gry:
         zakoncz.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               System.exit(0);
            }
        });
       
       
            //przycisk kontynuacji gry:
         kontynuuj.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               widocznosc_menu = true;
               menu.setVisible(widocznosc_menu);
               reset.setVisible(false);
               kontynuuj.setVisible(false);
               zakoncz.setVisible(false);
             
            }
        });
        
            //glowny przycisk menu
        menu.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                widocznosc_menu = false;
                menu.setVisible(widocznosc_menu);
                reset.setVisible(true);
                kontynuuj.setVisible(true);
                zakoncz.setVisible(true);
             
    }
        });
     

    
    add(gra);
    pack();
    setVisible(true); 
    
  }
    
    
    //tworzy nowy obiekt typu Label
   public void wstawObiekt (int x, int y, int w, int h, JLabel nazwa_obiektu){
       //kolor przezroczystosci
        Color c=new Color(0f,0f,0f,0f);
       /*pozycjonowanie  i wymiarowanie komponentów   za pomocą metody setBounds(x,y,w,h),
        gdzie x, y -  współrzędne położenia komponentu, w,h - szerokość i wysokość */
        nazwa_obiektu.setBounds(x,y,w,h);
        nazwa_obiektu.setBackground(c);
        add(nazwa_obiektu);
        
    
    }// koniec metody WstawObiekt() 
    
  
        void dodajPunkty(JLabel punkty){
            if(Zasoby.powodzenie == true){
                
                wstawObiekt(790, 53, 100, 54, punkty);
                punkty.setVisible(true);
                Punkty wynik = new Punkty();
                punkty.add(wynik);
            
            }
            
            else{
            
            }
        
        }//koniec dodajPunkty()
        
    
     void dodajAnimacje(Samochod samochod, boolean wystartuj, JLabel animowane){
       
        
          if(wystartuj  == true){
              samochod.setVisible(false); 
              wstawObiekt(0,190,1024,300,animowane); 
              animowane.setVisible(true);
               Animacja animacja = new Animacja();           
          //    animacja.zasadyRysowania(Zasoby.level);
              animacja.rysyj();
            //   animacja.zmienPolozenieY();
                animowane.add(animacja);
                
                }
          else if(wystartuj  == false){
              //  animowane.setVisible(false);
              animowane.setVisible(false);
              
                wstawObiekt(Zasoby.polozenie_samochodu, 190, 300, 300, samochod);
                samochod.setVisible(true);
                
             
                }
   
     }// koniec dodajAnimacje()
     
    void dodajMenu(JLabel wyjdz, JLabel nastepny, JLabel sprobuj){ 
        kursorLapki(wyjdz);
        kursorLapki(nastepny);
        kursorLapki(sprobuj);
        wyjdz.setVisible(true);
            if(Zasoby.powodzenie == true){
                nastepny.setVisible(true); 
                sprobuj.setVisible(false);
            }
            else  {
                sprobuj.setVisible(true);
                nastepny.setVisible(false); 
            } 
            
     }
     
     
     void kursorLapki(JLabel przycisk){
       przycisk.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e1)
    {
  
        e1.getComponent().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
    }
    public void mouseExited(MouseEvent e2)
    {
        e2.getComponent().setCursor(Cursor.getDefaultCursor());
    }
  });
     } 
     
    
     
}//koniec klasy Okno
    
    