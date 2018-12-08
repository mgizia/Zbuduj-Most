
package graedukacyjna;



import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Martyna Giziewicz
 */
public class Okno extends JFrame {
    
    
    public Okno(String fname, int szerokosc, int wysokosc, int xcenter, int ycenter) {
    super();
    Color c=new Color(0f,0f,0f,0f);

    setResizable(false); //zablokuj mozliwosc zmian rozmiaru okna
    setSize(szerokosc, wysokosc); //ustaw wymiary okna
    setLocation(xcenter,ycenter); //ustaw pozycje okna
    setUndecorated(true); //ukryj ramke okna i przyciski kontrolne
    
    StworzPanel gra = new StworzPanel(fname,szerokosc,wysokosc);
    //ustawienia Layoutu dla panelu gra
    gra.setLayout(null);
    /*W takim kontenerze pobsługujemy się "absolutnym"
    pozycjonowaniem  i wymiarowaniem komponentów  np. za pomocą metody setBounds(x,y,w,h),
    gdzie x, y -  współrzędne położenia komponentu, w,h - szerokość i wysokość.*/
    //dodawanie kolejnych labeli do panelu gry
    //samochod- obiekt klasy JLabel, będzie zmieniał położenie 
    JLabel samochod = new JLabel(Zasoby.car1);
    samochod.setBounds(700, 190,300,300);
    samochod.setBackground(c);
    gra.add(samochod);
    
    JLabel coin = new JLabel(Zasoby.coin);
    coin.setBounds(830,41,118,64);
    coin.setBackground(c);
    gra.add(coin);
    
    JLabel alu = new JLabel(Zasoby.aluminium);
    alu.setBounds(41,57,90,90);
    alu.setBackground(c);
    gra.add(alu);
    
    
    JLabel wood = new JLabel(Zasoby.wood);
    wood.setBounds(152,57,90,90);
    wood.setBackground(c);
    gra.add(wood);
    
    JLabel poziom = new JLabel(Zasoby.poziom1);
    poziom.setBounds(449,42,133,47);
    poziom.setBackground(c);
    gra.add(poziom);
    
    JLabel menu = new JLabel(Zasoby.menu);
    menu.setBounds(785,574,201,87);
    menu.setBackground(c);
    gra.add(menu);
   
    add(gra);
    pack();
    setVisible(true);
    
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