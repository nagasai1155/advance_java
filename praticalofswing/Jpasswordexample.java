package praticalofswing;

import javax.swing.*;

public class Jpasswordexample{
    public static void main(String args[]){

        JFrame f = new JFrame();
        JLabel l = new JLabel("password :");
        l.setBounds(60,100, 80,30);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(100,100,100,30);

        f.add(pf);
        f.add(l);

        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
    }
}
