package praticalofswing;

import javax.swing.*;
import java.awt.*;
public class Borderlayout {
    public static void main(String[] args) {

        JFrame  f = new JFrame("border layout");
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("WEST");
        JButton b4 = new JButton("EAST");
        JButton b5 = new JButton("CENTER");

        f.setLayout(new BorderLayout(4,7));
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.EAST);
        f.add(b5,BorderLayout.CENTER);

          f.setSize(300,400);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
