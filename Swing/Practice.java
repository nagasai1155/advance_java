package Swing;

import javax.swing.*;

import java.awt.*;

public class Practice{
    public static void main(String[] args) {
        Abcd obj = new Abcd();




    }
}

class Abcd extends JFrame{
    Abcd(){
        JFrame i = new JFrame();
         setLayout(new GridLayout());
          setSize(300,400);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}