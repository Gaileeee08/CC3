package ira;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ira extends Panel implements KeyListener{
    static String name;
   static Color color1;
    static Color color2;
    static String color3;
     static String color;
    static JLabel label1;
    static int a=40;
    static int b=100;
    static int z=0;
     static int c=0;
     static int l=0;
     static int n=0;
        static int v=0;
        static int x=0;
        static int o=350;
        static int p=60;
        
 public Ira(){
       this.addKeyListener(this);
 }
    @Override
    public void paint(Graphics g){
            g.setColor(Color.RED);
            g.setFont(new Font("Impact", Font.BOLD,30));
            g.drawString(name, 200, 25);
       
            g.setColor(color1);
            g.fillOval(75,150, 80,80);//hair
            g.fillOval(60, 200, 50,50);//hair

            g.fillOval(300,150, 80,80);
            g.fillOval(350, 200, 50,50);
        
            g.setColor(new Color(255  ,218,185));
            g.fillRect(205,300,40,40);//neck
            g.fillOval(100, 40, 250, 270);    
            g.fillOval(96, 40, 260, 210);    
       
     
      
            g.setColor(Color.BLACK);
            g.fillRect(135, 160, 70, 50);//LEFT E g.drawRectYE 
            g.fillRect(235,160, 70, 50);//RIGHT EYE
        
            g.drawArc(205,300,40,40,0,-180);//sa
       
      
     
            g.setColor(new Color(255  ,218,185));
            g.fillRect(140, 165, 60, 40);//LEFT E g.drawRectYE 
            g.fillRect(240,165, 60, 40);//RIGHT EYE
        
            g.setColor(Color.BLACK);
            g.fillArc(150, 160, 40, 50, 360, 360);//PUPIL
            g.fillArc(250, 160, 40, 50, 360, 360);
      
            g.drawLine(200, 200, 238, 200);
      
            g.setColor(Color.WHITE);
       
            g.fillArc(155, 165, 30, 40, 360, 360);//PUPIL
            g.fillArc(255, 165, 30, 40, 360, 360);
     
            g.setColor(Color.BLACK);
            g.drawArc(205, 210, 30, 30, 7, -187);//nose
            g.fillArc(155, 165, 30, 30, 360, 360);//PUPIL
            g.fillArc(255, 165, 30, 30, 360, 360);
      
              g.setColor(color1);
            g.fillArc(90, 30, 270,250  , 0, 180);
       
            g.setColor(Color.WHITE);
            g.fillArc(160, 165, 20, 20, 360, 360);//PUPIL
            g.fillArc(260, 165, 20, 20, 360, 360);
      
            g.setColor(Color.BLACK);
            g.fillArc(175, 205, 100, 80, 180, 180);//MOUTH
           
           g.setColor(new Color(86, 53, 53));
              g.fillArc(z,c ,v, l, n, n);//MOUTH    z=250 c=180 v=40   l=60   n=180 n=180
               g.fillArc(x, c, v, l, n, n);//MOUTH     x=150 c=180  v=40 l=60   n=180 n= 180
            g.setColor(Color.RED);
            g.fillArc(180, 215, 90, 70, 180, 180);//MOUTH
     
            g.setColor(Color.WHITE);
            g.fillRect(200, 250, 20, 20);
            g.fillRect(230, 250, 20, 20);
         
            g.setColor(color2);
            g.fillRoundRect(155, 335, 150, 200, 50, 50);
           
            g.setColor(new Color(255  ,218,185));
            g.fillArc(272, 335, 65, 50, 90, 180);
            g.fillArc(122, 335, 65, 50, 90, -180);
            
            g.fillRoundRect(273, 335, 100, 40, 50, 50);
            g.fillRoundRect(88, 335, 100, 40, 50, 50);
              
            g.fillRoundRect(340, 265, a ,b, 50, 50);
            g.fillRoundRect(82, 265, 40, 100, 50, 50);
                 
            g.fillArc(o, 250, 60,50 , 360, 360);
            g.fillArc(p, 250, 60, 50, 360, 360);
             
                       
                int[] x = {220, 150, 250};
                int[] y = {60, 155, 155};
                 g.fillPolygon(x, y, 3);
    }
    public static void main(String[] args) {
        name = JOptionPane.showInputDialog("Enter your name:");
      color = JOptionPane.showInputDialog(null,"Choose Hair color between :pink,cyan,purple and gray");
       color3= JOptionPane.showInputDialog(null,"Choose Dress color between: pink,cyan,purple and gray");
   
      
       color1 = colorPicker(color);
       color2=colorPicker(color3);
      JFrame frame=new JFrame();
      frame.setSize(500,500);
      Ira panel=new Ira();
   
       panel.setBackground(Color.blue);
      frame.add(panel);
       frame.setVisible(true);
    }
 public static Color colorPicker(String choice){
        switch(choice){
            case "pink":
                return new Color (204,0,204);
            case "gray":
                return new Color(128,128,128);
                
            case "cyan":
                return new Color (0,255,255);
                
             case "purple":
                 return new Color (127,0,255);
               
             default:
                 return Color.BLACK;
               
        }
 }
    @Override
    public void keyTyped(KeyEvent i) {
     
    }

    @Override
    public void keyPressed(KeyEvent i) {
               if(i.getKeyCode() == KeyEvent.VK_UP){
                          z=250; 
                          c=180;
                          v=40;
                          l=60;
                          n=180;
                          x=150 ;
                         o=80; 
                         p=320;
               }
                
                        if(i.getKeyCode() == KeyEvent.VK_DOWN){
                          z=0; 
                          c=0;
                          v=0;
                          l=0;
                          n=0;
                          x=0 ;
                         o=60; 
                         p=350;
         
               }
     
        
           
            
        
        
        repaint();
      
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

         
     
        
    

    }

