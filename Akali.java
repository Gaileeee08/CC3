
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Akali extends Panel implements KeyListener {

    static String name = "";
    static Color color;
     static JLabel label1;
     static int a = 360;
   
    
    public Akali(){
       this.addKeyListener(this);
       
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillArc(100, 100, 700, 800, 0, 180);

        //body
        g.setColor(new Color(109, 219, 87));
        g.fillRect(0, 500, 1500, 1500);

        //legs
        g.setColor(color);
        g.fillRoundRect(325, 500, 80, 160, 100, 300);
        g.fillRoundRect(495, 500, 80, 160, 100, 140);
        
        //arms
        g.setColor(color);
        g.fillArc(200, 360, 180, 60, 40, a); //200 , 360 ,180, 60, 40, a=360
        g.fillArc(520, 360, 180, 60, 150, a); // 520 , 360 ,180, 60, 150, b =360

        g.setColor(color);
        g.fillRect(325, 310, 250, 255);

        //face
        g.setColor(color);
        g.fillOval(300, 150, 300, 280);
        g.setColor(Color.DARK_GRAY);
        g.drawOval(300, 150, 300, 280);

        //eyes and face color
        g.setColor(new Color(193, 171, 116));
        g.fillArc(355, 190, 190, 180, 0, -180);

        g.setColor(Color.BLACK);
        g.fillOval(390, 310, 10, 10);
        g.fillOval(500, 310, 10, 10);
        
       
        
        //name
        g.setColor(Color.BLACK);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Hi My Name is:", 100, 100);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString(name, 305, 100);
        
    }

    public static void main(String[] args) {
        name = JOptionPane.showInputDialog("Enter your Name:");
        JFrame frame = new JFrame();
        String choice = JOptionPane.showInputDialog("Enter a Color");
        if (choice.equalsIgnoreCase("Blue")) {
            color = Color.BLUE;
        } else if (choice.equalsIgnoreCase("Light_Gray")) {
            color = Color.LIGHT_GRAY;
        } else if (choice.equalsIgnoreCase("Red")) {
            color = Color.RED;
        } else if (choice.equalsIgnoreCase("Gray")) {
            color = Color.GRAY;
        } else if (choice.equalsIgnoreCase("Black")) {
            color = Color.BLACK;
        }
        
        
        
        
        
        
        
        
        Akali panel = new Akali();
        panel.setBackground(new Color(63, 53, 15));
        frame.add(panel);
        frame.setTitle("Akali");
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            a = 360;
         
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            a = 200;
           
            
        }
        repaint();
    }
    

    @Override
    public void keyReleased(KeyEvent e) {
           }
}
