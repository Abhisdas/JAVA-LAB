import java.applet.Applet;
import java.awt.*;

public class q2 extends Applet {

   public void paint(Graphics g) {
      int width = getWidth();
      int height = getHeight();
      
     
      int x = (int) (Math.random() * width);
      int y = (int) (Math.random() * height);
      int w = (int) (Math.random() * (width - x));
      int h = (int) (Math.random() * (height - y));
      Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
      g.setColor(color);
      g.fillRect(x, y, w, h);
      
     
      x = (int) (Math.random() * width);
      y = (int) (Math.random() * height);
      w = (int) (Math.random() * (width - x));
      h = (int) (Math.random() * (height - y));
      color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
      g.setColor(color);
      g.drawRoundRect(x, y, w, h, 20, 20);
      
    
      x = (int) (Math.random() * width);
      y = (int) (Math.random() * height);
      w = (int) (Math.random() * (width - x));
      h = (int) (Math.random() * (height - y));
      color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
      g.setColor(color);
      g.draw3DRect(x, y, w, h, true);
      
    
      x = (int) (Math.random() * width);
      y = (int) (Math.random() * height);
      w = (int) (Math.random() * (width - x));
      h = (int) (Math.random() * (height - y));
      color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
      g.setColor(color);
      g.drawRect(x, y, w, h);
   }
}
