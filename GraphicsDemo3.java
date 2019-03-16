
package graphicsdem03;

/**
 *
 * @author m304user
 */

import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class GraphicsDem03 extends Panel implements KeyListener{
    static int y=200, x=200, sa = 23, mouth = 315;
    static String name ="";
    
   public GraphicsDem03(){
     this.setBackground(new Color(0,0,0));
     this.addKeyListener(this);
}
    public void paint(Graphics g){
        g.setColor(new Color(255, 255, 0));
        g.fillArc(x, y, 100, 100, sa, mouth);
        g.setFont(new Font("Times New Roman", Font.BOLD,20));
        g.drawString("Score: ", 450, 20);
        g.drawString(name, 20, 20);
    }
    
    public static void main(String[] args){
        name = JOptionPane.showInputDialog("Enter your name:");
        
            JFrame frame = new JFrame();
            GraphicsDem03 panel = new GraphicsDem03();
            frame.add(panel);
            frame.setSize(500, 500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    }
     @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP){
        if(y<=0)
             y = getHeight();
        else
            y-=5;
       
        sa = 113;
        if(y % 2 == 0)
            mouth = 315;
        else
            mouth = 360;
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            if(y>= getHeight()-100)
               y= -100;
         else   
        y+=5;
        sa =293;
        if(y % 2 == 0)
            mouth = 315;
        else
            mouth = 360;
        
        } 
        
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
        if(x<=0)
             x = getHeight();
        else
          
         x-=5;
        sa = 203;
         if(x % 2 == 0)
            mouth = 315;
        else
            mouth = 360;
        
        }
        
         if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            if(x>= getHeight()-100)
               x= -100;
         else   
       
        x+=5;
        sa =23;
         if(x % 2 == 0)
            mouth = 315;
        else
            mouth = 360;
        
    }
       repaint(); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
