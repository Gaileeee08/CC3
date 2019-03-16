
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
public class GraphicsDemo1 extends Panel {
   public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.drawLine(250, 0, 250, 300);
        g.setColor(Color.PINK);
        g.drawLine(0, 140, 500, 140);
        g.fillRect(10, 10, 100, 100);
        g.fillOval(260, 10, 100, 100);
        int[] x = {125, 25, 225};
        int[] y = {150, 250 , 250};
        g.fillPolygon(x, y, 3);
        g.fillArc(250, 150, 100, 100, 180, 180);
    }
    public static void main(String args[]){
        Frame frame =  new Frame();
        GraphicsDemo1 panel = new GraphicsDemo1();
        panel.setBackground(Color.GRAY);
        frame.add(panel);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
