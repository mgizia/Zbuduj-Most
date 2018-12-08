
package graedukacyjna;



import java.awt.*;
import static java.awt.Font.BOLD;
import static java.awt.Font.DIALOG;
import javax.swing.*;


/**
 *
 * @author Martyna Giziewicz
 */
public class Okno extends JFrame {
    
    
    public Okno(String fname, int szerokosc, int wysokosc, int xcenter, int ycenter) {
    super();
  

    setResizable(false); //zablokuj mozliwosc zmian rozmiaru okna
    setSize(szerokosc, wysokosc); //ustaw wymiary okna
    setLocation(xcenter,ycenter); //ustaw pozycje okna
    setUndecorated(true); //ukryj ramke okna i przyciski kontrolne
    
    StworzPanel gra = new StworzPanel(fname,szerokosc,wysokosc);
    //ustawienia Layoutu dla panelu gra
    gra.setLayout(null);
    /*W takim kontenerze pobsługujemy się "absolutnym"
    pozycjonowaniem  i wymiarowaniem komponentów  np. za pomocą metody setBounds(x,y,w,h)*/
    
    //dodawanie kolejnych labeli do panelu gry
    
    //samochod- obiekt klasy JLabel, będzie zmieniał położenie 
    /*JLabel samochod = new JLabel(Zasoby.car1);
        wstawObiekt(700, 190, 300, 300, samochod);
        add(samochod) */
   
        //JLabel samochod = new JLabel(Zasoby.car1);
        
        int a = 800;
        
        Samochod samochod = new Samochod();
        wstawObiekt(a, 190, 300, 300, samochod);
        
  
    
    JLabel coin = new JLabel(Zasoby.coin);
        wstawObiekt(865, 41, 118, 64, coin);
     
    
    JLabel punkty = new JLabel(liczPunkty());  
        punkty.setFont(new Font(DIALOG, BOLD, 32));
        wstawObiekt(815, 41, 118, 64, punkty);
       
        
    JLabel alu = new JLabel(Zasoby.aluminium);
        wstawObiekt(41, 57, 90, 90, alu);
        
    
    JLabel wood = new JLabel(Zasoby.wood);
        wstawObiekt(152, 57, 90, 90, wood);
        
    
    JLabel poziom = new JLabel(Zasoby.poziom1);
        wstawObiekt(449, 42, 133, 47, poziom);
      
        
    
    JLabel menu = new JLabel(Zasoby.menu);
        wstawObiekt(785, 574, 201, 87, menu);
       
    
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
    
   //ta metoda będzie dostawała int; po animacji wykonujemy obliczenie, dodajemy do poprzedniej liczby puntow
     public String liczPunkty() {
         
         String punkty;
         int liczba_punktow;
            liczba_punktow = 100;
       
          
        
        punkty = String.valueOf(liczba_punktow);
      return punkty;
  }
    
}
    
    
    
    
    
   
    
    
    
    
    
    /*
    String nazwa = "Zbuduj Most!";
    //konstruktor klasy poziom
   public Okno(int szerokosc, int wysokosc,int xcenter, int ycenter)
    {
     
   
        super(); //metoda super wywołuje konstruktor nadklasy- tworzy okno
        setResizable(false); //zablokuj mozliwosc zmian rozmiaru okna
        setSize(szerokosc, wysokosc); //ustaw wymiary okna
        setLocation(xcenter,ycenter); //ustaw pozycje okna
        setTitle(nazwa);
        setVisible(true);
       // setUndecorated(true); //ukryj ramke okna i przyciski kontrolne
       //budujInterface(szerokosc,wysokosc);
       
       
       
       // setVisible(true); //pokaz okno
      //  animationLoop(); //uruchom pÄ™tlÄ™ animacji gry
        
        ImageIcon tloIcon=new ImageIcon( Zasoby.background);
        StworzPanel pierwszy = new StworzPanel(tloIcon);
        
        
        
        
  }//koniec  konstruktora poziom
    
  private void budujInterface(int szer, int wys){
        setLayout(new GridLayout(1,1)); //ustaw rozkĹ‚ad 
        
        Toolkit tk = Toolkit.getDefaultToolkit();
       
        //add(new StworzProjekt(szer,wys))
   }//koniec budujInterface

   public static void rysujGre(){
        Graphics gs = null;
        Graphics2D g=(Graphics2D)gs;
        
      //  g.getPaint();
    
}//koniec rysujGre()

  
}//koniec klasy Okno */