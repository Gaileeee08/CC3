/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m304user
 */

import java.awt.*;

public class HappyFace extends Panel{
    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(95 , 100, 300, 300);
        
        g.setColor(Color.red);
        g.fillRect(130, 180, 70, 70);
        g.setColor(Color.red);
        g.fillRect(290, 180, 70, 70);
        
        g.setColor(Color.BLUE);
        int[] x = {250,300,200};
        int[] y = {220,290,290};
        g.fillPolygon(x, y, 3);
        
        g.setColor(Color.BLACK);
        g.fillArc(160, 23, 180, 150, 180, 180);
        
    }
    public static void main(String args[]){
        Frame frame =  new Frame();
        HappyFace panel = new HappyFace();
        panel.setBackground(Color.WHITE);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
}
}
