package praticalofswing;

import javax.swing.*;
import java.awt.*;

public class Jbutton {

//1. buy constructor call

    Jbutton (){
      JFrame   f = new JFrame();

        JButton b = new JButton("click");
        b.setBounds(40,30,100,40);

        f.add(b);
        f.setSize(300,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
  new Jbutton();
// setLayout(new GridLayout());
//  setSize(300,400);
//  setVisible(true);
//  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
    }
}
