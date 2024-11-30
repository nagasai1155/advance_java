package Swing;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Swing {

    public static void main(String args[]){
       Abc obj = new Abc();


    }
}
class Abc extends JFrame{
    Abc(){


        JFrame f = new JFrame();

        JLabel l = new JLabel("HELLO WORLD");
        JLabel l1  = new JLabel("welcome to here");
        add(l1);

        add(l);

        Font f3 = new Font("san-serif" ,Font.ITALIC,12);
        JButton jb1 = new JButton("ok");
        add(jb1);
        jb1.setFont(f3);

      setLayout(new GridLayout());
       setSize(300,400);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
