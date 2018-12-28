
package graedukacyjna;




import java.awt.*;
import static java.awt.Font.BOLD;
import static java.awt.Font.DIALOG;
import java.awt.event.*;
import javax.swing.*;


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
        dodajAnimacje(samochod,Zasoby.start_animacji);
        
    JLabel sprawdz = new JLabel(Zasoby.sprawdzenie);
        wstawObiekt(409, 142, 226, 42, sprawdz);    
        sprawdz.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            double odksztalcenie = samochod.obliczOdksztalcenie();
                System.out.println("Odksztalcenie wynosci: " + odksztalcenie );  
                 Zasoby.start_animacji= true;
        dodajAnimacje(samochod, Zasoby.start_animacji);
          add(gra);
   
    }   
        });
 
    
    JLabel coin = new JLabel(Zasoby.coin);
        wstawObiekt(865, 41, 118, 64, coin);
     
    
    JLabel punkty = new JLabel(liczPunkty(0,0));  
        punkty.setFont(new Font(DIALOG, BOLD, 32));
        wstawObiekt(815, 41, 118, 64, punkty);
        
         
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
        
        JLabel kontynuuj = new JLabel(Zasoby.kontynuuj);
        wstawObiekt(705, 574, 276, 78, kontynuuj);
        kontynuuj.setVisible(false);
        
        JLabel reset = new JLabel(Zasoby.reset);
        wstawObiekt(450, 574, 157, 78, reset);
        reset.setVisible(false);
        
        widocznosc_menu = true;
        JLabel menu = new JLabel(Zasoby.menu);
        wstawObiekt(785, 574, 201, 87, menu);
        menu.setVisible(widocznosc_menu);
    
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
    
  
   // po animacji wykonujemy obliczenie, dodajemy zdobyte punkty do poprzedniej liczby puntow
     public String liczPunkty(double czas_gry, double odksztalcenie) {
         //czas gry w sekundach
         String punkty="";
        
            Zasoby.liczba_punktow += Math.round(Zasoby.level*100 - czas_gry - odksztalcenie*10);
       
       punkty = String.valueOf(Zasoby.liczba_punktow);
      return punkty;
  }// koniec metody liczPunkty()
    
     void dodajAnimacje(Samochod samochod, boolean wystartuj){
         
          if(wystartuj  == true){ 
              samochod.setVisible(false);
       JLabel animowane =  new JLabel();
       Animacja animacja = new Animacja();
       animowane.add(animacja);
       wstawObiekt(0,190,1024,300,animowane); 
       animowane.setVisible(true);
  }
          else{
           wstawObiekt(Zasoby.polozenie_samochodu, 190, 300, 300, samochod);
          }
   
     }// koniec dodajAnimacje()
     
     
}//koniec klasy Okno
    
    