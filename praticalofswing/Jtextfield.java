package praticalofswing;

import javax.swing.*;

public class Jtextfield {
    public static void main(String args[]){

        JFrame f = new JFrame();

        JTextField tf = new JTextField("firsttextfield");
        JTextField tf1 = new JTextField("secondtextfield");

        tf.setBounds(100,100,200,50);
        tf1.setBounds(100,200,200,70);

        f.add(tf);f.add(tf1);

        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
