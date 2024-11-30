package praticalofswing;

import javax.swing.*;

public class Jtextarea {
    public static void main(String args[]){


        JFrame f = new JFrame();
        JLabel l = new JLabel("xx");
        l.setBounds(20,30,80,60);
        JTextArea ta = new JTextArea();
        ta.setBounds(40,50,230,20);

        f.add(ta);f.add(l);

        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
