/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

/**
 *
 * @author m304user
 */
      import java.awt.*;
import javax.swing.JFrame;
public class Akali extends Panel {
    public void paint (Graphics gail){
        
        gail.setColor(Color.BLACK);
        gail.fillRect(450, 200, 110, 15);
        gail.fillRect(410, 215, 70, 15);
        
        gail.setColor(Color.DARK_GRAY);
        gail.fillRect(465, 215, 100, 15);
        
        gail.setColor(Color.BLACK);
        gail.fillRect(560, 215, 45, 15);
        
        gail.setColor(Color.BLACK);
        gail.fillRect(395, 230, 30, 15);
        
        gail.setColor(Color.DARK_GRAY);
        gail.fillRect(425, 230, 150, 15);
        
        gail.setColor(Color.BLACK);
        gail.fillRect(575, 230, 80, 15);
    }
    public static void main(String args[]){
    JFrame frame = new JFrame();
    Akali panel = new Akali();
    panel.setBackground(Color.WHITE);
    frame.add(panel);
    frame.setSize(1000,1000);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 

