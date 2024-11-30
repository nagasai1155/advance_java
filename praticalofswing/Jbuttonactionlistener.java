package praticalofswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jbuttonactionlistener {
    public static void main(String[] args) {
        JFrame f = new JFrame("action listener");
        JTextField tf = new JTextField();
        tf.setBounds(50,50,100,100);

        f.add(tf);
        JButton b = new JButton("click");
        b.setBounds(50,100,100,100);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("hello world");
            }
        });


       f.setLayout(null);
         //f.setLayout(new GridLayout());
          f.setSize(300,400);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
