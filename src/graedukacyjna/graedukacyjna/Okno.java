
package graedukacyjna;




import java.awt.Cursor;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import static java.awt.Font.BOLD;
import static java.awt.Font.DIALOG;

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
         
        JLabel samochod = new JLabel();
        wstawObiekt(Zasoby.polozenie_samochodu, 185, 300, 300, samochod);
             Samochod bezanimacji = new Samochod();
                samochod.add(bezanimacji);
                    samochod.setVisible(true);
        
        JLabel animowane =  new JLabel();
            animowane.setVisible(false);
        
        JLabel animowane_zle =  new JLabel();
         animowane_zle.setVisible(false);
        
        dodajAnimacje(samochod,Zasoby.start_animacji,animowane,animowane_zle);
     
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

        JLabel punkty = new JLabel();
            punkty.setVisible(false);
      
        //wyswietla wynik
        sprawdz.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               double odksztalcenie = bezanimacji.obliczOdksztalcenie();
                wstawObiekt(815, 41, 118, 64, punkty);
                    Zasoby.start_animacji = true;
                       
                        dodajPunkty(punkty);
                        dodajAnimacje(samochod, Zasoby.start_animacji, animowane,animowane_zle);
                        dodajMenu(wyjdz,nastepny,sprobuj);
                        if(Zasoby.powodzenie == false){
                          gra.img = Zasoby.background.getImage();
                       }
                        else{
                            gra.img = Zasoby.tlo_zmostem.getImage();
                        }
                    sprawdz.setVisible(false);
                    add(gra);
                    System.out.println("Odksztalcenie wynosci: " + odksztalcenie );      
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
                   dodajAnimacje(samochod,Zasoby.start_animacji,animowane,animowane_zle);
                    sprawdz.setVisible(true);   
                   add(gra);  
                     gra.img = Zasoby.tlo_zmostem.getImage();
                     sprobuj.setVisible(false);
                     wyjdz.setVisible(false);
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
               
        JLabel poziom = new JLabel(Zasoby.poziom1);
             Poziom nowy_poziom = new Poziom();
                 poziom.add(nowy_poziom);
                   wstawObiekt(449, 42, 133, 47, poziom);
                   
        JLabel koniec = new JLabel("Ukończono grę! Gratulacje!");
        koniec.setVisible(false);
        
         nastepny.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                   Zasoby.level = Zasoby.level + 1; 
                   dodajPoziom(poziom);
                   if(Zasoby.level<=5){
                         sprawdz.setVisible(true);
                    }
                    else{
                        System.out.println("Koniec gry");
                        sprawdz.setVisible(false);
                        animowane.setVisible(false);
                        animowane_zle.setVisible(false);
                        zakoncz.setVisible(true);
                        reset.setVisible(true);
                        menu.setVisible(false);
                        wstawObiekt(300,300,800,100,koniec);
                             koniec.setFont((new Font(DIALOG, BOLD, 32)));
                               koniec.setVisible(true);
                        
                    }
                   Zasoby.powodzenie = false;
                   Zasoby.start_animacji = false; 
                   dodajAnimacje(samochod,Zasoby.start_animacji,animowane,animowane_zle);
                   
                   nastepny.setVisible(false);
                   wyjdz.setVisible(false);
                   add(gra);     
                   gra.img = Zasoby.tlo_zmostem.getImage();
                  
                
                }
            });
    
      reset.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               Zasoby.level = 1;
               widocznosc_menu = true;
               menu.setVisible(widocznosc_menu);
               reset.setVisible(false);
               kontynuuj.setVisible(false);
               zakoncz.setVisible(false);
                 dodajPoziom(poziom);
                
                 sprawdz.setVisible(true);
                 koniec.setVisible(false);
                 Zasoby.powodzenie = false;
                 Zasoby.start_animacji = false; 
                 dodajAnimacje(samochod,Zasoby.start_animacji,animowane,animowane_zle);
                 
                 Zasoby.liczba_punktow = 0;
                 punkty.setVisible(false);
            
                 add(gra);
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
        
    
     void dodajAnimacje(JLabel samochod, boolean wystartuj, JLabel animowane, JLabel animowane_zle){
       
        
          if(wystartuj  == true){
              samochod.setVisible(false); 
                  if(Zasoby.powodzenie == true){
                        
                        wstawObiekt(0,185,1024,300,animowane); 
                         Animacja animacja = new Animacja();    
                         animacja.rysyjDobra(); 
                         animowane.add(animacja);
                         animowane.setVisible(true);
                         animowane_zle.setVisible(false);
                     }
                    else{    
                        
                        wstawObiekt(0,185,1024,300,animowane_zle); 
                         Niepowodzenie ani = new Niepowodzenie();
                         ani.rysyjZla();
                         animowane_zle.add(ani);
                         animowane.setVisible(false);
                         animowane_zle.setVisible(true);
                     }
                
                }
          else if(wystartuj  == false){
                animowane_zle.setVisible(false);
                animowane.setVisible(false); 
                wstawObiekt(Zasoby.polozenie_samochodu, 185, 300, 300, samochod);
                samochod.setVisible(true);
                   Samochod bezanimacji = new Samochod();
                   samochod.add(bezanimacji);
                
             
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
     
    void dodajPoziom(JLabel poziom){      
                 wstawObiekt(449, 42, 133, 47, poziom);
                   Poziom nowy_poziom = new Poziom();
                   poziom.add(nowy_poziom);
                   poziom.setVisible(true);
    }//koniec dodajPoziom()
     
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
    
    