package praticalofswing;

import javax.swing.*;
import java.awt.*;

public class Jpannel2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("jpanelexample");
        JPanel p = new JPanel();

        p.setBounds(40,50,279,189);
        p.setBackground(Color.orange);

        f.add(p);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
