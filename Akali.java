import java.awt.*;
import javax.swing.JFrame;

public class Akali extends Panel {
   
    public void paint(Graphics g){
    g.setColor(Color.WHITE);
    g.fillArc(100, 100, 700, 800, 0, 180);
    
    g.setColor(new Color(109,219,87));
    g.fillRect(0, 500, 1500, 1500);
    
        g.setColor(Color.BLACK);
        g.fillRoundRect(325, 500, 80, 160,100,300);
        g.fillRoundRect(495, 500, 80, 160, 100, 140);
        
        g.setColor(Color.BLACK);
        g.fillArc(200, 360, 180, 50, 40, 360);
        g.fillArc(520, 360, 180, 50, 150, 360);
        
        g.setColor(Color.BLACK);
        g.fillRect(325, 310, 250, 255);
        
        g.setColor(Color.BLACK);
        g.fillOval(300, 150, 300, 280);
        g.setColor(Color.DARK_GRAY);
        g.drawOval(300, 150, 300, 280);
        
     
        
        g.setColor(new Color(193,171,116));
        g.fillArc(355, 190, 190, 180, 0, -180);
        
         g.setColor(Color.BLACK);
      g.fillOval(390, 310, 10, 10);
      g.fillOval(500, 310, 10, 10);
        
    }
     public static void main(String[] args) {
       JFrame frame= new JFrame();
       Akali panel = new Akali ();
       panel.setBackground(new Color(63,53,15));
        
       frame.add(panel);
       frame.setTitle("Akali");
       frame.setSize(1000, 1000);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     }
}
