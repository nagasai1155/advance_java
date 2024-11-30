package praticalofswing;

import javax.swing.*;

public class Jlabel {
    public static void main(String args[]){

        JFrame f = new JFrame();
        JLabel l1 = new JLabel("first label");
        l1.setBounds(0,0,60,70);
        f.add(l1);

        JLabel l2 = new JLabel("second label");
        l2.setBounds(0,0,60,170);
        f.add(l2);

        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
