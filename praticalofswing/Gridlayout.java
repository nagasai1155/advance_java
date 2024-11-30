package praticalofswing;

import javax.swing.*;
import java.awt.*;

public class Gridlayout {
    public static void main(String[] args) {
        JFrame f = new JFrame("gridlayout");
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("WEST");
        JButton b4 = new JButton("EAST");
        JButton b5 = new JButton("CENTER");

        f.setLayout(new GridLayout(2,2));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
