package praticalofswing;

import javax.swing.*;
import java.awt.Color;
public class Colorclass {
    public static void main(String[] args) {
        JFrame f = new JFrame("color class");
        Color color = new Color(234,34,34);

        JButton B = new JButton("click");

        B.setBackground(color);
f.add(B);
B.setSize(50,60);
         //f.setLayout(new GridLayout());
          f.setSize(300,400);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
