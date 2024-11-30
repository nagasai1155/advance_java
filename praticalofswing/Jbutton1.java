package praticalofswing;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

// 2.jframe in main method
public class Jbutton1 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        TextField tf=new TextField();
        tf.setBounds(50,50, 150,20);
        JButton b = new JButton("click");
        b.setBounds(540,430,100,40);
        TextField tf1=new TextField();
        tf1.setBounds(50,150, 150,20);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             String n=   tf.getText();
           tf1.setText(n);
            }
        });

        f.add(tf);
        f.add(b);
        f.add(tf1);
        f.setSize(300,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
