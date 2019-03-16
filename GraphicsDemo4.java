/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsdemo4;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class GraphicsDemo4 extends JFrame implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            JOptionPane.showMessageDialog(null, "You have entered" + input.getText());
        }
        if (e.getSource() == cancel) {
            System.exit(0);
        }
    }
    
    Label label;
    TextField input;
    Button ok, cancel;
    
    public GraphicsDemo4() {
        label = new Label("Enter a no:");
        input = new TextField(20);
        ok = new Button("OK");
        cancel = new Button("Cancel");
        //this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //this.setLayout(new GridLayout(2,3));
        this.setLayout(new BorderLayout());
        this.add(label, BorderLayout.NORTH);
        this.add(input, BorderLayout.CENTER);
        
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(ok);
        panel.add(cancel);
        this.add(panel, BorderLayout.SOUTH);

        //this.setSize(300,150);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ok.addActionListener(this);
        cancel.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new GraphicsDemo4().show();
    }
    
}
