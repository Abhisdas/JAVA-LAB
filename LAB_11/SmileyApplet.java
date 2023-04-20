import java.applet.Applet;
import java.awt.*;

public class SmileyApplet extends Applet {

   public void paint(Graphics g) {
      int width = getWidth();
      int height = getHeight();

   
      g.setColor(Color.yellow);
      g.fillOval(50, 50, 200, 200);

   
      g.setColor(Color.black);
      g.fillOval(100, 100, 30, 30);
      g.fillOval(170, 100, 30, 30);

     
      g.setColor(Color.red);
      g.drawArc(100, 130, 100, 70, 0, -180);
   }
}
