
package graedukacyjna;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Martyna Giziewicz
 */
public class StworzPanel extends JPanel {
  Image img ;
  boolean loaded = false; // czy obrazek został załadowany?

  public StworzPanel(String imgFileName, int weight, int height ) {
    loadImage(imgFileName, weight, height);
  }
 
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (img != null && loaded)
      g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
  
    else
      g.drawString("Brak obrazka", 10, getHeight() - 10);
  }

  private void loadImage(String imgFileName, int w, int h) {
    img = Toolkit.getDefaultToolkit().getImage(imgFileName);
    MediaTracker mt = new MediaTracker(this);
    mt.addImage(img, 1);
    try {
      mt.waitForID(1);
    } catch (InterruptedException exc) {
    }
    //int w = img.getWidth(this); // szerokość obrazka
    //int h = img.getHeight(this); // wysokość obrazka
    if (w != -1 && w != 0 && h != -1 && h != 0) {
      loaded = true;
      setPreferredSize(new Dimension(w, h));
    } else
      setPreferredSize(new Dimension(200, 200));
  }

 
}//koniec klasy StworzPanel
